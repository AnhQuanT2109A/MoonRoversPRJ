public class sinhVien extends lop {
    private int nam_sinh;
    private String sdt;


    public sinhVien(String name, String hanh_kiem, String xep_loai, int nam_sinh, String sdt ){
        super(name, hanh_kiem, xep_loai);
        this.nam_sinh = nam_sinh;
        this.sdt = sdt;
    }


    @Override
    public String toString() {
        return super.toString() + "sinhVien{" +
                "nam_sinh=" + nam_sinh +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
