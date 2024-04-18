import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Start");
        System.out.println("0. Exit");

        int c = sc.nextInt();

       while(c != 0) {
           System.out.println("1. Thêm 1 sinh viên");
           System.out.println("2. In ra danh sách sinh viên");
           System.out.println("3. Kiểm tra danh sách có rỗng hay không");
           System.out.println("4. Lấy số lượng sinh viên trong danh sách");
           System.out.println("5. Làm rỗng danh sách sinh viên");
           System.out.println("6. Kiểm tra sinh viên có tồn tại trong ds không");
           System.out.println("7. Xóa một sv ra khỏi 1 danh sách dựa trên mã sinh viên");
           System.out.println("8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím");
           System.out.println("9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp");

           int chose = sc.nextInt();
           Scanner sc2 = new Scanner(System.in);
            switch(chose) {
                case 1:
                    System.out.println("Nhập mã sinh viên: ");
                    String maSV = sc2.next();
                    System.out.println("Nhập họ và tên: ");
                    String hoVaTen = sc2.next();
                    System.out.println("Nhập năm sinh: ");
                    int namSinh = sc2.nextInt();
                    System.out.println("Nhập điểm TB: ");
                    float diemTB = sc2.nextFloat();

                    SinhVien sv = new SinhVien(maSV, hoVaTen, namSinh, diemTB);
                    dssv.themSinhVien(sv);
                    break;

                case 2:
                    dssv.inDanhSach();
                    break;
                case 3:
                    System.out.println("Danh sách có rống hay không: " + dssv.kiemTraDanhSachRong());
                    break;
                case 4:
                    System.out.println("Số lượng sinh viên trong danh sách: " + dssv.laySoLuongSV());
                    break;
                case 5:
                    dssv.lamRongDanhSach();
                    break;
                case 6:
                    System.out.println("Nhập mã sinh viên: ");
                    maSV = sc2.next();
                    SinhVien sv2 = new SinhVien(maSV);
                    System.out.println("Kiểm tra sinh viên có tồn tại trong ds không: " + dssv.kiemTraTonTai(sv2));
                    break;
                case 7:
                    System.out.println("Nhập mã sinh viên: ");
                    maSV = sc2.next();
                    SinhVien sv3 = new SinhVien(maSV);
                    System.out.println("Xóa một sv ra khỏi 1 danh sách dựa trên mã sinh viên: " + dssv.xoaSinhVien(sv3));
                    break;
                case 8:
                    System.out.println("Nhập Tên Sinh Viên muốn tìm: ");
                    String hoVaten = sc2.next();
                    System.out.println("Sinh Viên đã tìm: ");
                    dssv.timSinhVien(hoVaten);
                    break;
                case 9:
                    dssv.sapXepSinhVienGiamDanTheoDiem();
                    dssv.inDanhSach();
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }

    }
}
