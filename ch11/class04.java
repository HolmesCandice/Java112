package L11;

interface mymath_1104{
    public void show();
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
}
class compute_1104 implements mymath_1104{
    private int ans;

    public void show() {
        System.out.println("ans = " + ans);
    }

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
        ans = a / b;
    }
}

public class class04 {
    public static void main(String[] args) {
        compute_1104 cp = new compute_1104();
        cp.mul(3,5);
        cp.show();
    }
}
