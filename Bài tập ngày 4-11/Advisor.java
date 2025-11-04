class Advisor extends Person {
    public Advisor(String fullName, String email) {
        super(fullName, email);
    }

    @Override
    public String toString() {
        return "Advisor (Outside) [" + super.toString() + "]";
    }
}