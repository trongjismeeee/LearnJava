import java.util.*;

public class GraduationThesisProgram {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng
        Student s1 = new Student("Nguyen Van A", "a.nv@hcmut.edu.vn", "18520001");
        Student s2 = new Student("Tran Thi B", "b.tt@hcmut.edu.vn", "18520002");
        Student s3 = new Student("Le Van C", "c.lv@hcmut.edu.vn", "18520003");

        Teacher t1 = new Teacher("Hoang Thi D", "d.ht@hcmut.edu.vn", "T9988", "Dr.");
        Advisor a1 = new Advisor("Pham Van E (Out)", "e.pv@outside.com");

        // Khởi tạo các Khóa luận
        KLTN<Student, Teacher> kltn1 = new KLTN<>(s1, t1, "Nghiên cứu về Trí tuệ Nhân tạo Ứng dụng");
        KLTN<Student, Advisor> kltn2 = new KLTN<>(s2, a1, "Phân tích Dữ liệu Lớn trong Tài chính");
        KLTN<Student, Teacher> kltn3 = new KLTN<>(s3, t1, "Tối ưu Thuật toán Tìm kiếm Nhị phân");

        // Khởi tạo và thêm vào ListSortable
        ListSortable<KLTN> thesisList = new ListSortable<>();
        thesisList.add(kltn1);
        thesisList.add(kltn2);
        thesisList.add(kltn3);

        // Sắp xếp danh sách
        // Sử dụng Comparator để sắp xếp theo tên khóa luận (thesisTitle)
        Comparator<KLTN> titleComparator = new Comparator<KLTN>() {
            @Override
            public int compare(KLTN o1, KLTN o2) {
                return o1.getThesisTitle().compareTo(o2.getThesisTitle());
            }
        };

        thesisList.sort(titleComparator);

        // In ra kết quả đã sắp xếp
        System.out.println("=== Running Graduation Thesis Program ===");
        thesisList.print();
    }
}