import java.util.ArrayList;

public class searchByMatch {
    public static void main(String[] args) {
        int num=7;
        int [] arr= {1,2,1,2,5,2,6};
        calculate(num,arr);
    }

    private static void calculate(int num, int [] arr){
        int count=1;
        ArrayList <Integer> arrList=new ArrayList<>();
        for (int i=0;i<num;i++){
            arrList.add(arr[i]);
            for(int j=i+1;j<num;j++){
                if (arrList.contains(arr[j])){
                    break;
                }else if(arr[i]==arr[j]){
                   count++;
                }else{

                    count=1;
                }

            }
            System.out.println("matching "+arr[i]+" "+ count+" times");
        }
    }
}
