public class TwoSum {
    private static int [] numArr = {1,2,4,5,7,8,10};

    public static void main(String[] args) {
        sumMethod();
    }

    public static void sumMethod(){
       for(int i=0; i<numArr.length; i++){
           for (int j=i+1; j<numArr.length; j++){

               int sum = numArr[i]+numArr[j];
               int num = 11;
               if (num ==sum) {
                   System.out.println("The Sum " + sum + " get by " + numArr[i] + " + " + numArr[j]);
               }
           }
       }
    }

}
