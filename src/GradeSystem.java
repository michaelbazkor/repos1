public class GradeSystem {
    // This class holds all our Students, we can access them by name through here
    int MAX_SIZE = 100;

    private Student[] student_arr = new Student[MAX_SIZE];
    // this int var keeps the next index in the array
    private int free_index;

    public GradeSystem() {
        this.free_index = 0;
        System.out.println("Welcome to the Student Grade Management System!");
    }

    public void printOptions(){
        System.out.println("1. Add a new student");
        System.out.println("2. Display all students");
        System.out.println("3. Calculate a student's average grade");
        System.out.println("4. Find the top performing student");
        System.out.println("5. Exit");
    }

    public void addStudent(String name, String grades){
        // adds a student
        if(free_index == MAX_SIZE){
            System.out.println("Student limit reached.");
            return;
        }
        String[] grades_arr = grades.split(" ");
        int grade;
        for(String string : grades_arr) {
            grade = Integer.parseInt(string);
            if(grade > 100 || grade < 0){
                System.out.println("Invalid grades.");
                return;
            }
        }
        this.student_arr[this.free_index] = new Student(name, grades);
        this.free_index++;
    }

    public void displayAll(){
        if(this.free_index == 0){
            System.out.println("No students records available.");
        }
        for(int i = 0; i < this.free_index; i++){
            System.out.print(this.student_arr[i]);
        }
    }
}
