class Student {
    private String name;
    private String id;
    private String grade;

    public Student(String name, String id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id.toUpperCase(); // Display ID in uppercase
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class StudentView {
    public void displayStudentDetails(String name, String id, String grade) {
        System.out.println("----------------------------------");
        System.out.println("Student Details:");
        System.out.println("Name  : " + name);
        System.out.println("ID    : [" + id + "]");
        System.out.println("Grade : " + grade);
        System.out.println("----------------------------------\n");
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentId(String id) {
        model.setId(id);
    }

    public String getStudentId() {
        return model.getId();
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}

public class MVCPatternExample {
    public static void main(String[] args) {
        StudentView view = new StudentView();

        Student student1 = new Student("Ravi", "s101", "A");
        StudentController controller1 = new StudentController(student1, view);
        controller1.updateView();

        Student student2 = new Student("Kiran", "s102", "A+");
        StudentController controller2 = new StudentController(student2, view);
        controller2.updateView();

        Student student3 = new Student("Sneha", "s103", "B+");
        StudentController controller3 = new StudentController(student3, view);
        controller3.updateView();
    }
}
