interface iAaa{
    public void show();
}
class Bbb{
    public int num=10;
    public void set(int n){
        num = n;
    }
}
class Ccc extends Bbb implements iAaa {
    public void show() {
        System.out.println("num=" + num);
    }
}
public class Class11_5 {
    public static void main(String[] args) {
        Ccc obj=new Ccc();
        obj.set(5);
        obj.show();
    }
}
