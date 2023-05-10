public class User {
    private String name;
    private String surname;
    private String tckn;
    private String year;
    private String email;

    public User() {
    }
    public User(String name, String surname, String tckn, String year, String email) {
        this.name = name;
        this.surname = surname;
        this.tckn = tckn;
        this.year = year;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tckn='" + tckn + '\'' +
                ", year=" + year +
                ", email='" + email + '\'' +
                '}';
    }
}
