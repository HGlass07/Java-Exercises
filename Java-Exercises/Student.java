
import java.util.ArrayList;

public class Student {
	
	private String name;
	private String grade;
	private ArrayList<String> courses;
	
	public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }
	
	
	public String getName() {
        return name;
    }
    public String getGrade() {
        return grade;
    }
    public ArrayList<String> getCourses() {
    	return new ArrayList<>(courses);
    }
    
    public void addCourse(String course) {
    	if (!courses.contains(course)) {
    		courses.add(course);
    		System.out.println(course + " added");
    	}
    	else {
    		System.out.println("Course already added");
    	}
    	
    }
    
    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println(course + " removed");
        } 
        else {
            System.out.println("Course not found");
        }
    }
    
    public void studentDetails() {
    	System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }

	public static void main(String[] args) {
		Student student = new Student("Alice Johnson", "B");
		student.studentDetails();
		
        student.addCourse("Biology");
        student.addCourse("History");

        student.studentDetails();

        student.removeCourse("Biology");
        student.studentDetails();

        student.addCourse("Business studies");
        student.studentDetails();
	}

}
