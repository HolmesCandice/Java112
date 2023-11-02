class Namecard {
    private String name;
    private String address;
    private Phone data;

    // Phone 嵌套類
    class Phone {
        private String company;
        private String cell;

        // Phone 類的構造函數
        public Phone(String s1, String s2) {
            company = s1;
            cell = s2;
        }
    }

    // Namecard 類的構造函數
    public Namecard(String name, String address, String company, String cell) {
        this.name = name;
        this.address = address;
        this.data = new Phone(company, cell);
    }

    // 顯示 Namecard 信息的方法
    public void show() {
        System.out.println("好友姓名：" + name);
        System.out.println("聯絡地址：" + address);
        System.out.println("公司電話：" + data.company);
        System.out.println("手機號碼：" + data.cell);
    }
}

public class Class09_17 {
    public static void main(String[] args) {
        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
        first.show();
    }
}
