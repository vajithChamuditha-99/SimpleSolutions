import java.util.Arrays;

public class TransformString {
    public static void main(String[] args) {
        String wordOne="samankumarass";
        String twoWord="kamalsamira";
        transform(wordOne,twoWord);
    }

    private static void transform(String wordOne, String twoWord) {
        char [] arrOne= wordOne.toCharArray();
        char [] twoArr=twoWord.toCharArray();
        int length;
        int remain;
        boolean flag;
        if (arrOne.length<twoArr.length){
            length=arrOne.length;
            remain=twoArr.length-arrOne.length;
            flag=true;
        }else {
            length=twoArr.length;
            remain=arrOne.length-twoArr.length;
            flag=false;
        }
        System.out.println(remain);

        int remainder=0;
        char[] arrOneNxt=new char[length];
        for (int i=0; i< length;i++){
            if (arrOne[i]!=twoArr[i]){
                arrOneNxt[i]=twoArr[i];
                remainder++;
            }else{
                arrOneNxt[i]=arrOne[i];
            }
        }
        for (int i=0; i<length; i++){
            System.out.print(arrOneNxt[i]);
        }
        System.out.println();
        for (int i=0; i<length; i++){
            System.out.print(twoArr[i]);
        }
        System.out.println();
        if (!flag){
            System.out.println((remainder+remain));
        }else{
            System.out.println((remainder));
        }
        System.out.println(Arrays.toString(arrOne));
    }
}
