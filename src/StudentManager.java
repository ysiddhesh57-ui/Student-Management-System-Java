import java.util.ArrayList;

public class StudentManager {

    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        for (Student existingStudent : students) {

            if (existingStudent.getRbtNumber().equals(student.getRbtNumber())) {
                System.out.println("Duplicate RBT Number! Student already exists.");
                return;
            }
        }
            students.add(student);
            System.out.println("Student Added Successfully");
    }

    public void displayStudents(){
        if(students.isEmpty()){
            System.out.println("No Student have been added yet! Add Students First");
        }else {
            for (Student student : students) {
                System.out.println();
                System.out.println(student);
                System.out.println();
            }
        }
    }

    public void searchStudent(String rbt){
        boolean found = false;

        for (Student student : students) {
            if (student.getRbtNumber().equals(rbt)) {
                System.out.println("Student Found: ");
                System.out.println();
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Student Not Found!");
        }
    }

    public void statistics(){
        if(students.isEmpty()){
            System.out.println("No Data available to show Statistics! Add Students First");
        }
        else {
            double highest = 0;
            double lowest = students.get(0).getCgpa();
            double average = 0;
            double sum = 0;

            for (Student student : students) {
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
        boolean found = false;
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getRbtNumber().equals(rbt)) {
                    students.remove(i);
                    found = true;
                    break;
                }
            }
         if (!found){
             System.out.println("Student Not Found! Check RBT number.");
         }else {
             System.out.println("Student Deleted.");
         }
    }



    public ArrayList<Student> getStudents() {
        return students;
    }
}
