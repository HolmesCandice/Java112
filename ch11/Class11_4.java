interface MyMath {
    void show();
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}
class Compute implements MyMath {
    private int ans;

    public void add(int a, int b) {
        ans = a + b;
    }

    public void sub(int a, int b) {
        ans = a - b;
    }

    public void mul(int a, int b) {
        ans = a * b;
    }

    public void div(int a, int b) {
        if (b != 0) {
            ans = a / b;
        } else {
            System.out.println("不可除以零");
        }
    }

    public void show() {
        System.out.println("ans=" + ans);
    }
}

public class Class11_4 {
    public static void main(String[] args) {
        Compute cp = new Compute();
        cp.mul(3, 5);
        cp.show(); 
    }
}
