import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputStrings = new String[5];
        int maxLength = 0;
        
        for(int i = 0; i < 5; i++) {
            inputStrings[i] = sc.nextLine();
            
            if (maxLength < inputStrings[i].length()) {
                maxLength = inputStrings[i].length();
            }
        }
        
        if(maxLength > 15) {
            maxLength = 15;
        }
        
        for(int j = 0; j < maxLength; j++) {
            for(int k = 0; k<5; k++) {
                if((inputStrings[k].length() < j+1)) {
                    
                } else {
                    System.out.print(inputStrings[k].charAt(j));
                } 
            }
        }
  
    }
}