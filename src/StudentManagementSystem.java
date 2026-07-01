import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagementSystem {

    static Scanner scanner = new Scanner(System.in);
    static StudentManager studentManager = new StudentManager();
    static FileManager fileManager = new FileManager();

    public static void main(String[] args){

        String[] studentMenu = {"1. Add Student","2. Display Student","3. Search Student","4. Statistics","5. Delete Student","6. Save All Student Data","7. Save Student","8. Exit"};
        boolean menuValid = true;
        boolean isRunning = true;
        int choice = 0;

            while (menuValid) {
                System.out.println("*******************");
                for (String student : studentMenu) {
                    System.out.println(student);
                }
                System.out.println("*******************");
                try {
                    System.out.print("Choose between 1-8: ");
                     choice = scanner.nextInt();
                     scanner.nextLine();
                     if(choice<1 || choice>8){
                         System.out.println("Please Enter a Valid Choice (1-8).");
                         isRunning = true;
                     }else {
                         isRunning = false;
                     }
                }catch (InputMismatchException e){
                    System.out.println("Input Should be in numeric form(1-8)");
                    scanner.nextLine();
                }

                while (!isRunning) {
                    isRunning = true;
                    switch (choice) {
                        case 1 -> addStudent();
                        case 2 -> studentManager.displayStudents();
                        case 3 -> searchStudent();
                        case 4 -> studentManager.statistics();
                        case 5 -> deleteStudent();
                        case 6 -> saveAllStudentData();
                        case 7 -> saveStudent();
                        case 8 ->{
                            System.out.println("You Have Exited.");
                            menuValid = false;
                        }
                    }
                }
            }

          scanner.close();
        }

        static void addStudent(){
            String name = "" ;
            String rbtNumber = "";
            double cgpa = 0;
            boolean isValid = true;

                System.out.print("Enter Student Name: ");
                name = scanner.nextLine();

                System.out.print("Enter RBT Number: ");
                rbtNumber = scanner.nextLine();

                while (isValid) {
                    try {
                        System.out.print("Enter Student CGPA: ");
                        cgpa = scanner.nextDouble();
                        if (cgpa < 0.00 || cgpa > 10.00) {
                            System.out.println("Invalid CGPA!");
                        } else {
                            isValid = false;
                        }
                    }catch (InputMismatchException e){
                        System.out.println("Enter Valid CGPA");
                        scanner.nextLine();
                    }
                }
                scanner.nextLine();
            Student student = new Student(name,rbtNumber,cgpa);
            studentManager.addStudent(student);

            }



        static void searchStudent() {
            if (studentManager.getStudents().isEmpty()) {
                System.out.println("No students have been added yet!");
            } else {
                System.out.println("Enter Student RBT Number: ");
                String rbt = scanner.nextLine();
                studentManager.searchStudent(rbt);
            }
        }

        static void deleteStudent(){
        if (studentManager.getStudents().isEmpty()){
            System.out.println("No Students have been added yet!");
        }
        else {
            System.out.print("Enter Student RBT Number you wish to Delete: ");
            String rbt = scanner.nextLine();
            studentManager.deleteStudent(rbt);
        }
        }

        static void saveAllStudentData(){
        if (studentManager.getStudents().isEmpty()){
            System.out.println("No Student Data Available To Save! Add Students First.");
        }else {
            System.out.print("Enter a Path where you want save File eg (C:\\Users\\Siddh\\OneDrive\\Desktop\\info.txt): ");
            String filePath = scanner.nextLine();
            fileManager.saveAllStudents(filePath, studentManager.getStudents());
        }
        }

        static void saveStudent(){
            if (studentManager.getStudents().isEmpty()){
                System.out.println("No Student Data Available To Save! Add Students First.");
            }else {
                System.out.print("Enter a Path where you want save File eg (C:\\Users\\Siddh\\OneDrive\\Desktop\\info.txt): ");
                String filePath = scanner.nextLine();
                System.out.println("Enter RBT Number of the Student you want to Save");
                String rbt = scanner.nextLine();
                fileManager.saveStudent(filePath,rbt,studentManager.getStudents());
            }
        }


    }

