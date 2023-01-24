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

    /**
     * Stirs is incremented by 1.
     */
    public void stir() {
        stirs++;
    }

    /**
     * This function returns the number of stirs
     *
     * @return The number of stirs.
     */
    public int getStirs() {
        return stirs;
    }


    /**
     * If the potion is ready, return the sum of the powers of the ingredients multiplied by 2, otherwise return the sum of
     * the powers of the ingredients
     *
     * @return The power of the ingredients.
     */
    public int getPowerSum() {
        if (isReady()) {
            return (ing1.power() + ing2.power() + ing3.power()) * 2;
        } else {
            return ing1.power() + ing2.power() + ing3.power();
        }
    }


    /**
     * If the number of stirs is greater than or equal to 5, return true, otherwise return false.
     *
     * @return The boolean value of the stirs variable.
     */
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

    /**
     * The function creates three ingredients, changes the name of one of them, creates a potion with the three
     * ingredients, stirs the potion three times, prints the potion, stirs the potion two more times, and prints the potion
     * again
     */
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
