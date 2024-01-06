package assignment1;

public class C extends B {
    int x = 3;

    public void setIt(int y) {
        x = y;
    }

    public int getIt() {
        return x;
    }

    public void superSetIt(int y) {
        super.x = y;
    }

    public int superGetIt() {
        return super.x;
    }

    public void superDuperSetIt(int y) {
        super.superSetIt(y);
    }

    public int superDuperGetIt() {
        return super.superGetIt();
    }

    public static void main(String[] args) {

        C c = new C();

        c.superDuperSetIt(4);

        System.out.println("C’s is " + c.getIt());

        System.out.println("B’s is " + c.superGetIt());

        System.out.println("A’s is " + c.superDuperGetIt());

    }

}
