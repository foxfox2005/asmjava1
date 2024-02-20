package asm.function;

public class TruongPhong extends NhanVien {
    private final double trachnhiem;
    public TruongPhong(String manv, String hoten, double luong, double trachnhiem ) {
        super(manv, hoten, luong);
        this.trachnhiem = trachnhiem;
    }

    public double trachNhiem() {
        return 0.2 * getThuNhap();
    }

    @Override
    public double getThuNhap() {
        return super.getThuNhap() + trachNhiem();
    }
}
