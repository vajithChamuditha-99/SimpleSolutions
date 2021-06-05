public class BigInteger {
    public static void main(String[] args) {
        int num=154945;
        String number=String.valueOf(num);
        calculate(number);
    }

    private static void calculate(String number) {
        char [] numbers=number.toCharArray();
        int count=0;
        for (Character character: numbers){
            int i=Integer.parseInt(String.valueOf(character));

            count+=i;
        }
        String num=String.valueOf(count);
        char [] nnnn=num.toCharArray();
        if (nnnn.length==1){
            System.out.println(count);
        }else {
            calculate(String.valueOf(count));
        }


    }
}
