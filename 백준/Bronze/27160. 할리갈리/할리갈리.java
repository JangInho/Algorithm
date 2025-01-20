import java.util.Scanner;
import java.util.ArrayList;

class Card {
    String name;
    int count;
    
    public Card(String name, int count) {
        this.name = name;
        this.count = count;
    } 
}

class Main {
    public static void main(String[] args) {
        int sCount = 0;  
        int bCount = 0;
        int lCount = 0;
        int pCount = 0;
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Card> input = new ArrayList<>();
        
        int i = 0;
        int N = 0;
        String temp = "";
        while(sc.hasNextLine()) {
            if(i == 0) {
                N = Integer.parseInt(sc.nextLine());
                if (N > 100000) { return; }                           
                i++;
                continue;
            }
            
            if (i == 100000) { return; }           
           
            temp = sc.nextLine();
            input.add(new Card(temp.split(" ", 2)[0], Integer.parseInt(temp.split(" ", 2)[1])));
        }
        
        for (int j = 0; j < N; j++) {
            switch(input.get(j).name) {
                case "STRAWBERRY":
                    sCount += input.get(j).count;
                    break;
                case "BANANA":
                    bCount += input.get(j).count;
                    break;
                case "LIME":
                    lCount += input.get(j).count;
                    break;
                case "PLUM":
                    pCount += input.get(j).count;
                    break;
            }
        }
                      
        if (sCount == 5 || bCount == 5 || lCount == 5 || pCount == 5) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        
    }
}