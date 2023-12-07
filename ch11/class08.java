package L11;

interface data_1108{
    public void showdata();
}
interface test_1108{
    public void showScore();
    public double calcu();
}
class stu_1108 implements data_1108,test_1108{
    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;
    public stu_1108(String a,String b,int c,int d,int e){
        id = a;
        name = b;
        mid = c;
        finl = d;
        common = e;
    }
    public void showScore(){
        System.out.println("mid = "+mid);
        System.out.println("finl = "+finl);
        System.out.println("common = "+common);
    }
    public void showdata(){
        System.out.println("id："+id);
        System.out.println("name："+name);
    }
    public double calcu(){
        return mid * 0.3 + finl * 0.3 + common * 0.4;
    }
}
public class class08 {
    public static void main(String[] args) {
        stu_1108 stu = new stu_1108("940001", "Fiona", 90, 92, 85);
        stu.showdata();
        stu.showScore();
        System.out.println("calcu = " + stu.calcu());
    }
}
