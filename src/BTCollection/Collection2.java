package BTCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection2 {

    public void InfoNV(){
        List<String> getInfo = new ArrayList<String>();
        getInfo.add("Đỗ Minh Huyền");
        getInfo.add("Hà Nôi");
        getInfo.add("Nữ");
        getInfo.add("012345678");

        for (int Info = 0; Info < 4; Info++){
            System.out.println(getInfo.get(Info));
        }

    }

    public static void main(String[] args) {

        Collection2 info = new Collection2();
        info.InfoNV();

        List<Integer> sochan = new ArrayList<Integer>(); //Tạo ArrayList để lưu các số chẵn

        //Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
        for (int i = 0; i <= 50; i = i+2){
            System.out.println("Số chẵn: " + i);
            sochan.add(i); //lưu vào mảng
        }

        System.out.println(sochan); //In ra kết quả sau khi nạp thông tin vào mảng

        //Duyệt mảng bằng vòng lặp FOR cải tiến
        for (Integer SoChan: sochan){
            System.out.println("FOR cải tiến :" + SoChan);
        }

        //Duyệt mảng bằng vòng lặp FOR thường
//        int size = sochan.size();
        for (int sc = 0; sc < 26; sc++){
            System.out.println("FOR thường: " + sochan.get(sc));
        }
    }
}
