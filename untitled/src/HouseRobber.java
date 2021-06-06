import java.util.ArrayList;
import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: of houses:- ");
        int num=sc.nextInt();
        int [] propValue = new int[num];
        for (int i=0;i<num;i++){
            System.out.println("Enter the "+ (i+1)+ "th house property value");
            int value=sc.nextInt();
            propValue[i]=value;
        }
        ArrayList <Integer> list1=new ArrayList<>();
        ArrayList <Integer> list2=new ArrayList<>();
        int count1=propValue[1];
        list1.add(propValue[1]);
        int count2=propValue[0];
        list2.add(propValue[0]);
        for (int j=2;j<num;j++){
            if (j%2==1){
                count1+=propValue[j];
                list1.add(propValue[j]);
            }else{
                count2+=propValue[j];
                list2.add(propValue[j]);
            }
        }
        if (count1>=count2){
            System.out.println(list1);
        }else{
            System.out.println(list2);
        }

    }
}
