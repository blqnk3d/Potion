public class Ingretiant {
    private String name;

    public Ingretiant(String name) {
        setName(name);
    }


    public int power() {
        return name.length();
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
