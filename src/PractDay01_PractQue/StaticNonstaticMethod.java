package PractDay01_PractQue;

public class StaticNonstaticMethod {
    public static void main(String args[]) {
        StaticNonstaticMethod d = new StaticNonstaticMethod();
        d.add(10,20);     // to call for non-static method
    }

    public void add(int x ,int y) {
        int a = x;
        int b = y;
        int c = a + b;
        System.out.println("addition" + c);
    }
}
