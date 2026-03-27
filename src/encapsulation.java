// ví dụ về tính đóng gói
class TaiKhoan {
    // 1. Che giấu dữ liệu (Private)
    private double soDu;

    // 2. Cung cấp "cổng" để kiểm soát dữ liệu vào
    public void napTien(double soTien) {
        if (soTien > 0) {
            this.soDu += soTien;
            System.out.println("Nạp thành công: " + soTien);
        } else {
            // Ngăn chặn dữ liệu xấu
            System.out.println("Lỗi: Số tiền nạp phải lớn hơn 0!");
        }
    }

    // 3. Cung cấp "cổng" để lấy dữ liệu ra (Read-only)
    public double getSoDu() {
        return this.soDu;
    }
}

public class encapsulation{
    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan();

        // tk.soDu = -500; // LỖI BIÊN DỊCH: Không thể truy cập trực tiếp biến private

        tk.napTien(1000);   // Hợp lệ
        tk.napTien(-500);   // Bị từ chối bởi logic bên trong Setter

        System.out.println("Số dư hiện tại: " + tk.getSoDu());
    }
}