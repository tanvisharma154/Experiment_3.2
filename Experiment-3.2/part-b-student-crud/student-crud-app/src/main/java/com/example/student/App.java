package com.example.student;

import com.example.student.dao.StudentDAO;
import com.example.student.entity.Student;
import java.util.List;

public class App {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create
        Student s1 = new Student("Nidhi", "nidhi@example.com", "CSE");
        dao.saveStudent(s1);
        System.out.println("Student saved: " + s1);

        // Read
        Student fetched = dao.getStudentById(s1.getId());
        System.out.println("Fetched Student: " + fetched);

        // Update
        fetched.setCourse("Data Science");
        dao.updateStudent(fetched);
        System.out.println("Updated Student: " + fetched);

        // Read All
        List<Student> students = dao.getAllStudents();
        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Delete
        dao.deleteStudent(s1.getId());
        System.out.println("Student deleted successfully!");
    }
}
