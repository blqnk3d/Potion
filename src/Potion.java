public class Potion {
    private final Ingretiant ing1;
    private final Ingretiant ing2;
    private final Ingretiant ing3;

    private int stirs;

    public Potion(Ingretiant ing1, Ingretiant ing2, Ingretiant ing3) {
        this.ing1 = ing1;
        this.ing2 = ing2;
        this.ing3 = ing3;
    }

    public void stir() {
        stirs++;
    }

    public int getPowerSum() {
        if (isReady()) {
            return (ing1.power() + ing2.power() + ing3.power()) * 2;
        } else {
            return ing1.power() + ing2.power() + ing3.power();
        }
    }

    public boolean isReady() {
        return stirs >= 5;
    }

    @Override
    public String toString() {
        String ready;
        if (isReady()) {
            ready = "yes";
        } else {
            ready = "no";
        }

        return "Ingredients: " + ing1 + "," + ing2 + "," + ing3 + "\nPower: " + getPowerSum() + "\nReady: " + ready;
    }

    public static void main(String[] args) {
        Ingretiant zutat1 = new Ingretiant("Toad");
        Ingretiant zutat2 = new Ingretiant("Lizard");
        Ingretiant zutat3 = new Ingretiant("Spider");

        zutat1.setName("Fly");

        Potion potion = new Potion(zutat1, zutat2, zutat3);
        potion.stir();
        potion.stir();
        potion.stir();
        System.out.println(potion);
        potion.stir();
        potion.stir();
        System.out.println(potion);
    }
}
