import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public void saveAllStudents(String filePath, ArrayList<Student> students){

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedWriter.write("----------Student Data----------");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            for(Student student : students) {
                bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
                bufferedWriter.newLine();
            }
            bufferedWriter.write("----------End Of Student Data----------");
            System.out.println("All Student Printed Sucessfully");
        }catch (IOException e){
            System.out.println("Could not Write File! Check File Path");
        } catch (Exception e){
            System.out.println("Something went Wrong!");
        }
    }

    public void saveStudent(String filePath,String rbt, ArrayList<Student> students){
        boolean found = false;
        for(Student student : students){
            if (student.getRbtNumber().equals(rbt)){
                try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
                    bufferedWriter.write("----------Student Data----------");
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    bufferedWriter .write(student.toString());
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    bufferedWriter.write("----------End Of Student Data----------");
                }catch (IOException e){
                    System.out.println("Could not Write File! Check File Path");
                }catch (Exception e){
                    System.out.println("Something Went Wrong!");
                }
                found = true;
                System.out.println("Student Saved Successfully");
                break;
            }
        }
        if (!found){
            System.out.println("Student Not Found! Check RBT Number");
        }
    }
}

