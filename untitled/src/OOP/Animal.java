package OOP;

public class Animal {
    private String name;
    private String color;

    @Override
    public String toString() {
        return "Animal: " +
                "name='" + name + '\'' +
                ", color='" + color + '\'' ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk(){
        System.out.println("Animal is walking");
    }
}
