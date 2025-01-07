package CursoEmVideoPOO.Aula06;

public class Main {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.turnOn();
        remoteControl.volumeUp();
        remoteControl.openMenu();
        remoteControl.turnOnMute();
        remoteControl.play();
        remoteControl.openMenu();
        remoteControl.closeMenu();

    }
}
