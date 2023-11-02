class Stu{
    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;

    public Stu(String id, String name, int mid, int finl, int common) {
        this.id = id;
        this.name = name;
        this.mid = mid;
        this.finl = finl;
        this.common = common;
    }
    public void show() {
        System.out.println("學生學號: " + id);
        System.out.println("學生姓名: " + name);
        System.out.println("期中成績: " + mid);
        System.out.println("期末成績: " + finl);
        System.out.println("平時成績: " + common);
    }
}
interface Data{
    public void showData();
}
interface Test{
    public void showScore();
    public double calcu();
}
public class Class11_8 {
    public static void main(String[] args) {
        Stu stu=new Stu("940001","Fiona",90,92,85);
        stu.show();
    }
}
