package com.demo.service;

import com.demo.beans.Student;
import java.util.List;

public interface StudentService {
    
    void readFile(String fname);
    boolean addNewStudent(); 
    boolean removeStudent(int rollno);
    Student findStudent(int rollno);
    List<Student> displayAllStudents();
    List<Student> getSortedByAttendance();
    void processGrades();
    void closeApp(); 
}