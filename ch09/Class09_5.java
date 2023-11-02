class CCount {
    private static int cnt = 0; // 類別變數，用來追蹤物件建立的個數

    public CCount() {
        cnt++; // 在建立物件時，cnt的值加1
    }

    public static void setZero() {
        cnt = 0; // 歸零cnt的值，使用類別變數
    }

    public void setValue(int n) {
        cnt = n; // 設定cnt的值為n，使用實例函數
    }

    public static int getCount() {
        return cnt; // 取得cnt的值，使用類別函數
    }
}
