package BTVN;
import java.util.Scanner;

public class NVtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nhan vien :");
        int n = sc.nextInt();
        sc.nextLine();
        NhanVien[] ds = new NhanVien[n];
        for (int i =0;i<n;i++) {
            System.out.println("Nhap vao ttin cua nhan vien " + (i+1));
            System.out.println("Nhap vao ten nhan vien: \n");
            String ten = sc.nextLine();
            System.out.println("Nhao vao luong co ban: \n");
            int luongCoBan = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap vao he so luong: \n");
            double heSoLuong = sc.nextDouble();
            sc.nextLine();

            ds[i] = new NhanVien(ten,luongCoBan,heSoLuong);
        }

        double tongLuong = 0;
        for (NhanVien nv : ds) {
            tongLuong += nv.tinhLuong();
        }

        // 2. Hiển thị thông tin ban đầu
        System.out.println("=== THÔNG TIN NHÂN VIÊN BAN ĐẦU ===");
        for (NhanVien nhanVien :ds) {
            nhanVien.inTTin();
        }

        // 3. Thực hiện truyền thông điệp "tăng lương"
        System.out.println(">> Thực hiện tăng lương cho cac nhan vien ...");
        for (NhanVien nv : ds) {
            nv.tangLuong(0.5);
        }
        double tongLuongSauTang = 0.0;
        for (NhanVien nv : ds) {
            tongLuongSauTang += nv.tinhLuong();
        }

        // 4. Hiển thị lại thông tin sau khi tăng lương
        System.out.println("\n=== THÔNG TIN SAU KHI THAY ĐỔI ===");
        for (NhanVien nv : ds) {
            nv.inTTin();
        }
        System.out.println("Tong so nhan vien duoc tao: \n"+ NhanVien.demNhanVien());
        System.out.println("Tong luong cua nhan vien truoc khi tang luong\n" + tongLuong);
        System.out.println("Luong nhan vien sau khi tang luong\n" + tongLuongSauTang);
    }
}
