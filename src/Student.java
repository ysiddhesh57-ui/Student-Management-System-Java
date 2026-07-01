public class Student {

    private String name;
    private String rbtNumber;
    private double cgpa;

    Student(String name,String rbtNumber,double cgpa){
        this.name = name;
        this.rbtNumber = rbtNumber;
        this.cgpa = cgpa;
    }

    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getRbtNumber(){
        return rbtNumber;
    }
    public void setRbtNumber(String rbtNumber){
        this.rbtNumber = rbtNumber;
    }
    public double getCgpa(){
        return cgpa;
    }
    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }

    @Override
    public String toString(){
        return "Student Name: "+name+"\nStudent RBT Number: "+rbtNumber+"\nStudent CGPA: "+cgpa;
    }


}
