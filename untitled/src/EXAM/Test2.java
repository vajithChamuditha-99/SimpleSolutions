package EXAM;

public class Test2 extends Writer{
    public Test2(String writerID) {
        super(writerID);
    }

    public static void main(String[] args) {
        int x=5 , y=10;
        boolean b=x<0;
        if (b=true){
            System.out.println("x");
        }else {
            System.out.println("y");
        }
    }

    @Override
    public String getWriterID() {
        return super.getWriterID();
    }

    @Override
    public void write() {

    }
}
