class CData extends Thread{
    private static int sum = 30;
    private int n;
    private int sec;
    public CData(int a, int b){
        n = a;
        sec = b;
    }
    public void run(){
        while(sum > 10)
            sub(n,sec);
    }
    public static void sub(int a,int s){
        int tmp = sum - a;
        try {
            sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (tmp > 0){
            sum = tmp;
            System.out.println("減"+a+"後，餘數為"+sum);
        }
    }
}

public class Ex13 {
    public static void main(String[] args) {
        CData d1 = new CData(5, 1500);
        CData d2 = new CData(9, 1000);
        CData d3 = new CData(8,2000);
        
        d1.start();
        d2.start();
        d3.start();
        // (a) 錯誤在catch (InterruptedException e){}，在中括號加上e.printStackTrace();即可
        // (b) d1 d2 d3同時執行，但又互相不干擾。
    }
}
