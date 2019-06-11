import java.util.ArrayList;
public class Student{
    private ArrayList<String> answers;
    private String name;
    private int questions;
    
    Student(String[] vals) {
        name = vals[0];
        answers = new ArrayList<String>();
        for(int i = 1; i < vals.length; i++) {
            answers.add(vals[i]);
        }
        questions = answers.size();
    }
    
    public String getScore(String[] key) {
        int num = 0;
        
        for(int i = 1; i < answers.size()+1; i++) {
          if(answers.get(i-1).equals(key[i])) num++;
        } 
        
        return num+"/"+questions;
    }
    
    public int getQuestions() {
        return questions;
    }
    
    
    public String getName() {
        return name;
    } 
    
    public int getAnswer(int index) {
        return Integer.parseInt(answers.get(index));
    }
}