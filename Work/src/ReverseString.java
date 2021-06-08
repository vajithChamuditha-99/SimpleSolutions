public class ReverseString{
    public static void main(String [] args){
        String text="Welcome";
        System.out.println(reverse(text));
    }

    public static String  reverse(String text){
        StringBuilder stringBuilder=new StringBuilder(text);

        String x;
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        char [] arr=text.toCharArray();
        char [] arr2=text.toCharArray();
        int count =0;
        for(int i=arr.length-1; i>=0;i--){
            arr2[count]=arr[i];
            count++;
        }
        x=String.copyValueOf(arr2);
        return x;
    }
}