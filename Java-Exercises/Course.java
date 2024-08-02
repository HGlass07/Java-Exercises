import java.util.ArrayList;
import java.util.List;


public class Course {
	private String name;
	private String instructor;
	private int credits;
	
	public Course(String name, String instructor, int credits) {
		this.name = name;
		this.instructor = instructor;
		this.credits = credits;
	}
	
	
	public String getName() {
        return name;
    }
    public String getInstructor() {
        return instructor;
    }
    public int getCredits() {
        return credits;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
	
    public void courseDetails() {
        System.out.println("Course: " + name);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
	

	public static class OnlineCourse extends Course {
		private String platform;
		private int duration;
		private static List<OnlineCourse> onlineCourses = new ArrayList<>();
		
		public OnlineCourse(String name, String instructor, int credits, String platform, int duration) {
            super(name, instructor, credits);
            this.platform = platform;
            this.duration = duration;
            onlineCourses.add(this);
        }

        public String getPlatform() {
            return platform;
        }
        public void setPlatform(String platform) {
            this.platform = platform;
        }
        
        public int getDuration() {
            return duration;
        }
        public void setDuration(int duration) {
            this.duration = duration;
        }

        public void displayOnlineDetails() {
            super.courseDetails();
            System.out.println("Platform: " + platform);
            System.out.println("Duration: " + duration + " weeks");
        }
        
        public void checkCertificate(int threshold) {
            for (OnlineCourse course : onlineCourses) {
                if (course.getDuration() >= threshold) {
                    System.out.println(course.getName() + " is eligible for a certificate.");
                } else {
                    System.out.println(course.getName() + " is not eligible for a certificate.");
                }
            }
        }
	}
	
	public static void main(String[] args) {
		Course plumbing = new Course("Plumbing", "Miss Davies", 35);
		plumbing.courseDetails();
		Course businessStudies = new Course("Business Studies", "Mr Stevens", 30);
		businessStudies.courseDetails();
		
		OnlineCourse softwareDevelopment = new OnlineCourse("Software Development", "Mr Bloggs", 50, "Moodle", 12);
		softwareDevelopment.displayOnlineDetails();
		OnlineCourse graphicDesign = new OnlineCourse("Graphic Design", "Mrs Scott", 30, "Skillshare", 8);
		graphicDesign.displayOnlineDetails();
		
		int threshold = 10;
		System.out.println("\nCertificate Eligibility Check:");
		softwareDevelopment.checkCertificate(threshold);
		
	}

}
