package PhuongThuc_KieuDuLieu;

public class Calculator2 {

    public int tong2SoNguyen(int a, int b){
        return a + b;
    }

    public double tich2SoThuc(double a, double b){
        return a * b;
    }

    public static void main(String[] args) {
        Calculator2 object = new Calculator2();
        System.out.println("Tổng 2 số nguyên là: " + object.tong2SoNguyen(23, 9));
        System.out.println("Tích 2 số thực là: " + object.tich2SoThuc(3, 8));
    }
}
