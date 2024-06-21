public class Student {
    private String name;
    private String grades;
    //a string of all grades with spaces between them

    public Student(String name, String grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return this.name;
    }

    public String[] getGradesArr(){
        // turns the string into a list of string grades
        return this.grades.split(" ");
    }

    public void display(){
        //print the student's name and all grades
        System.out.print("Name: " + this.name);
        String[] grade_arr = getGradesArr();
        System.out.print(" Grades: " + grade_arr[0]);
        for(int i = 1; i < grade_arr.length; i++){
            System.out.print(", " + grade_arr[i]);
        }
        System.out.println();
    }

    public double getAverage() {
        int sum = 0;
        String[] grade_arr = getGradesArr();
        for(int i = 0; i < grade_arr.length; i++) {
            sum += Integer.parseInt(grade_arr[i]);

        }
        return (double)(sum)/(double)(grade_arr.length);
    }
}
