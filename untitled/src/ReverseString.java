public class ReverseString {

    public static String word= "Hello";

    public static void main(String[] args) {
        reverseWord();
    }

    public static void reverseWord(){
        char [] wordArr = word.toCharArray();
        for(int i=wordArr.length-1;i>=0;i--){
            System.out.print(wordArr[i]);
        }
    }
}
