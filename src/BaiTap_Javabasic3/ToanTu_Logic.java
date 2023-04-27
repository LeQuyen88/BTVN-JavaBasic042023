package BaiTap_Javabasic3;

public class ToanTu_Logic {
    public static void main(String[] args) {
        int a = 50;
        int b= 30;
        int c= 80;
        int d =0;


        // Toán tử AND
        boolean checkValue = (a-b) == (c+d);
        boolean checkValue2 = (a+b) == (c+d);
        boolean checkValue3 = (c-a) == (d+b);
        System.out.println(checkValue2);
        System.out.println(checkValue);
        System.out.println(checkValue3 && checkValue2);
        // Toán tử OR
        System.out.println(checkValue || checkValue2);
        //Toán tử XOR
        System.out.println(checkValue ^ checkValue2);
        System.out.println(checkValue2 ^ checkValue3);
        //Toán tu phủ định (Not)
        System.out.println(!(b>c)); // Kết quả của ví dụ này là true bởi vì b không lớn hơn c, false, đảo ngược lại sẽ là true.
        System.out.println(!(c>a)); // Kết quả của ví dụ này là false bởi vì c  lớn hơn a, True, đảo ngược lại sẽ là false.

    }
}
