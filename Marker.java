import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Marker {

    public static void main(String[] args) { 
        File f = new File("quiz answers.csv");
        try{ 
            Scanner input = new Scanner(f);            
            String[] ans = null;
            ArrayList<Student> students = new ArrayList<Student>();
            while(input.hasNext()) {
                String str = input.nextLine();
                String[] vals = str.split(",");
                if(vals[0].equals("Answer Key")) ans = vals;
                else {
                    students.add(new Student(vals));
                }
            }

            printScores(students, ans);
            printQuestionDifficulty(students, ans);
        } 
        catch (FileNotFoundException e) {   
            e.printStackTrace();
        }
    }

    public static void printScores(ArrayList<Student> students, String[] ans) {
        System.out.println("Student Scores:  \n");
        for(Student s: students) {
            System.out.println(s.getName() + ": " + s.getScore(ans));
        }
        System.out.println("");
    }
    
    public static void printQuestionDifficulty(ArrayList<Student> students, String[] key) {
        System.out.println("Correct Answers Per Question:  \n");
        int questions = students.get(0).getQuestions();
        
        for(int i = 0; i < questions; i++) {
            
            int corrects = 0;
            for(Student s: students) {
                if(s.getAnswer(i) == Integer.parseInt(key[i+1])) corrects++;
            }
            
            System.out.println((i+1) + ": " + (corrects) + "/" + students.size());
        }
        System.out.println("");
    } 
}