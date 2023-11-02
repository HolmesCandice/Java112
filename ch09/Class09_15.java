class Circle {
    private static double pi = 3.14;
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public static double compare(Circle[] c) {
        double max = 0.0;
        for (int i = 0; i < c.length; i++)
            if (c[i].radius > max)
                max = c[i].radius;
        return max;
    }

    public static double average(Circle[] c) {
        double total = 0.0;
        for (int i = 0; i < c.length; i++) {
            total += c[i].radius;
        }
        return total / c.length;
    }
}

public class Class09_15{
    public static void main(String[] args) {
        Circle[] cir;
        cir = new Circle[3];

        cir[0] = new Circle(1.0);
        cir[1] = new Circle(4.0);
        cir[2] = new Circle(2.0);

        System.out.println("Largest radius = " + Circle.compare(cir));
        System.out.println("Average radius = " + Circle.average(cir));
    }
}
