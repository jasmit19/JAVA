package com.demo.service;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.exception.LowAttendanceException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    
    // Dependency Inversion Principle: Depend on interface, not implementation
    private StudentDao sdao = new StudentDaoImpl(); 
    private Scanner sc = new Scanner(System.in);
    private final String FILE_NAME = "studentdata1.txt"; 
    
    // --- Helper Logic (Required 2 & 3) ---
    private String calculateGrade(Student student) throws LowAttendanceException {
        if (student.getAttendancePercentage() < 60.0) {
            throw new LowAttendanceException("Grade blocked due to attendance < 60%.");
        }
        double score = student.getScore();
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else return "F";
    }
    
    private void createInitialData() {
        // Creates the initial 10 students if the file is empty/non-existent
        sdao.save(new Student(101, "Alice", "CS", 92.5, 95.0));
        sdao.save(new Student(102, "Bob", "EE", 55.0, 88.0));  
        sdao.save(new Student(103, "Charlie", "ME", 78.0, 75.0));
        sdao.save(new Student(104, "David", "CE", 85.0, 82.0));
        sdao.save(new Student(105, "Eve", "CS", 45.0, 99.0));   
        sdao.save(new Student(106, "Frank", "EE", 90.0, 91.0));
        sdao.save(new Student(107, "Grace", "ME", 60.0, 65.0)); 
        sdao.save(new Student(108, "Heidi", "CE", 65.0, 78.0));
        sdao.save(new Student(109, "Ivy", "CS", 80.0, 89.0));
        sdao.save(new Student(110, "Jack", "EE", 59.9, 72.0)); 
    }
    
    // --- Interface Method Implementations ---

    @Override
    public void readFile(String fname) {
        sdao.readData(fname);
        if (sdao.findAll().isEmpty()) {
            System.out.println("\n*** Creating initial 10 students... ***");
            createInitialData();
            processGrades(); // Calculate initial grades
            System.out.println("*** Initial data ready. ***\n");
        }
    }

    @Override
    public boolean addNewStudent() {
        System.out.print("Enter Roll No: ");
        int rollno = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String sname = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        System.out.print("Enter Attendance Percentage: ");
        double attendance = sc.nextDouble();
        System.out.print("Enter Score: ");
        double score = sc.nextDouble();
        
        Student newStudent = new Student(rollno, sname, course, attendance, score);
        
        try {
            newStudent.setGrade(calculateGrade(newStudent));
        } catch (LowAttendanceException e) {
            newStudent.setGrade("N/A (LOW ATT)");
            System.err.println("🚫 Warning: " + e.getMessage());
        }
        
        return sdao.save(newStudent);
    }
    
    @Override
    public void processGrades() {
        System.out.println("--- Recalculating Grades ---");
        for (Student s : sdao.findAll()) {
            try {
                s.setGrade(calculateGrade(s));
            } catch (LowAttendanceException e) {
                s.setGrade("N/A (LOW ATT)");
                // Display the exception message during processing
                System.err.println("🚫 FAILED for " + s.getSname() + ": " + e.getMessage());
            }
        }
    }

    @Override
    public List<Student> getSortedByAttendance() {
        // Required 5: Get all students and sort by attendance (descending)
        List<Student> sortedList = sdao.findAll();
        sortedList.sort(Comparator.comparing(Student::getAttendancePercentage).reversed());
        return sortedList;
    }
    
    @Override
    public boolean removeStudent(int rollno) {
        return sdao.deleteByRollNo(rollno);
    }

    @Override
    public Student findStudent(int rollno) {
        return sdao.findByRollNo(rollno);
    }

    @Override
    public List<Student> displayAllStudents() {
        return sdao.findAll();
    }
    
    @Override
    public void closeApp() {
        sdao.writeData(FILE_NAME);
    }
}