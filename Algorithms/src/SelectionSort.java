import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={3,4,5,1,6,2,8,5,7};
        System.out.println(Arrays.toString(sortThis(arr)));
    }

    private static int[] sortThis(int[] arr) {
        int smallest;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[j]<arr[i]){
                    smallest=arr[j];
                    arr[j]=arr[i];
                    arr[i]=smallest;
                }
            }

        }
        return arr;
    }
}
