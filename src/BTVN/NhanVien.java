package BTVN;

public class NhanVien {
    // Thuộc tính (Dấu - nghĩa là private)
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;

    // Phương thức khởi tạo (Constructor)
    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    // Phương thức tính lương: Lương = Lương cơ bản * Hệ số
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    // Phương thức tăng lương (Trả về true nếu tăng thành công)
    public boolean tangLuong(double heSoTang) {
        if (heSoTang > 0) {
            this.heSoLuong += heSoTang;
            return true;
        }
        return false;
    }

    // Phương thức in thông tin
    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.printf("Tổng lương: %.2f\n", tinhLuong());
        System.out.println("-----------------------");
    }
}
