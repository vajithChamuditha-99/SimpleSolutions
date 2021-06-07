import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String [] arr=new String[num];
        for (int i=0;i<num;i++){
            System.out.println("value");
            String val=sc.next();
            arr[i]=val;
        }
        System.out.println(Arrays.toString(arr));
    }
}
