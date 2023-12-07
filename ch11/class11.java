package L11;

interface show_ans_1111{
    public void show();
}
interface mymath_1111 extends show_ans_1111{
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
}
class compute_1111 implements mymath_1111{
    public int ans;
    public void show(){
        System.out.println("ans = "+ans);
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

public class class11 {
    public static void main(String[] args) {
        compute_1111 cp = new compute_1111();
        cp.mul(3,5);
        cp.show();
    }
}
