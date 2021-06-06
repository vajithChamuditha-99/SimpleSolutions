import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={3,4,5,1,6,2,8,5,7};
        System.out.println(Arrays.toString(sortThis(arr)));
    }

    private static int [] sortThis(int[] arr) {
        int num;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    num=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=num;
                }
            }

        }

        return arr;
    }
}
