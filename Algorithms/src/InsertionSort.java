import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr={3,4,5,1,1,6,2,8,5,7};
        System.out.println(Arrays.toString(sortThis(arr)));
    }

    private static int [] sortThis(int[] arr) {
        int num;
        for (int i=1;i<arr.length;i++){
            num=arr[i];
            while (i>0 && arr[i-1]>num){
                arr[i]=arr[i-1];
                i--;
            }
            arr[i]=num;
        }

        return arr;
    }
}
