package org.example;

// In a separate (adjacent) file, create a Student class with two public members:
// - A String member called name
// - A double member called grade

import java.util.ArrayList;
import java.util.List;

import static org.example.Main.mainMenu;

public class BetterStudentManager {
    public List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        // This method should add a new student to the list of students
        Student newStudent = new Student();
        newStudent.name = name;
        newStudent.grade = grade;
        students.add(newStudent);
    }

    public void removeStudent(String name) {
        // This method should remove the student with the given name from the list of
        // students. You will need to loop through the list of students to find the student
        // with the given name, store the index of the found student, and then after the
        // loop, remove the student at the stored index using the remove method of the
        int indexToRemove = -1;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            students.remove(indexToRemove);
        }
    }

    public String getStudentList() {
        // This method should return a string with each student's name and grade
        // separated by a space, with each student separated by a newline character ('\n')
        // E.g.
        // John 90.9
        // Jane 88.3
        //
        // You will need to use a String or StringBuilder to build the result by
        // looping through the list of students
        //
        // Replace the following line with your implementation
        String result = "";
        for (Student student : students) {
            result += student.name + " " + student.grade + "\n";
        }
        return result;
    }
}
