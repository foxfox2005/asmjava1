package asm.function;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
    static ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
    public static void main(String[] args){
        int chon = 0, tl = 0;
        String maNV = null, hoTen = null;
        double luong = 0;
        boolean tieptuc = true;
        Scanner scanner = new Scanner(System.in);
        
        do{
            tieptuc = true;
            System.out.println("-------CHUONG TRINH QUAN LY NHAN SU-------");
            System.out.println("|1. Nhap danh sach nhan vien tu ban phim. |");
            System.out.println("|2. Xuat danh sach nhan vien.             |");
            System.out.println("|3. Tim kiem nhan vien theo ma nhan vien. |");
            System.out.println("|4. Xoa nhan vien theo ma nhan vien.      |");
            System.out.println("|5. Cap nhap thong tin sinh vien theo ma. |");
            System.out.println("|6. Tim kiem nhan vien theo khoang luong. |");
            System.out.println("|7. Xap sep nhan vien theo ho va ten.     |");
            System.out.println("|8. Xep sep nhan vien theo thu nhap.      |");
            System.out.println("|9. Xuat 5 nhan vien co thu nhap cao nhat.|");
            System.out.println("|0. Ban chon thoat chuong trinh.          |");
            System.out.println("-------------------------------------------");
            try{
                System.out.print("Moi ban chon:");
                chon = scanner.nextInt();
            }catch (Exception e) {
                System.out.println("Du lieu nhap vao khong hop le. Vui long nhap lai.");
                scanner.nextLine();
            }
            switch(chon){
                case 1 :
                    nhapDanhSachNhanVien();
                    break;
                case 2 :
                    xuatDanhSachNhanVien();
                    break;
                case 3 :
                    timVaHienThiNhanVien();
                    break;
                case 4 :
                    xoaNhanVien();
                    break;
                case 5 :
                    System.out.println("Ban chon chuong tring 5.");
                    System.out.println("//  ........................................................................................................");
                    System.out.println("//  .%%%%%....%%%%...%%..%%...%%%%...........%%..%%...%%%%...%%..%%..........%%%%%...%%..%%..%%..%%...%%%%..");
                    System.out.println("//  .%%..%%..%%..%%..%%%.%%..%%...............%%%%...%%..%%...%%%%...........%%..%%..%%..%%..%%%.%%..%%.....");
                    System.out.println("//  .%%..%%..%%%%%%..%%.%%%..%%.%%%............%%....%%%%%%....%%............%%..%%..%%..%%..%%.%%%..%%.%%%.");
                    System.out.println("//  .%%..%%..%%..%%..%%..%%..%%..%%...........%%%%...%%..%%....%%............%%..%%..%%..%%..%%..%%..%%..%%.");
                    System.out.println("//  .%%%%%...%%..%%..%%..%%...%%%%...........%%..%%..%%..%%....%%............%%%%%....%%%%...%%..%%...%%%%..");
                    System.out.println("//  ........................................................................................................");
                    break;
                case 6 : 
                    System.out.println("Ban chon chuong trinh 6.");
                    System.out.println("//  ........................................................................................................");
                    System.out.println("//  .%%%%%....%%%%...%%..%%...%%%%...........%%..%%...%%%%...%%..%%..........%%%%%...%%..%%..%%..%%...%%%%..");
                    System.out.println("//  .%%..%%..%%..%%..%%%.%%..%%...............%%%%...%%..%%...%%%%...........%%..%%..%%..%%..%%%.%%..%%.....");
                    System.out.println("//  .%%..%%..%%%%%%..%%.%%%..%%.%%%............%%....%%%%%%....%%............%%..%%..%%..%%..%%.%%%..%%.%%%.");
                    System.out.println("//  .%%..%%..%%..%%..%%..%%..%%..%%...........%%%%...%%..%%....%%............%%..%%..%%..%%..%%..%%..%%..%%.");
                    System.out.println("//  .%%%%%...%%..%%..%%..%%...%%%%...........%%..%%..%%..%%....%%............%%%%%....%%%%...%%..%%...%%%%..");
                    System.out.println("//  ........................................................................................................");
                    break;
                case 7 :
                    System.out.println("Ban chon chuong trinh 7.");
                    System.out.println("//  ........................................................................................................");
                    System.out.println("//  .%%%%%....%%%%...%%..%%...%%%%...........%%..%%...%%%%...%%..%%..........%%%%%...%%..%%..%%..%%...%%%%..");
                    System.out.println("//  .%%..%%..%%..%%..%%%.%%..%%...............%%%%...%%..%%...%%%%...........%%..%%..%%..%%..%%%.%%..%%.....");
                    System.out.println("//  .%%..%%..%%%%%%..%%.%%%..%%.%%%............%%....%%%%%%....%%............%%..%%..%%..%%..%%.%%%..%%.%%%.");
                    System.out.println("//  .%%..%%..%%..%%..%%..%%..%%..%%...........%%%%...%%..%%....%%............%%..%%..%%..%%..%%..%%..%%..%%.");
                    System.out.println("//  .%%%%%...%%..%%..%%..%%...%%%%...........%%..%%..%%..%%....%%............%%%%%....%%%%...%%..%%...%%%%..");
                    System.out.println("//  ........................................................................................................");
                    break;
                case 8 :
                    System.out.println("Ban chon chuong trinh 8.");
                    System.out.println("//  ........................................................................................................");
                    System.out.println("//  .%%%%%....%%%%...%%..%%...%%%%...........%%..%%...%%%%...%%..%%..........%%%%%...%%..%%..%%..%%...%%%%..");
                    System.out.println("//  .%%..%%..%%..%%..%%%.%%..%%...............%%%%...%%..%%...%%%%...........%%..%%..%%..%%..%%%.%%..%%.....");
                    System.out.println("//  .%%..%%..%%%%%%..%%.%%%..%%.%%%............%%....%%%%%%....%%............%%..%%..%%..%%..%%.%%%..%%.%%%.");
                    System.out.println("//  .%%..%%..%%..%%..%%..%%..%%..%%...........%%%%...%%..%%....%%............%%..%%..%%..%%..%%..%%..%%..%%.");
                    System.out.println("//  .%%%%%...%%..%%..%%..%%...%%%%...........%%..%%..%%..%%....%%............%%%%%....%%%%...%%..%%...%%%%..");
                    System.out.println("//  ........................................................................................................");
                    break;
                case 9 :
                    System.out.println("Ban chon chuong trinh 9.");
                    System.out.println("//  ........................................................................................................");
                    System.out.println("//  .%%%%%....%%%%...%%..%%...%%%%...........%%..%%...%%%%...%%..%%..........%%%%%...%%..%%..%%..%%...%%%%..");
                    System.out.println("//  .%%..%%..%%..%%..%%%.%%..%%...............%%%%...%%..%%...%%%%...........%%..%%..%%..%%..%%%.%%..%%.....");
                    System.out.println("//  .%%..%%..%%%%%%..%%.%%%..%%.%%%............%%....%%%%%%....%%............%%..%%..%%..%%..%%.%%%..%%.%%%.");
                    System.out.println("//  .%%..%%..%%..%%..%%..%%..%%..%%...........%%%%...%%..%%....%%............%%..%%..%%..%%..%%..%%..%%..%%.");
                    System.out.println("//  .%%%%%...%%..%%..%%..%%...%%%%...........%%..%%..%%..%%....%%............%%%%%....%%%%...%%..%%...%%%%..");
                    System.out.println("//  ........................................................................................................");
                    break;
                case 0 : 
                    System.out.println("Ban chon thoat chuong trinh.");
                    tieptuc = false;
                    break;
                default :
                    System.out.println("Ban chon khong hop le, vui long chon lai.");
            }
            if( chon != 0 || chon != 1 || chon != 2 || chon != 3 || chon != 4 || chon != 5 || chon != 6 || chon != 7 || chon != 8 || chon != 9 ){
                System.out.println(" ");
            }
            if(chon == 1 ||chon == 2 ||chon == 3 ||chon == 4 ||chon == 5 ||chon == 6 ||chon == 7 ||chon == 8 ||chon == 9 ) {
                OUTER:
                while (tieptuc) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("|          1. Quay lai          2. Thoat          |");
                    System.out.println("---------------------------------------------------");
                    try{
                        System.out.print("Ban chon:");
                        tl = scanner.nextInt();
                    }catch (Exception e) {
                        System.out.println("Du lieu nhap vao khong hop le. Vui long nhap lai.");
                        scanner.nextLine();
                    }
                    switch (tl) {
                        case 1:
                            System.out.println("Ban chon Quay lai.");
                            tieptuc = true;
                            break OUTER;
                        case 2: {
                            System.out.println("Ban chon thoat chuong trinh.");
                            tieptuc = false;
                        }
                            System.exit(0);
                        default:
                            System.out.println("Ban nhap khong hop le. vui long nhap lai.");
                            tieptuc = true;
                            break;
                    }       
                }
            }
        }while(tieptuc);
    }
    
    private static void nhapDanhSachNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            System.out.print("Ma NV: ");
            String maNV = scanner.nextLine();
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Luong: ");
            double luong = scanner.nextDouble();

            System.out.println("Chon loai nhan vien (1. Nhan vien hanh chinh, 2. Tiep thi, 3. Truong phong): ");
            int loaiNV = scanner.nextInt();
            scanner.nextLine();

            switch (loaiNV) {
                case 1:
                    danhSachNhanVien.add(new NhanVien(maNV, hoTen, luong));
                    break;
                case 2:
                    System.out.print("Doanh so: ");
                    double doanhSo = scanner.nextDouble();
                    System.out.print("Hoa hong: ");
                    double hoaHong = scanner.nextDouble();
                    danhSachNhanVien.add(new TiepThi(maNV, hoTen, luong, doanhSo, hoaHong));
                    break;
                case 3:
                    System.out.print("Trach nhiem: ");
                    double trachNhiem = scanner.nextDouble();
                    danhSachNhanVien.add(new TruongPhong(maNV, hoTen, luong, trachNhiem));
                    break;
                default:
                    System.out.println("Lua chon loai nhan vien khong hop le");
            }
        }
    }
    
    private static void xuatDanhSachNhanVien() {
        System.out.println("Danh sach nhan vien:");
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuatThongTin();
            System.out.println("Thu nhap: " + nv.getThuNhap());
            System.out.println("Thue thu nhap: " + nv.getThueTN());
            System.out.println("---------------");
        }
    }
    
    private static void timVaHienThiNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can tim: ");
        String maNVCanTim = scanner.nextLine();

        for (NhanVien nv : danhSachNhanVien) {
            if (nv instanceof TruongPhong truongPhong) {
                if (maNVCanTim.equals(nv.getMaNV())) {
                    nv.xuatThongTin();
                    System.out.println("Thu nhap: " + nv.getThuNhap());
                    System.out.println("Thue thu nhap: " + nv.getThueTN());
                    System.out.println("Trach nhiem: " + truongPhong.trachNhiem());
                    System.out.println("---------------");
                    return;
                }
            } else if (nv instanceof TiepThi) {
                if (maNVCanTim.equals(nv.getMaNV())) {
                    nv.xuatThongTin();
                    System.out.println("Thu nhap: " + nv.getThuNhap());
                    System.out.println("Thue thu nhap: " + nv.getThueTN());
                    System.out.println("---------------");
                    return;
                }
            } else {
                if (maNVCanTim.equals(nv.getMaNV())) {
                    nv.xuatThongTin();
                    System.out.println("Thu nhap: " + nv.getThuNhap());
                    System.out.println("Thue thu nhap: " + nv.getThueTN());
                    System.out.println("---------------");
                    return;
                }
            }
        }

        System.out.println("Khong tim thay nhan vien co ma " + maNVCanTim);
    }
    
    private static void xoaNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can xoa: ");
        String maNVCanXoa = scanner.nextLine();

        for (NhanVien nv : danhSachNhanVien) {
            if (maNVCanXoa.equals(nv.getMaNV())) {
                danhSachNhanVien.remove(nv);
                System.out.println("Da xoa nhan vien co ma " + maNVCanXoa);
                return;
            }
        }

        System.out.println("Khong tim thay nhan vien co ma " + maNVCanXoa + " de xoa");
    }
}
    