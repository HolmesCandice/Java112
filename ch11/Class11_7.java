interface MyMath{
    void show();
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
}
interface AdvancedMath{
    public void mod(int a,int b);
    public void fac(int a);
    public void pow(int a,int b);
}
class Compute implements MyMath, AdvancedMath{
    private int ans;

    public void show() {
        System.out.println("ans=" + ans);
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
        if (b != 0) {
            ans = a / b;
        show();
        } else {
            System.out.println("不可除以零");
        }
    }

    public void mod(int a, int b) {
        if (b != 0) {
            ans = a % b;
        show();
        } else {
            System.out.println("不可除以零");
        }
    }
    public void fac(int a) {
        if (a < 0) {
        } else {
            ans = 1;
            for (int i = 1; i <= a; i++) {
                ans *= i;
            }
            show();
        }
    }
    public void pow(int a, int b) {
        ans = (int) Math.pow(a, b);
        show();
    }
}
public class Class11_7 {
    public static void main(String[] args) {
        Compute cp=new Compute();
        cp.mul(3,5);
        cp.show();//此行會印出ans=15
        cp.mod(14,5);
        cp.show();//此行會印出ans=4
        cp.fac(5);
        cp.show();//此行會印出ans=120
    }
}
