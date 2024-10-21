package CursoEmVideoPOO.UltaEmojiCombat;

public class Fighter {

    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int wins, defeats, draws;
    private int damage;
    private int health;

    public Fighter(String name, String nationality, int age, float height, float weight, int wins, int defeats, int draws, int health) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        setWeight(weight);
        this.wins = wins;
        this.defeats = defeats;
        this.draws = draws;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if (this.weight < 52.2) {
            this.category = "INVALID";
        } else if (this.weight <= 70.3) {
            this.category = "CATEGORY: LIGHTWEIGHT";
        } else if (this.weight <= 83.9) {
            this.category = "CATEGORY: MIDDLEWEIGHT";
        } else if (this.weight <= 120.2) {
            this.category = "CATEGORY: HEAVYWEIGHT";
        } else {
            this.category = "INVALID";
        }
    }

    public String getNacionality() {
        return nationality;
    }

    public void setNacionality(String nacionality) {
        this.nationality = nacionality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeigh() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void introduce() {
        System.out.println("-------------------------");
        System.out.println("INTRODUCING A NEW FIGHTER TONIGHT: ");
        System.out.println("NAME: " + getName());
        System.out.println("FROM: " + getNacionality());
        System.out.println("AGE: " + getAge());
        System.out.println(getCategory());
        System.out.println("HEIGHT: " + getHeigh() + " cm");
        System.out.println("WEIGHT: " + getWeight() + " kg");
        System.out.println("WINS: " + getWins());
        System.out.println("DEFEATS: " + getDefeats());
        System.out.println("DRAWS: " + getDraws());
        System.out.println("-------------------------");
    }

    public void status() {
        System.out.println("---------------------------------------");
        System.out.println(this.getName() + " IS A " + this.getCategory() + " CATEGORY, WITH " + this.getWeight() + " KG");
        System.out.print("WON " + this.getWins() + " FIGHTS, ");
        System.out.print("LOST " + this.getDefeats());
        System.out.println(" AND DRAWED " + this.getDraws());
        System.out.println("---------------------------------------");
    }

    public void attack(Fighter target, int damage) {
        System.out.println(this.name + " attacks " + target.name + " by " + damage + " points");
        target.health -= damage;
        System.out.println(target.name + "'s remaining life: " + target.health);
        System.out.println("---------------------------------------------------------------------------");
    }

    public void winFight() {
        this.setWins(this.getWins() + 1);
    }

    public void loseFight() {
        this.setDefeats(this.getDefeats() + 1);
    }

    public void fightDraw() {
        this.setDraws(this.getDraws() + 1);
    }
}
