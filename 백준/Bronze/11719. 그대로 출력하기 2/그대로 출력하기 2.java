import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
            
        ArrayList<String> inputStrings = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        
        while(sc.hasNextLine()) {
            if(i >= 100) {
                break;
            }
             inputStrings.add(sc.nextLine());
            i ++;
        }
        
        for(String j:inputStrings) {
            System.out.println(j);            
        }
      
    }
}