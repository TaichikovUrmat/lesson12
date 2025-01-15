package java15.service.impl;

import java15.dao.GenericDao;
import java15.dao.impl.StudentDaoImpl;
import java15.model.Student;
import java15.service.Generic;

import java.util.List;

public class StudentServiceImpl  implements Generic<Student, Long> {

     GenericDao<Student,Long> genericDao =  new StudentDaoImpl();

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
