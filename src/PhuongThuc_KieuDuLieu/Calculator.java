package PhuongThuc_KieuDuLieu;

public class Calculator {
    int a = 23;
    int b = 9;

    public int tong2SoNguyen(){
        return a + b;
    }

    public double tich2SoThuc(){
        return a * b;
    }

    public static void main(String[] args) {
        Calculator object = new Calculator();
        System.out.println("Tổng 2 số nguyên là: " + object.tong2SoNguyen());
        System.out.println("Tích 2 số thực là: " + object.tich2SoThuc());
    }
}
