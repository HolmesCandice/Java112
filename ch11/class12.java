package L11;

interface ivolume_1112{
    public void showdata();
    public double vol();
}
abstract class Sphere_1112 implements ivolume_1112{
    final double PI=3.14;
    protected int x;
    protected int y;
}
class Circle_1112 extends Sphere_1112{
    public int r;
    public Circle_1112(int a,int b,int c){
        x = a;
        y = b;
        r = c;
    }
    public double vol(){
        return (double)(4*PI*r*r*r)/3;
    }
    public void showdata(){
        System.out.println("球心：("+x+","+y+")");
        System.out.println("半徑："+r);
        System.out.printf("球體積：%.2f\n",(vol()));
    }
}

public class class12 {
    public static void main(String[] args) {
        Circle_1112 c1 = new Circle_1112(8,6,2);
        c1.showdata();
        System.out.println("b:因為sphere存在子類Circle，所以會變成要求Circle宣告showdata()跟vol()");
    }
}
