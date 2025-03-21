package week5;
import java.util.ArrayList;
import java.util.List;
public class addCourse {
    private String courseCode;
    private String courseName;
    private int maxCapacity;

    public addCourse(String courseCode, String courseName, int maxCapacity){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
    }

    public String getCourseCode(){
        return courseCode;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getMaxCapacity(){
        return maxCapacity;
    }
    
    class CourseManagement {
        private static List <addCourse> addCourses = new ArrayList<>();

        public static void addCourse(String courseCode, String courseName, int maxCapacity) {

            addCourse newCourse = new addCourse(courseCode, courseName, maxCapacity);
            addCourses.add(newCourse);
            System.out.println("Course " + courseCode + ": " + courseName + " has been added successfully!");
        }

        public static void displayCourses(){
            System.out.println("Courses List: ");
            for (addCourse addCourse : addCourses){
                System.out.println(addCourse.getCourseCode(), addCourse.getCourseName(), addCourse.getMaxCapacity());
            }
        }
    }
}
