class MyMath {
    public static double power(int x, int y) {
        return Math.pow(x, y);
    }
}

public class Class09_7 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        double result = MyMath.power(x, y);
        System.out.println(x + " 的 " + y + " 次方等於 " + result);
    }
}
