public class Ingretiant {
    private String name;

    public Ingretiant() {
        this.name ="";
    }


    public Ingretiant(String name) {
        setName(name);
    }


    /**
     * This function returns the length of the name of the object.
     *
     * @return The length of the name.
     */
    public int power() {
        return name.length();
    }


    /**
     * This function sets the name of the object to the value of the parameter.
     *
     * @param name The name of the parameter.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This function returns the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
