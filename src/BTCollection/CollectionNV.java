package BTCollection;

import java.util.ArrayList;
import java.util.List;

public class CollectionNV {

    public static void main(String[] args) {

        List<String> getInfo = new ArrayList<String>();
        getInfo.add("Đỗ Minh Huyền");
        getInfo.add("Hà Nôi");
        getInfo.add("Nữ");
        getInfo.add("012345678");

        System.out.println("Thông tin nhân viên: " + getInfo + "\n");

        //Dùng vòng lặp FOR cải tiến để in ra thông tin trong mảng
        for (String tt: getInfo){
            System.out.println("Thông tin nhân viên 1: " + tt);
        }

        System.out.println();

        //DÙng vòng lặp FOR bình thường để in ra thông tin trong mảng
        for (int info = 0; info < 4; info++){
            System.out.println(getInfo.get(info));
        }
    }



}
