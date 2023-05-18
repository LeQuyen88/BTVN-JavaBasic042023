package BaiTap_Javabasic5;

import java.util.*;

public class BTVN_Arraylist {
    public static void main(String[] args) {

        //Chỉnh sửa bài tập Java Basic 4 với ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>(50);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        for (int i = 0; i < list.size(); i++) {
            if (i  % 2 == 0) {
                System.out.println("Số chẵn =" + list.get(i));
            }

        }
        // Tạo hàm riêng để thêm thông tin cơ bản của một nhân viên vào collection đã học phù hợp
        Set<String> set = new HashSet<String>();
        set.add("Name: Nguyễn Văn A");
        set.add("Address: Số 10-phạm văn bạch");
        set.add("SĐT: 0123456789");
        set.add("Team:ABC");
        //Trong hàm main gọi lại hàm trên để in ra thông tin nhân viên đó với vòng lặp for CƠ BẢN
        for (String str : set) {
            System.out.println(str);
        }


    }
}
