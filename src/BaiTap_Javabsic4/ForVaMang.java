package BaiTap_Javabsic4;

public class ForVaMang {
    public static void main(String[] args) {
        //- Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
        for (int i = 0; i <=50 ; i++) {
            if (i  % 2 == 0) {
                System.out.println("Số chẵn =" + i);
            }
        }

        // Tạo mảng để lưu những số chẵn đó vào
        int songuyen1[] = new int[50];
        int songuyen2[] = new int[50];
        for (int i = 0; i < songuyen1.length; i++) {
            songuyen1[i] = i + 1;
        }

        for (int i = 0; i < songuyen1.length; i++) {
           System.out.println(songuyen1[i]);
           if (songuyen1[i] % 2 == 0){
               songuyen2[i] = songuyen1[i];
           }
        }

        //In ra số nguyên 2, Duyệt mảng để in ra kết quả sau khi nạp vào
        for (int i = 0; i < songuyen2.length; i++) {
            System.out.println(songuyen2[i]);
        }

    }
}

