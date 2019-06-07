import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Marker {

    public static void main(String[] args) { 
        File f = new File("quiz answers.csv");
        try{ 
            Scanner input = new Scanner(f);            
            String[] ans = null;
            ArrayList<Student> = new ArrayList<Student>();
            while(input.hasNext()) {
                String str = input.nextLine();
                String[] vals = str.split(",");
                if(vals[0].equals("Answer Key")) ans = vals;
                else {
                    Student s = new Student();
                }
            }
        } 
        catch (FileNotFoundException e) {   
            e.printStackTrace();
        }
    }
}