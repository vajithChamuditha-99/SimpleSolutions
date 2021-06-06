public class TransformString {
    public static void main(String[] args) {
        String wordOne="samankumara";
        String twoWord="kamalsamira";
        transform(wordOne,twoWord);
    }

    private static void transform(String wordOne, String twoWord) {
        char [] arrOne= wordOne.toCharArray();
        char [] twoArr=twoWord.toCharArray();
        int length;
        int remain;
        if (arrOne.length<twoArr.length){
            length=arrOne.length;
            remain=twoArr.length-arrOne.length;
        }else {
            length=twoArr.length;
            remain=arrOne.length-twoArr.length;
        }
        for (int i=0; i< length-1;i++){
            if (arrOne[i]!=twoArr[i]){
                arrOne[i]=twoArr[i];
                remain++;
            }
        }
        System.out.println(remain);
        for (int i=0; i<length; i++){
            System.out.print(arrOne[i]);
        }
        System.out.println();
        for (int i=0; i<length; i++){
            System.out.print(twoArr[i]);
        }

    }
}
