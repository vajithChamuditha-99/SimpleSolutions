package EXAM;

public abstract class Writer {
    public void method1() {

    }

    public final void method2() {

    }

    public static void method3() {

    }
    private String writerID;

    public Writer(String writerID) {
        this.writerID = writerID;
    }

    public String getWriterID() {
        return writerID;
    }
    public abstract void write();
    //    public abstract static void method4();
//    public abstract final void method5();

}
