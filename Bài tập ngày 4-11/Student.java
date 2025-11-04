class Student extends Person {
    private String studentId;

    public Student(String fullName, String email, String studentId) {
        super(fullName, email);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [" + super.toString() + ", ID: " + studentId + "]";
    }
}