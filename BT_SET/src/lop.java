public class lop {
    private String ten_SV;
    private String hanh_kiem;
    private String xep_loai;

    public lop() {

    }
    public lop(String ten_SV, String hanh_kiem, String xep_loai){
        this.ten_SV = ten_SV;
        this.hanh_kiem = hanh_kiem;
        this.xep_loai = xep_loai;
    }
    @Override
    public String toString() {
        return "lop{" +
                "ten_SV='" + ten_SV + '\'' +
                ", hanh_kiem='" + hanh_kiem + '\'' +
                ", xep_loai='" + xep_loai + '\'' +
                '}';
    }
}

