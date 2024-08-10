package BTCollection;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection1 {

    public void InfoNV(){
        Map<String, String> getInfo = new HashMap<String, String>();
        getInfo.put("Name","Đỗ Minh Huyền");
        getInfo.put("Địa chỉ","Hà Nôi");
        getInfo.put("Giới tính", "Nữ");
        getInfo.put("SĐT","012345678");

        for (Map.Entry<String, String>entry: getInfo.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    public static void main(String[] args) {

        Collection1 info = new Collection1();
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
