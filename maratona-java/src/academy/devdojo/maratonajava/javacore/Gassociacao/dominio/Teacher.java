package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars = new Seminar[0];

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void addSeminars(Seminar seminar) {
        Seminar[] seminarsNewArray = new Seminar[seminars.length + 1];
        for (int index = 0; index < seminars.length; index++) {
            seminarsNewArray[index] = seminars[index];
        }
        seminarsNewArray[seminars.length] = seminar;
        this.seminars = seminarsNewArray;
    }

    public void dataPrinter(){
        System.out.println("Teacher: " + this.name);
        System.out.println("Specialty: " + this.specialty);

        if (seminars.length == 0) {
            System.out.println("No seminars enrolled");
            return;
        }

        for (Seminar seminar : seminars) {
            System.out.println("Seminar: " + seminar.getTitle());
            System.out.println("Location: " + seminar.getLocation().getAddress());

            Student[] students = seminar.getStudents();
            if (students.length == 0) {
                System.out.println("No students enrolled.");
            } else {
                System.out.println("Students:");
                for (Student student : students) {
                    System.out.println(" - " + student.getName() + " (" + student.getAge() + " years old)");
                }
            }
            System.out.println("------");
        }
    }
}
