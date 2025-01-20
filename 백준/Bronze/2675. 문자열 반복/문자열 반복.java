import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> input = new ArrayList<>();
        
        int i = 0;
        while(sc.hasNextLine()) {
            input.add(sc.nextLine());
            i++;
        }
        
        
        String[] temp;
        int testTime = 0;
            
        for(int j =0; j < input.size(); j ++) {

            if(j == 0) {
                testTime = Integer.parseInt(input.get(j));
                if (testTime < 1 || testTime > 1000) {
                    return;
                }
            } else {
             temp = input.get(j).split(" ", 2);
            if(temp.length == 2) {
                int R = Integer.parseInt(temp[0]);
                String S = temp[1];
            
                if((R >= 1 && R <=8) && (S.length() >= 1 && S.length() <= 20)) {

                    for(int l = 0; l < temp[1].length(); l++) {
                         for(int k = 0; k < Integer.parseInt(temp[0]); k++) {
                            System.out.print(temp[1].charAt(l));
                         }
                    }
                    System.out.println();

                }
            }  
                
            }
            
            
        }
        
    }
}