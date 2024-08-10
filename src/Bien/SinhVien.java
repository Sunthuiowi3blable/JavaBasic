package Bien;

public class SinhVien {
    String address = "Hà Nội";

    public void saySunthuiowi3blable(){
        int n = 22;
        System.out.println("Gia tri cua n la: " + n);
        System.out.println(address);
    }
    public static void main(String[] args) {
        SinhVien bienLocal = new SinhVien();
        bienLocal.saySunthuiowi3blable();
        System.out.println(ThongTin.Name);
        System.out.println(ThongTin.tuoi);
    }
}
