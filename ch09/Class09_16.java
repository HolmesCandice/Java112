import java.util.Scanner;

class Circle {
    private static double pi = 3.14;
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public void show() {
        System.out.printf("半徑=%.2f，面積=%.2f\n", radius, pi * radius * radius);
    }
}

public class Class09_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCircles = 3; // 你想創建的圓的數量
        Circle[] cir = new Circle[numCircles];

        for (int i = 0; i < numCircles; i++) {
            System.out.print("請輸入圓" + (i + 1) + "的半徑：");
            double radius = scanner.nextDouble();
            cir[i] = new Circle(radius);
        }

        System.out.println("輸入結果及每个圓的面積：");
        for (int i = 0; i < numCircles; i++) {
            System.out.println("圓" + (i + 1) + "的半徑：" );
            cir[i].show();
        }

        scanner.close();
    }
}
