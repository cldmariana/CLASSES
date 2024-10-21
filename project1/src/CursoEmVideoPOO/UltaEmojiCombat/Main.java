package CursoEmVideoPOO.UltaEmojiCombat;

public class Main {
    public static void main(String[] args) {

        Fighter[] fighter = new Fighter[6];

        fighter[0] = new Fighter(
                "PRETTY BOY",
                "FRANCE",
                31,
                175f,
                68.9f,
                11,
                2,
                1,
                100);

        fighter[1] = new Fighter(
                "PUTSCRIPT",
                "BRAZIL",
                29,
                168f,
                57.8f,
                14,
                3,
                1,
                100);

        fighter[2] = new Fighter(
                "SNAPSHADOW",
                "USA",
                35,
                165f,
                80.9f,
                12,
                2,
                1,
                100);

        fighter[3] = new Fighter(
                "DEAD CODE",
                "AUSTRALIA",
                28,
                195f,
                81.6f,
                13,
                0,
                2,
                100);

        fighter[4] = new Fighter(
                "UFOCOBOL",
                "BRAZIL",
                37,
                170f,
                119.3f,
                5,
                4,
                3,
                100);

        fighter[5] = new Fighter(
                "NERDAAD",
                "USA",
                30,
                181f,
                105.7f,
                12,
                2,
                4,
                100);


        Fight UEC_01 = new Fight();
        UEC_01.scheduleFight(fighter[2], fighter[3]);
        UEC_01.fight();
        //fighter[2].status();
        //fighter[3].status();

    }
}
