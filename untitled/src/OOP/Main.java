package OOP;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog [] arr=new Dog[3];
        Animal ani =new Dog();

        arr[0]=new Dog();
        arr[0].setLegs(1);
        arr[0].setName("ss");
        arr[0].setColor("ff");
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter");
//        for (int i=0;i<3;i++){
//            Dog animal =new Dog();
//            System.out.println("name");
//            String name=sc.next();
//            System.out.println("color");
//            String color=sc.next();
//            System.out.println("legs");
//            int legs=sc.nextInt();
//            animal.setColor(color);
//            animal.setLegs(legs);
//            animal.setName(name);
//            arr[i]=animal;
//        }
        arr[0].walk();
        System.out.println(arr[0].toString());
        System.out.println(arr[0].getLegs());
    }
}
