package BTVN;

public class NVtest {
    public static void main(String[] args) {
        // 1. Tạo 2 đối tượng nhân viên
        NhanVien nv1 = new NhanVien("Nguyễn Văn A", 3000000, 2.1);
        NhanVien nv2 = new NhanVien("Trần Thị B", 4500000, 3.5);

        // 2. Hiển thị thông tin ban đầu
        System.out.println("=== THÔNG TIN NHÂN VIÊN BAN ĐẦU ===");
        nv1.inTTin();
        nv2.inTTin();

        // 3. Thực hiện truyền thông điệp "tăng lương"
        System.out.println(">> Thực hiện tăng lương cho NV1...");
        boolean check = nv1.tangLuong(0.5); // Tăng thêm 0.5 vào hệ số lương

        if (check) {
            System.out.println("Tăng lương thành công!");
        } else {
            System.out.println("Tăng lương thất bại (hệ số không hợp lệ).");
        }

        // 4. Hiển thị lại thông tin sau khi tăng lương
        System.out.println("\n=== THÔNG TIN SAU KHI THAY ĐỔI ===");
        nv1.inTTin();
        nv2.inTTin();
    }
}
