import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Marker {

    public static void main(String[] args) { 
        File f = new File("quiz answers.csv");
        try{ 
            Scanner input = new Scanner(f);            
            String[] ans = null;
            
            while(input.hasNext()) {
                String str = input.nextLine();
                String[] vals = str.split(",");
                if(vals[0].equals("Answer Key")) ans = vals;
                else {
                    int num = 0;
                    int den = 0;
                    for(int i = 1; i < vals.length; i++) {
                        if(vals[i].equals(ans[i])) num++;
                        den++;
                    }
                    
                    System.out.println(vals[0] + "  " + num + "/" + den);
                }
            }
        } 
        catch (FileNotFoundException e) {   
            e.printStackTrace();
        }
    }
}