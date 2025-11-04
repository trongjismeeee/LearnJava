class Person {
    protected String fullName;
    protected String email;

    public Person(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "FullName: " + fullName + ", Email: " + email;
    }
}