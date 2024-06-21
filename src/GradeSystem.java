public class GradeSystem {
    // This class holds all our Students, we can access them by name through here
    int MAX_SIZE = 100;

    private Student[] student_arr = new Student[MAX_SIZE];
    // this int var keeps the next index in the array
    private int free_index;

    public GradeSystem() {
        this.free_index = 0;
    }

    public void addStudent(Student s){
        this.student_arr[this.free_index] = s;
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
