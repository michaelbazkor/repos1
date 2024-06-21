public class Student
{
    //do not understand why in the next line, println , shows error, would like for some help :)
    //System.out.println("Welcome to the Student Grade Management System!");
    //you are not allowed to put stuff here which is not variables / functions

    //private Student[] _arr=new Student[100];
    // you are defining Student within the definition of student :/
    private String name;
    private String grades;

    public Student(String name, String grades)
    // There are a lot of problems with this construct function
    {
        this.name = name;
        this.grades = grades;
        /*System.out.println("Add a new student");
        if(count!=100)
        {
            //please do the checking about name and grade, I did some if it.
            _arr[count]=new Student(name,grades);
            //there need to be a chack if the name is already in the system
            _name=name;

            //this is a check if every grade is fine(there can not be a grade that is bigger than 100 and smaller than 0)
            for(int i=0;i<grades.length();i++)
            {
                int count_grade=0;
                if(grades.charAt((i))=='-')
                {
                    // you put an invalid grade example for invalid: -95
                    break;
                }
                if(grades.charAt((i))!=' ')
                {
                    count_grade++;
                    if(count_grade>2)
                    {

                        break;
                    }
                }
            }
            _grades=grades;
        }
        count++;*/
    }

    // Ahmed hates getters and setters
    /*public String getname()
    {
        return _name;
    }
    public String getgrades()
    {
        return _grades;
    }
    public Student[] getarr()
    {
        return _arr;
    }
    public void setname(String name)
    {
        _name=name;
    }
    public void setgrades(String grades)
    {
        _grades=grades;
    }
    public void setarr(Student[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            _arr[i]=arr[i];
        }
    }*/
    // I am moving this to GradeSystem
    /*public void Display()
    {
        for(int i=0;i<_arr.length;i++)
        {
            System.out.println("for student "+i);
            System.out.println(_arr[i].getname()+" "+_arr[i].getgrades());
        }
    }*/

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

    public double avarage(Student other)
    {
        // I will continue later
        int count_grade=0;
        int count_pow=0;
        int sum=0;
        for(int i=0;i<other.getgrades().length();i++)
        {
            if(other.getgrades().charAt(i)!=' ')
            {
                sum+=(other.getgrades().charAt(i));
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
