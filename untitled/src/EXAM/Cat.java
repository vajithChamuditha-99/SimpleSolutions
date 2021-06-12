package EXAM;

public class Cat {
    public String name;

    public void parsename(){
        System.out.println("1");
        try{
            System.out.println("2");
            int x=Integer.parseInt(name);
            System.out.println("3");
        }catch (NullPointerException e){
            System.out.println("4");
        }
        System.out.println("5");
    }

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.name="Felix";
        cat.parsename();
        System.out.println("6");
    }
}
