public class ReverseString {

    public static String word= "Hello";

    public static void main(String[] args) {
        reverseWord();
    }
    public static void reverseWord(){
        StringBuilder stringBuilder=new StringBuilder(word);
        stringBuilder=stringBuilder.reverse();
        System.out.println(stringBuilder);
        char [] wordArr = word.toCharArray();
        for(int i=wordArr.length-1;i>=0;i--){
            System.out.print(wordArr[i]);
        }
    }
}
