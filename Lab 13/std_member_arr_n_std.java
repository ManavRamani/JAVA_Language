import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    public Student(int id_no, int no_of_subjects_registered, int[] subject_code, int[] subject_credits, String[] grade_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = 0.0; // Initialize SPI to 0
    }

    public void calculate_spi() {
        double total_credits = 0.0;
        double total_grade_points = 0.0;

        for (int i = 0; i < no_of_subjects_registered; i++) {
            int credits = subject_credits[i];
            int grade = convertGradeToPoints(grade_obtained[i]);

            total_credits += credits;
            total_grade_points += credits * grade;
        }

        this.spi = total_grade_points / total_credits;
    }

    private int convertGradeToPoints(String grade) {
        switch (grade) {
            case "A": return 10;
            case "B": return 8;
            case "C": return 6;
            case "D": return 4;
            case "E": return 2;
            case "F": return 0;
            default: return 0; // Assuming any other grade is equivalent to F (Fail)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = Integer.parseInt(args[0]);

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID No: ");
            int id = scanner.nextInt();
            System.out.print("Number of subjects registered: ");
            int subjects = scanner.nextInt();

            int[] subject_code = new int[subjects];
            int[] subject_credits = new int[subjects];
            String[] grade_obtained = new String[subjects];

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter Subject " + (j + 1) + " code: ");
                subject_code[j] = scanner.nextInt();
                System.out.print("Enter Subject " + (j + 1) + " credits: ");
                subject_credits[j] = scanner.nextInt();
                System.out.print("Enter Grade obtained in Subject " + (j + 1) + ": ");
                grade_obtained[j] = scanner.next();
            }

            students[i] = new Student(id, subjects, subject_code, subject_credits, grade_obtained);
            students[i].calculate_spi();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails for student " + (i + 1) + ":");
            System.out.println("ID No: " + students[i].id_no);
            System.out.println("SPI: " + students[i].spi);
        }
    }
}
