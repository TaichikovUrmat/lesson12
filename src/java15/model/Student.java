package java15.model;

public class Student {
    private Long id;
    private String name,fullName,honeNumber,email;

    public Student(Long id, String name, String fullName, String honeNumber, String email) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.honeNumber = honeNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHoneNumber() {
        return honeNumber;
    }

    public void setHoneNumber(String honeNumber) {
        this.honeNumber = honeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", honeNumber='" + honeNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
