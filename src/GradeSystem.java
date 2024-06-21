import java.util.Scanner;

public class GradeSystem {
    Scanner input = new Scanner(System.in);
    final int MAX_SIZE = 100;
    // student limit constant
    private Student[] student_arr = new Student[MAX_SIZE];
    // student array
    private int free_index;
    // next free space in array

    public GradeSystem() {
        this.free_index = 0;
        System.out.println("Welcome to the Student Grade Management System!");
    }

    public void printOptions(){
        //prints system's functions
        System.out.println("1. Add a new student");
        System.out.println("2. Display all students");
        System.out.println("3. Calculate a student's average grade");
        System.out.println("4. Find the top performing student");
        System.out.println("5. Exit");
    }

    public void addStudent(){
        // adds a student to the system if system is not full and the grades are legal
        System.out.println("Enter student name:");
        String name = input.next();
        System.out.println("Enter grades:");
        String grades = input.next();
        if(free_index == MAX_SIZE){
            System.out.println("Student limit reached.");
            return;
        }
        //check for space
        String[] grades_arr = grades.split(" ");
        int grade;
        for(String string : grades_arr) {
            grade = Integer.parseInt(string);
            if(grade > 100 || grade < 0){
                System.out.println("Invalid grades.");
                return;
            }
        }
        //check for legal grades
        this.student_arr[this.free_index] = new Student(name, grades);
        System.out.println("Student " + this.student_arr[this.free_index].getName() + " added successfully!");
        //insert student
        this.free_index++;
    }

    public void displayAll(){
        // prints all the system's student data
        if(this.free_index == 0){
            System.out.println("No students records available.");
        }
        // in case the array is empty
        for(int i = 0; i < this.free_index; i++){
            this.student_arr[i].display();
        }
    }

    public void calculateAverage(){
        // receive a student name and print average if exists
        System.out.println("Enter student name:");
        String name = input.next();
        for(int i = 0; i < this.free_index; i++){
            if(student_arr[i].getName().equals(name)){
                System.out.println(student_arr[i].getAverage());
                return;
            }
        }
        System.out.println("No student found with name " + name + ".");
    }

    public void topStudent() {
        if(this.free_index == 0){
            System.out.println("No students records available.");
            return;
        }
        String name_student = "";
        double max = -1;
        for(int i = 0; i < this.student_arr.length; i++) {
            if(this.student_arr[i].getAverage() > max){
                name_student = this.student_arr[i].getName();
                max = this.student_arr[i].getAverage();
            }
        }
        System.out.println("Top performing student:" + name_student + " with an average grade of " + max);
    }
}


