import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <Integer, String> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int num;
        int id;
        String name;
        System.out.println("Enter number");
        num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter id");
            id=sc.nextInt();
            System.out.println("Enter name");
            name=sc.next();
            map.put(id,name);
        }
        for (Integer i: map.keySet()){
            System.out.println("key: "+i+" value: "+map.get(i));
        }
        System.out.println(map);
    }
}
