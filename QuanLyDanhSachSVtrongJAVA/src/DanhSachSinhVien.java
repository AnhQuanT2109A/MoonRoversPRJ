import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
//      Khi một đối tượng DanhSachSinhVien được tạo mà k có danh sách nào được cung cấp,
//      một danh sách trống sẽ được tạo ra.
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

//    1. them sinh vien vao danh sach
    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

//    2. In danh sach sinh vien ra man hinh
    public void inDanhSach() {
        for(SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

//    3. Kiểm tra danh sách có rỗng hay không
    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

//    4. Lấy số lượng sinh viên trong danh sách
    public int laySoLuongSV() {
        return this.danhSach.size();
    }

//    5. Làm rỗng danh sách sinh viên
    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

//    6. Kiểm tra sv có tồn tại trong ds hay k
    public boolean kiemTraTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);
    }

//    7. Xóa một sv ra khỏi 1 danh sách dựa trên mã sinh viên
    public boolean xoaSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);
    }

//    8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím
    public void timSinhVien(String ten){
        for(SinhVien sinhvien : danhSach){
            if(sinhvien.getHoVaTen().indexOf(ten) >= 0){
                System.out.println(sinhvien);
            }
        }
    }

//    9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp
    public  void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTB() > sv2.getDiemTB()){
                    return -1;
                }else if(sv1.getDiemTB() < sv2.getDiemTB()) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });
    }

}
