package com.demo.dao;

import com.demo.beans.Student;
import java.util.List;

public interface StudentDao {
    void readData(String fname);
    void writeData(String fname);
    boolean save(Student s);
    boolean deleteByRollNo(int rollno);
    Student findByRollNo(int rollno);
    List<Student> findAll();
}