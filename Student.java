import java.util.ArrayList;
public class Student{
    private ArrayList<String> answers;
    private String name;
    
    Student(String[] vals) {
        name = vals[0];
        for(int i = 1; i < vals.length; i++) {
            answers.add(vals[i]);
        }
    }
    
    public String getScore(ArrayList<String> key) {
        int num = 0;
        int den = 0;
        for(int i = 0; i < answers.size(); i++) {
          if(answers.get(i).equals(key.get(i))) num++;
          den++;
        } 
        
        return num+"/"+den;
    }
    
    public String getName() {
        return name;
    } 
    
    public int getAnswer(int index) {
        return Integer.parseInt(answers.get(index));
    }
}