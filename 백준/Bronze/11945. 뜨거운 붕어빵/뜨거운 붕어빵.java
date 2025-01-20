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
        

        int N = Integer.parseInt(input.get(0).split(" ", 2)[0]);
        int M = Integer.parseInt(input.get(0).split(" ", 2)[1]);
        
        if (N <= 0 || M > 10) {
            return;
        } 
        
        for(int j = 1; j < N + 1; j++) {
            for(int k = M - 1 ; k >= 0; k--) {
                System.out.print(input.get(j).charAt(k));
            }
            System.out.println();
        }   
        
    }
}