public class Student {
    private String name;
    private String grades;

    public Student(String name, String grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return this.name;
    }

    public void display(){
        //print the student's name and all grades
        System.out.print("Name: " + this.name);
        String[] grade_arr = this.grades.split(" ");
        // turns the string into a list of string grades
        System.out.print(" Grades: " + grade_arr[0]);
        for(int i = 1; i < grade_arr.length; i++){
            System.out.print(", " + grade_arr[i]);
        }
    }

    public double average()
    {
        int count_grade=0;
        int count_pow=0;
        int sum=0;
        for(int i=this.grades.length()-1;i>=0;i--)
        {
            if(this.grades.charAt(i)!=' ')
            {
                sum+=(Character.getNumericValue(this.grades.charAt(i)))*Math.pow(10,count_pow);
                count_pow++;
            }
            else
            {
                count_pow=0;
                count_grade++;
            }
        }
        return (double)(sum)/(double)(count_grade);
    }
}
