import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        System.out.print(Integer.parseInt(input.split(" ", 2)[0]) + Integer.parseInt(input.split(" ", 2)[1]));
    }
}