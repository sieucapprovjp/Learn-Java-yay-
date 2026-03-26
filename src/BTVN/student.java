package BTVN;

import java.util.Calendar;

public class student{
    private String name;
    private int year;
    // Phương thức khởi dựng (Constructor)
    public student(String name, int year) {
        this.name = name;
        this.year = year;
    }
    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    // Phương thức phụ trợ để tính tuổi dựa trên năm hiện tại (2026)
    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - this.year;
    }
}