package L11;

interface iAaa_1105{
    public void show();
}
class Bbb_1105{
    public int num = 10;
    public void set(int n){
        num = n;
    }
}
class Ccc_1105 extends Bbb_1105 implements iAaa_1105{
    
    public void show(){
        System.out.println("num = "+ num);
    }

}

public class class05 {
    public static void main(String[] args) {
        Ccc_1105 obj = new Ccc_1105();
        obj.set(5);
        obj.show();
    }
}
