package java15.dao.impl;

import java15.dao.GenericDao;
import java15.model.Student;

import java.util.List;

public class StudentDaoImpl implements GenericDao<Student,Long> {
    @Override
    public void create(Student student) {

    }

    @Override
    public List<Student> getAll() {
        return List.of();
    }

    @Override
    public Student getById(Long aLong) {
        return null;
    }

    @Override
    public void updateById(Long aLong, Student student) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
