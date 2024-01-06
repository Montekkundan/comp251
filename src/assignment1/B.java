package assignment1;

public class B extends A {
    int x = 2;

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

}
