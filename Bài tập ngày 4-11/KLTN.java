// Giới hạn cho Generic V là kiểu Person,
// vì Teacher và Advisor đều kế thừa từ Person.
class KLTN<T extends Student, V extends Person> {
    private T student;
    private V supervisor; // Người hướng dẫn (Teacher hoặc Advisor)
    private String thesisTitle; // Tên khóa luận

    public KLTN(T student, V supervisor, String thesisTitle) {
        this.student = student;
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    @Override
    public String toString() {
        return "\n--- Thesis: " + thesisTitle + " ---\n" +
                "  Student: " + student.toString() + "\n" +
                "  Supervisor: " + supervisor.toString();
    }
}