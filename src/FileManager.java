import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FileManager {

    public void saveAllStudents(String filePath, HashMap<String,Student> students){

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedWriter.write("----------Student Data----------");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            for(Student student : students.values()) {
                bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
                bufferedWriter.newLine();
            }
            bufferedWriter.write("----------End Of Student Data----------");
            System.out.println("All Student Printed Successfully");
        }catch (IOException e){
            System.out.println("Could not Write File! Check File Path");
        } catch (Exception e){
            System.out.println("Something went Wrong!");
        }
    }

    public void saveStudent(String filePath,String rbt, HashMap<String,Student> students){

        if (students.containsKey(rbt)){
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
                bufferedWriter.write("----------Student Data----------");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                bufferedWriter.write(String.valueOf(students.get(rbt)));
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                bufferedWriter.write("----------End Of Student Data----------");
            }
            catch (IOException e){
                System.out.println("Could not Write File! Check File Path");
            } catch (Exception e){
                System.out.println("Something went Wrong!");
            }
            System.out.println("Student Printed Successfully");

        }
        else {
            System.out.println("Invalid RBT! Student not found.");
        }
    }
}

