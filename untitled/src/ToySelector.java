
import java.util.Arrays;


public class ToySelector {
    public static void main(String[] args) {
        int [] toyprice ={1,2,3,4};
        int budget=6;
        countToys(toyprice,budget);
    }

    private static void countToys(int [] items , int cash) {
        Arrays.sort(items);
        int count=0;
        for (Integer item :items) {
            if (item<cash){
                count++;
                cash-=item;
            }
        }
        System.out.println(count);


    }
}
