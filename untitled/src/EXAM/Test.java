package EXAM;

public class Test {
    public static void main(String[] args) {
        int number;
        String str;
        try {
            str="5";
            number=Integer.parseInt(str.substring(5));
            System.out.println("A");
        }catch (NumberFormatException e){
            System.out.println("B");
        }catch (IllegalArgumentException e){
            System.out.println("C");
        }catch (Exception e){
            System.out.println("E");
        }finally {
            System.out.println("F");
        }
        System.out.println("G");
    }
}
