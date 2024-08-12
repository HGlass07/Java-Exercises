
package School;

import java.util.ArrayList;
import java.util.List;


public class School {
		
	private String className;
	private String teacher;
	private List<Students> students;
	private static List<School> classList = new ArrayList<>();;
	
	public School(String className, String teacher) {
		this.className = className;
		this.teacher = teacher;
		this.students = new ArrayList<>();
	}
	
	public String getClassName() {
		return className;
	}
	public String getTeacher() {
		return teacher;
	}
	public List<Students> students() {
		return students;
	}
	
	public void addStudent(String studentName) {
		students.add(new Students(studentName));
		System.out.println(studentName + " added to " + className);
	}
	
	public void removeStudent(String studentName) {
		students.removeIf(itm -> itm.getStudent().equals(studentName));
        System.out.println(studentName + " removed from " + className);
    }
	
	public static void addClass(String className, String teacher) {
		classList.add(new School(className, teacher));
		System.out.println(className + " with " + teacher + " added");
	}
	
	public static void removeClass(String className) {
        classList.removeIf(schoolClass -> schoolClass.getClassName().equals(className));
        System.out.println(className + " removed");
    }
	
	public static void displayClasses() {
        for (School schoolClass : classList) {
            System.out.println("Class Name: " + schoolClass.getClassName());
            System.out.println("Teacher: " + schoolClass.getTeacher());
            System.out.println("Students: ");
            for (Students student : schoolClass.students()) {
                System.out.println("  - " + student.getStudent());
            }
            System.out.println();
        }
    }
 
	public static void main(String[] args) {
		School.addClass("English", "Mr Matthews");
		School.addClass("History", "Mrs Johnson");
		School.addClass("ICT", "Mr Smith");
		
		for (School schoolClass : classList) {
            if (schoolClass.getClassName().equals("English")) {
                schoolClass.addStudent("Tim");
                schoolClass.addStudent("Robin");
                schoolClass.addStudent("Lucy");
                schoolClass.addStudent("Peter");
            }
        }
		for (School schoolClass : classList) {
            if (schoolClass.getClassName().equals("History")) {
                schoolClass.addStudent("Amy");
                schoolClass.addStudent("Ricky");
                schoolClass.addStudent("Steven");
                schoolClass.addStudent("Jack");
            }
        }
		for (School schoolClass : classList) {
            if (schoolClass.getClassName().equals("ICT")) {
                schoolClass.addStudent("Ross");
                schoolClass.addStudent("Owen");
                schoolClass.addStudent("Jane");
                schoolClass.addStudent("Victoria");
            }
        }
		
		System.out.println("Displaying all classes:");
        School.displayClasses();
        
        for (School schoolClass : classList) {
            if (schoolClass.getClassName().equals("ICT")) {
                schoolClass.removeStudent("Jane");
            }
        }
        
        School.removeClass("English");
        
        School.displayClasses();

	}

}
