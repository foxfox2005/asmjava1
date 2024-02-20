package asm.function;

public class NhanVien {
    private final String manv;
    private final String hoten;
    private final double luong;

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public double getThuNhap() {
        return luong;
    }

    public double getThueTN() {
        if (this.getThuNhap() <= 9000000) {
            return 0.0;
        } else if (this.getThuNhap() > 9000000 && this.getThuNhap() <= 15000000) {
            return (this.getThuNhap() - 9000000) * 0.1;
        } else {
            return (this.getThuNhap() - 15000000) * 0.12 + (15000000 - 9000000) * 0.1;
        }
    }


    public void xuatThongTin() {
        System.out.println("Ma NV: " + manv);
        System.out.println("Ho ten: " + hoten);
        System.out.println("Luong: " + luong);
    }
    
    public String getMaNV() {
        return manv;
    }
}
