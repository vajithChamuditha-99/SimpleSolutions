public class QueueSwap {
    public static void main(String[] args) {
        int [] queue= {2,5,4,3,1};
        operationSwap(queue);
    }

    private static void operationSwap(int[] queue) {
        int size=queue.length;
        int smallest;
        int count = 0;
        for (int i=0;i<size-1;i++){
            if ((i+1)!=queue[i]){
                if ((i+1)==queue[i+1]){
                    smallest=queue[i+1];
                    queue[i+1]=queue[i];
                    queue[i]=smallest;
                    count++;
                } else if ((i+1)==queue[i+2]){
                    smallest=queue[i+1];
                    queue[i+1]=queue[i];
                    queue[i]=smallest;
                    count++;
                } else{
                    System.out.println("Too High");
                    return;
                }
            }

        }
        System.out.println(count);
    }
}
