package BTVN;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên trong lớp: ");
        int n = sc.nextInt();
        sc.nextLine();
        // 2. Khởi tạo mảng Student
        student[] students = new student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print(" - Tên: ");
            String name = sc.nextLine();
            System.out.print(" - Năm sinh: ");
            int year = sc.nextInt();
            sc.nextLine(); // Clear bộ nhớ đệm

            students[i] = new student(name, year);
        }
        System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
        int totalAge = 0;
        for (student s : students) {
            System.out.println("Họ tên: " + s.getName() + " | Tuổi: " + s.getAge());
            totalAge += s.getAge();
        }

        System.out.println("---------------------------");
        System.out.println("Tổng số tuổi của cả lớp: " + totalAge);

        sc.close();
    }
}