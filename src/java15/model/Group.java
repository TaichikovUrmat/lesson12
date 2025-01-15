package java15.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private  Long id;
    private String GroupName,Student,instructor,date;

    public Group(Long id, String groupName, String student, String instructor, String date) {
        this.id = id;
        GroupName = groupName;
        Student = student;
        this.instructor = instructor;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", GroupName='" + GroupName + '\'' +
                ", Student='" + Student + '\'' +
                ", instructor='" + instructor + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
