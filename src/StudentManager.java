import java.util.HashMap;

public class StudentManager {

    private final HashMap<String,Student> students = new HashMap<>();

    public void addStudent(Student student){

        if (students.containsKey(student.getRbtNumber())){
            System.out.println("Duplicate Student! Student already Exits");
            return;
        }

        students.put(student.getRbtNumber(),student);
        System.out.println("Student Added Successfully");
    }

    public void displayStudents(){
        if (students.isEmpty()){
            System.out.println("No Students have been added yet! Add Students First.");
            return;
        }

        for (Student student : students.values()) {
            System.out.println(student.toString());
            System.out.println("----------------------------");
        }
    }

    public void searchStudent(String rbt){

        if (students.containsKey(rbt)){
            System.out.println(students.get(rbt));
        }
        else {
            System.out.println("Invalid RBT! Student not found.");
        }
    }

    public void statistics(){
        if(students.isEmpty()){
            System.out.println("No Data available to show Statistics! Add Students First");
        }
        else {
            double highest = 0;
            double lowest = Double.MAX_VALUE;
            double average = 0;
            double sum = 0;

            for (Student student : students.values()) {
                sum += student.getCgpa();
                if (student.getCgpa() > highest) {
                    highest = student.getCgpa();
                }
                if (lowest > student.getCgpa()) {
                    lowest = student.getCgpa();
                }
            }
            average = sum/ students.size();
            System.out.println("Total Number of Students: "+students.size());
            System.out.println("Highest CGPA: "+highest);
            System.out.println("Lowest CGPA: "+lowest);
            System.out.printf("Average: %.2f\n",average);
        }
    }
    
    public void deleteStudent(String rbt){

        if (students.containsKey(rbt)){
            students.remove(rbt);
            System.out.println("Student Deleted!");
        }
        else{
            System.out.println("Invalid RBT! Student not found");
        }
    }



    public HashMap<String, Student> getStudents() {
        return students;
    }
}
