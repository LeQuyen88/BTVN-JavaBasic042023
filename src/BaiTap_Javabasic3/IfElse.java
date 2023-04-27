package BaiTap_Javabasic3;

public class IfElse {
    public static int n(int a , int b){
        return a + b;
    }
    public static int n1(int c){
        return c;
    }
    public static void main(String[] args) {
        int number = 100;
        System.out.println(n(5,3));

        if ( n1(101) > number){
            System.out.println("Thỏa mãn điều kiện 1");
        } else if (n1(99)<number) {
            System.out.println("Thỏa mãn điều kiện 2");

        } else if (n1(100) == number){
            System.out.println("Thỏa mãn điều kiện 3");
        }
        else {
            System.out.println("Không thỏa mãn điều kiện nào cả");
        }


    }
}
