public class Author {
    private String name;
    private String surname;
    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String toString() {
        return name + " " + surname;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return name.equals(a2.name);
    }
    public int hashCode() {
        return java.util.Objects.hashCode(name);
    }
}
