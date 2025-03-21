package week07;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentManagementSystem {
    private JFrame frame;
    private JTable studentTable;
    private DefaultTableModel tableModel;
    private ArrayList<Student> students;
    private HashMap<String, ArrayList<Student>> courseEnrollments;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        courseEnrollments = new HashMap<>();
        initializeGUI();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentManagementSystem::new);
    }

    private void initializeGUI() {
        frame = new JFrame("Student Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Main Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu studentMenu = new JMenu("Student");
        JMenuItem addStudentMenu = new JMenuItem("Add Student");
        JMenuItem updateStudentMenu = new JMenuItem("Update Student");
        JMenuItem viewStudentMenu = new JMenuItem("View Students");

        JMenu courseMenu = new JMenu("Course");
        JMenuItem enrollStudentMenu = new JMenuItem("Enroll in Course");
        JMenuItem viewCoursesMenu = new JMenuItem("View Course Enrollments");

        JMenu gradeMenu = new JMenu("Grades");
        JMenuItem assignGradeMenu = new JMenuItem("Assign Grades");
        JMenuItem viewGradesMenu = new JMenuItem("View Student Grades");

        studentMenu.add(addStudentMenu);
        studentMenu.add(updateStudentMenu);
        studentMenu.add(viewStudentMenu);
        courseMenu.add(enrollStudentMenu);
        courseMenu.add(viewCoursesMenu);
        gradeMenu.add(assignGradeMenu);
        gradeMenu.add(viewGradesMenu);

        menuBar.add(studentMenu);
        menuBar.add(courseMenu);
        menuBar.add(gradeMenu);

        frame.setJMenuBar(menuBar);

        // Main Panel with Table
        JPanel mainPanel = new JPanel(new BorderLayout());
        tableModel = new DefaultTableModel(new String[]{"Name", "Enrolled Courses", "Grades"}, 0);
        studentTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(studentTable);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        frame.add(mainPanel);

        // Action Listeners for Menu Items
        addStudentMenu.addActionListener(e -> addStudent());
        viewStudentMenu.addActionListener(e -> refreshStudentTable());
        enrollStudentMenu.addActionListener(e -> enrollInCourse());
        assignGradeMenu.addActionListener(e -> assignGrade());
        viewGradesMenu.addActionListener(e -> viewStudentGrades());

        frame.setVisible(true);
    }

    // Add a new student
    private void addStudent() {
        String name = JOptionPane.showInputDialog(frame, "Enter Student Name:");
        if (name != null && !name.trim().isEmpty()) {
            students.add(new Student(name));
            JOptionPane.showMessageDialog(frame, "Student added successfully!");
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid input. Try again.");
        }
    }

    // Refresh the student table
    private void refreshStudentTable() {
        tableModel.setRowCount(0);
        for (Student student : students) {
            String courses = String.join(", ", student.getCourses());
            String grades = student.getGrades().toString();
            tableModel.addRow(new Object[]{student.getName(), courses, grades});
        }
    }

    // Enroll a student in a course
    private void enrollInCourse() {
        String studentName = JOptionPane.showInputDialog(frame, "Enter Student Name:");
        Student student = students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(studentName))
                .findFirst()
                .orElse(null);
        if (student != null) {
            String course = JOptionPane.showInputDialog(frame, "Enter Course Name:");
            if (course != null && !course.trim().isEmpty()) {
                student.addCourse(course);
                courseEnrollments.computeIfAbsent(course, k -> new ArrayList<>()).add(student);
                JOptionPane.showMessageDialog(frame, "Student enrolled in course!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid course name.");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Student not found.");
        }
    }

    // Assign grades to a student
    private void assignGrade() {
        String studentName = JOptionPane.showInputDialog(frame, "Enter Student Name:");
        Student student = students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(studentName))
                .findFirst()
                .orElse(null);
        if (student != null) {
            String course = JOptionPane.showInputDialog(frame, "Enter Course Name:");
            if (student.getCourses().contains(course)) {
                String grade = JOptionPane.showInputDialog(frame, "Enter Grade:");
                if (grade != null && !grade.trim().isEmpty()) {
                    student.addGrade(course, grade);
                    JOptionPane.showMessageDialog(frame, "Grade assigned successfully!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid grade input.");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Student is not enrolled in this course.");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Student not found.");
        }
    }

    // View a student's grades
    private void viewStudentGrades() {
        String studentName = JOptionPane.showInputDialog(frame, "Enter Student Name:");
        Student student = students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(studentName))
                .findFirst()
                .orElse(null);
        if (student != null) {
            StringBuilder grades = new StringBuilder("Grades:\n");
            student.getGrades().forEach((course, grade) -> 
                grades.append(course).append(": ").append(grade).append("\n"));
            JOptionPane.showMessageDialog(frame, grades.toString());
        } else {
            JOptionPane.showMessageDialog(frame, "Student not found.");
        }
    }
}

// Student class with enhanced functionality
class Student {
    private String name;
    private ArrayList<String> courses;
    private HashMap<String, String> grades;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public HashMap<String, String> getGrades() {
        return grades;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void addGrade(String course, String grade) {
        grades.put(course, grade);
    }
}


