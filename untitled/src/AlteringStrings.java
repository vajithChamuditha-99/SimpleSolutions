import java.util.ArrayList;

public class AlteringStrings {
    public static void main(String[] args) {
        String word="ABBBAABABBBB";
        alterString(word);
    }

    private static void alterString(String word) {
        int count=0;
        char [] wordArr = word.toCharArray();
        ArrayList <Character> worr=new ArrayList<>();
        worr.add(wordArr[0]);
        for (int l=1;l<wordArr.length-1;l++){
            if (worr.get(worr.size()-1)!=wordArr[l]){
                worr.add(wordArr[l]);
            }else{
                count++;
            }

        }
        for (Character character : worr) {
            System.out.print(character);
        }
        System.out.println(count);
//        for (int i=1; i<worr.size(); i++){
//            for (int j=2;j<worr.size();j++){
//                if(worr.get(i).equals(worr.get(j))){
//                    worr.remove(i);
//                    count++;
//                    break;
//                }
//
//            }
//        }
//        for (Character character : worr) {
//            System.out.print(character);
//        }
//        System.out.println(count);
//        for (String input : word) {
//
//            int noOfDeletions = 0;
//            char[] chars = input.toCharArray();
//            for (int i = 0; i < chars.length; i++) {
//                char currChar = chars[i];
//                char nextChar = i + 1 == chars.length ? 'c' : chars[i + 1];
//
//                if (currChar == nextChar) {
//                    noOfDeletions++;
//                }
//            }
//            System.out.println(noOfDeletions);
//        }
    }
    static void counter(String str1){
        int counter=0;

        char[] s1 = str1.toCharArray();

        for(int i=0;i<s1.length-1;i++)

        {
            if(s1[i]==s1[i+1])
                counter++;

        }

        System.out.println(counter);
    }
}
