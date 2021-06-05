import java.util.Random;
import java.util.Scanner;

public class SumOf3sand5s {

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate(){
        String CORRECT="CORRECT";
        String LOW="LOW";
        String HIGH="HIGH";
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int guess=random.nextInt(101);
        System.out.println(guess);
        Boolean flag= false;
        while (!flag){
            System.out.println("Low or High or Correct?");
            String answer=sc.next().toUpperCase();
            if (answer.equals(CORRECT)){
                System.out.println("I got the number");
                flag = true;
            }else if (answer.equals(LOW)){


            } else if (answer.equals(HIGH)){
                guess =random.nextInt(guess);
                System.out.println(guess);
            } else {
                System.out.println("Wrong input");
            }
        }
    }
}
