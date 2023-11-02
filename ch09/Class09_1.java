class CRectangle {
    int width;
    int height;

    // 帶參數的構造函數，設置width和height
    public CRectangle(int w, int h) {
        width = w;
        height = h;
    }

    // 無參數的構造函數，使用this關键字設置width和height
    public CRectangle() {
        this(10, 8); // 默認寬度為10，高度為8
    }
}