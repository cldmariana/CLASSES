package CursoEmVideoPOO.UltaEmojiCombat;

import java.util.Objects;
import java.util.Random;

public class Fight {

    private Fighter fighter1;
    private Fighter fighter2;
    private Fighter currentFighter;
    private Fighter opponent;
    private int rounds;
    private boolean approvedFight;

    public Fighter getFighter1() {
        return fighter1;
    }

    public void setFighter1(Fighter fighter1) {
        this.fighter1 = fighter1;
    }

    public Fighter getFighter2() {
        return fighter2;
    }

    public void setFighter2(Fighter fighter2) {
        this.fighter2 = fighter2;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApprovedFight() {
        return approvedFight;
    }

    public void setApprovedFight(boolean approvedFight) {
        this.approvedFight = approvedFight;
    }


    public void scheduleFight(Fighter fighter1, Fighter fighter2) {
        if (Objects.equals(fighter1.getCategory(), fighter2.getCategory()) && fighter1 != fighter2) {
            this.approvedFight = true;
            this.fighter2 = fighter1;
            this.fighter1 = fighter2;
            System.out.println("FIGHT SCHEDULED BETWEEN " + fighter1.getName() + " AND " + fighter2.getName());
        } else {
            this.approvedFight = false;
            this.fighter2 = null;
            this.fighter1 = null;
            System.out.println("Not approved fight");
        }
    }

    public void switchTurn() {
        if (currentFighter == fighter1) {
            currentFighter = fighter2;
            opponent = fighter1;
        } else {
            currentFighter = fighter1;
            opponent = fighter2;
        }
    }

    public void fight() {
        if (approvedFight) {
            System.out.println("Challenger: ");
            this.fighter1.introduce();
            System.out.println("Challenged: ");
            this.fighter2.introduce();
            Random random = new Random();
            int randomNumber = random.nextInt(2);
            switch (randomNumber) {
                case 0:
                    currentFighter = fighter1;
                    opponent = fighter2;
                    break;
                case 1:
                    currentFighter = fighter2;
                    opponent = fighter1;
                    break;
            }

            while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
                int damage = (int) (1 + Math.random() * (25 - 1));
                currentFighter.attack(opponent, damage);
                switchTurn();
            }

            if (fighter1.getHealth() < 0) {
                System.out.println(fighter2.getName() + " wins");
                fighter1.loseFight();
                fighter2.winFight();
            } else if (fighter2.getHealth() < 0) {
                System.out.println(fighter1.getName() + " wins");
                fighter2.loseFight();
                fighter1.winFight();
            }
        }
    }
}