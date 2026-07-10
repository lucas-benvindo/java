package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminar {
    private String title;
    private Student[] students = new Student[0]; //It can have none or several students
    private Location location;

    public Seminar(String title, Location location) {
        this.title = title;
        this.location =  location;
    }

    public String getTitle() {
        return title;
    }

    public void addStudents(Student student) {
        Student[] studentsNewArray = new Student[students.length + 1];
        for (int index = 0; index < students.length; index++) {
            studentsNewArray[index] = students[index];
        }
        studentsNewArray[students.length] = student;
        this.students = studentsNewArray;
        student.setSeminar(this);
    }

    public Student[] getStudents() {
        return students;
    }

    public Location getLocation() {
        return location;
    }
}