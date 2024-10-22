class manage {
    private String name;
    private String id;
    private static int enrolled = 0;

    public manage(String name, String id) {
        this.name = name;
        this.id = id;
        enrolled++;
    }

    public static int getEnrolled() {
        return enrolled;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

class Course {
    private String title;
    private String code;
    private static int courses = 0;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
        courses++;
    }

    public static int getCourses() {

        return courses;
    }

    public String getTitle() {

        return title;
    }

    public String getCode() {

        return code;
    }
}

public class UniversityStudent {
    public static void main(String[] args) {
        manage student1 = new manage("yaswanth", "23110059");
        manage student2 = new manage("sarvesh", "23110058");
        manage student3 = new manage("indhu", "23110057");

        System.out.println("Total Students Enrolled: " + manage.getEnrolled());

        Course stud1 = new Course("yaswanth", "23110059");
        Course stud2 = new Course("sarvesh", "23110058");
        System.out.println("Total Course Offered: " + Course.getCourses());
    }
}