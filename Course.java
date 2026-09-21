public class Course {

    static int totalUniversityStudents = 0;

    String courseName;
    int enrolledStudents;

    public Course(String courseName, int enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;

        totalUniversityStudents += this.enrolledStudents;
    }

    public void calculatePassPercentage(int passedStudents) {

        double passPercentage = ((double) passedStudents / this.enrolledStudents) * 100;
        System.out.println("Pass percentage for " + this.courseName + ": " + passPercentage + "%");
    }

    public void displayCourseStats() {
        System.out.println("Course Name: " + this.courseName + " | Enrolled Students: " + this.enrolledStudents);
    }


    public static void main(String[] args) {

        Course course1 = new Course("Applied Object-Oriented Programming", 45);
        Course course2 = new Course("Software Engineering", 60);
        Course course3 = new Course("Database Management Systems", 35);

        System.out.println("--- Individual Course Statistics ---");

        course1.displayCourseStats();
        course2.displayCourseStats();
        course3.displayCourseStats();

        System.out.println("\n--- Temporary Calculations (Using Local Variables) ---");

        course1.calculatePassPercentage(40);
        course2.calculatePassPercentage(55);
        course3.calculatePassPercentage(30);

        System.out.println("\n--- University-wide Statistics ---");

        System.out.println("Total students registered across all courses combined: " + Course.totalUniversityStudents);
    }
}
