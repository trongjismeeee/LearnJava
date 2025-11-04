class Teacher extends Person {
    private String teacherId;
    private String title;

    public Teacher(String fullName, String email, String teacherId, String title) {
        super(fullName, email);
        this.teacherId = teacherId;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Teacher [" + super.toString() + ", ID: " + teacherId + ", Title: " + title + "]";
    }
}