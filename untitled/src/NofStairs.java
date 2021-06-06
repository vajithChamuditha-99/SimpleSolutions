public class NofStairs {
    public static void main(String[] args) {
        int num=3;
        System.out.println(calculate(num+1));
    }

    private static int calculate(int num) {
        int [] cache=new int[num];
        cache[0]=1;
        cache[1]=1;
        for (int i=2;i<num;i++){
            cache[i]=cache[i-1]+cache[i-2];
        }
        return cache[num-1];
    }
}
