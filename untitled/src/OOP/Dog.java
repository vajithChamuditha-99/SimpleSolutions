package OOP;

public class Dog extends Animal {
    private int legs;


    public int getLegs() {
        return legs;
    }

    @Override
    public String toString() {
        return super.toString()+" "+
                "legs=" + legs ;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
