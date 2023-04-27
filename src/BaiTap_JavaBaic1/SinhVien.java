package BaiTap_JavaBaic1;

public class SinhVien {
    public  void Ten(){
        String fullname = "Nguyễn Thị Lệ Quyên";// Biến local
        int age = 35;
        System.out.println("Họ và Tên: " + fullname + " " +"Tuổi hiện tại là: " + age);
    }
    public int msv;
    public  void setMsv( int masinhvien) {
        this.msv = masinhvien;  // Bien toan cuc
        System.out.println("Mã sinh viên: " + msv);
    }
    public  void setLop ( int lop) {
        this.msv = lop; // Bien toan cuc
        System.out.println("Lớp: " + msv);

    }
    public String diachi;
    public void setDiachi(String sonha){
        this.diachi =sonha; // Bien toan cuc
        System.out.println("sonha: "+ diachi);
    }
    public static String gioitinh = "Nữ"; // Biến static

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.Ten();
        sv.setMsv(123456);
        sv.setLop(89);
        sv.setDiachi("ngõ 23_50 trường trinh");
        System.out.println("gioitinh :" + gioitinh);
        ThongTin tt = new ThongTin();
        System.out.println("mã ngành " + tt.manganh);
        System.out.println("tên ngành " + tt.tennganh);
    }
}
