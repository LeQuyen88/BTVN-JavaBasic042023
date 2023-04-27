package BaiTap_Javabasic3;

public class ToanTuQuanHe {
    public static void main(String[] args) {
        int a = 30;
        int b= 80;
        int c= 50;
        int d =0;


        // Toán tử so sánh bằng
        System.out.println((a+b) == (a-b));
        //Toán tử so sánh khác
        System.out.println((a+b) != (a-b));
        // Toán tử lớn hơn
        System.out.println((a+b) > (a-b));
        // Toán tử Nhỏ hơn
        System.out.println((a-b) < (a+b));
        // Toán tu lớn hơn hoặc bằng
        System.out.println((b-a) >= (c+d));
        //Toán tử nhỏ hơn hoặc bằng
        System.out.println((b+a) <= (c+d));
        System.out.println((b-a) >= (c+d));
        System.out.println((b-a) >= (a+d));


    }
}
