interface Data{
    public void best();
    public void failed();
}
interface Test extends Data{
    public void showData();
    public double average();
}
class Stu implements Test{
    protected String name;
    protected int math;
    protected int english;

    public Stu(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }
    public void best() {
        if (math > english) {
            System.out.println(name+"的數學比英語好");
        } else if (english > math) {
            System.out.println(name+"的英语比數學好");
        } else {
            System.out.println(name+"的數學和英語一樣好");
        }
    }
    public void failed() {
        if (math < 60 && english < 60) {
            System.out.println(name+"的數學和英語被當了");
        } else if (math < 50) {
            System.out.println(name+"ˇ的數學當掉了");
        } else if (english < 50) {
            System.out.println(name+"的英語當掉了");
        } else {
            System.out.println(name+"的數學和英語都及格");
        }
    }
    public void showData() {
        System.out.println("姓名: " + name);
        System.out.println("數學成绩: " + math);
        System.out.println("英語成绩: " + english);
        best();
        failed();
    }
    public double average() {
        return (math + english) / 2.0;
    }
    public void show() {
        showData();
        System.out.println("平均成積: " + average());
    }
}
public class Class11_10 {
    public static void main(String[] args) {
        Stu s=new Stu( "Judy",58,91);
        s.show();
    }
}
