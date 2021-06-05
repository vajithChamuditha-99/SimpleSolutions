import java.util.Scanner;

public class ExpenditureMedian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the expenditure");
        int y=sc.nextInt();
        int [] expenditure={10,20,30,40,80};
        calculate(expenditure,y);
    }

    private static void calculate(int[] expenditure,int y) {
        int median;
        if (expenditure.length < 5) {
            System.out.println("Cant calculate an median");
            return;
        }
        System.out.println(expenditure.length);
        int length=expenditure.length;
        int length2=expenditure.length-3;
        int sum = 0;
        for (int i=length2;i<length;i++){
            System.out.println(i);
            sum+=expenditure[i];
        }
        median=(sum/3);

        System.out.println(median);
        if (median<y){
            System.out.println("Warning!! ");
        }

    }
}
