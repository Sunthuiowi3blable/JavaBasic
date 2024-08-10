package Mang;

public class Mang {

    public static void main(String[] args) {

        int mangNumber [] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50};

        //FOR cải tiến
        for (int Number: mangNumber){
            System.out.println("Số: " + Number);
        }

        //Khởi tạo mảng
        int mangnumber [] = new int[26];

        mangnumber[0] = 0;
        mangnumber[1] = 2;
        mangnumber[2] = 4;
        mangnumber[3] = 6;
        mangnumber[4] = 8;
        mangnumber[5] = 10;
        mangnumber[6] = 12;
        mangnumber[7] = 14;
        mangnumber[8] = 16;
        mangnumber[9] = 18;
        mangnumber[10]= 20;
        mangnumber[11]= 22;
        mangnumber[12]= 24;
        mangnumber[13]= 26;
        mangnumber[14]= 28;
        mangnumber[15]= 30;
        mangnumber[16]= 32;
        mangnumber[17]= 34;
        mangnumber[18]= 36;
        mangnumber[19]= 38;
        mangnumber[20]= 40;
        mangnumber[21]= 42;
        mangnumber[22]= 44;
        mangnumber[23]= 46;
        mangnumber[24]= 48;
        mangnumber[25]= 50;

        //FOR bình thường
        for (int h = 0; h < 26; h = h+1){
            System.out.println(mangnumber[h]);
        }
    }
}
