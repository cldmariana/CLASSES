package CursoEmVideoPOO.Aula06;

public class RemoteControl implements Controller {

    private int volume;
    private boolean turnOn;
    private boolean playing;


    public RemoteControl() {
        this.volume = 50;
        this.turnOn = false;
        this.playing = false;
    }


    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isTurnOn() {
        return turnOn;
    }

    private void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    private boolean isPlaying() {
        return playing;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public void turnOn() {
        this.setTurnOn(true);
    }

    @Override
    public void turnOff() {
        this.setTurnOn(false);
    }

    @Override
    public void openMenu() {
        System.out.println("-------MENU-------");
        System.out.println("Is it turned on? " + this.isTurnOn());
        System.out.println("Is it playing? " + this.isPlaying());
        System.out.println("Volume " + this.getVolume());
//        for (int i = 0; i <= this.getVolume(); i += 10) {
//            System.out.println("|");
//        }
        System.out.println("------------------");
    }

    @Override
    public void closeMenu() {
        System.out.println("Closing menu...");
    }

    @Override
    public void volumeUp() {
        if (this.isTurnOn()) {
            setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Cannot increase the volume. Device turned off");
        }
    }

    @Override
    public void volumeDown() {
        if (this.isTurnOn()) {
            setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Cannot decrease the volume. Device turned off");
        }
    }

    @Override
    public void turnOnMute() {
        if (this.isTurnOn() && this.getVolume() > 0) {
            setVolume(0);
        } else {
            System.out.println("Cannot turn mute on. Device turned off");
        }
    }

    @Override
    public void turnOffMute() {
        if (this.isTurnOn() && this.getVolume() == 0) {
            setVolume(50);
        } else {
            System.out.println("Cannot turn mute off. Device turned off");
        }
    }

    @Override
    public void play() {
        if (this.isTurnOn() && !(this.isPlaying())) {
            setPlaying(true);
        } else {
            System.out.println("You can't play. Device turned off");
        }
    }

    @Override
    public void pause() {
        if (this.isTurnOn() && this.isPlaying()) {
            setPlaying(false);
        } else {
            System.out.println("You can't pause. Device turned off");
        }
    }
}