import java.util.Scanner;
import java.lang.Math;

public class Main {

    // r 31 m 1234567891
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int stringLength = Integer.parseInt(sc.nextLine());
        String inputString = sc.nextLine();

        int r = 31;
        long m = 1234567891l;

        Long sum = 0l;

        char temp;
        Long tempInt = 0l;
        if (stringLength < 1 || stringLength > 50) {
            return;
        }
        for (int i = 0; i < stringLength; i++) {
            temp = inputString.charAt(i);

            // 아스키코드 값 알면 이렇게 안해도 될 것 같음
            switch (temp) {
                case 'a':
                    tempInt = 1l;
                    break;
                case 'b':
                    tempInt = 2l;
                    break;
                case 'c':
                    tempInt = 3l;
                    break;
                case 'd':
                    tempInt = 4l;
                    break;
                case 'e':
                    tempInt = 5l;
                    break;
                case 'f':
                    tempInt = 6l;
                    break;
                case 'g':
                    tempInt = 7l;
                    break;
                case 'h':
                    tempInt = 8l;
                    break;
                case 'i':
                    tempInt = 9l;
                    break;
                case 'j':
                    tempInt = 10l;
                    break;
                case 'k':
                    tempInt =11l;
                    break;
                case 'l':
                    tempInt = 12l;
                    break;
                case 'm':
                    tempInt = 13l;
                    break;
                case 'n':
                    tempInt = 14l;
                    break;
                case 'o':
                    tempInt = 15l;
                    break;
                case 'p':
                    tempInt = 16l;
                    break;
                case 'q':
                    tempInt = 17l;
                    break;
                case 'r':
                    tempInt = 18l;
                    break;
                case 's':
                    tempInt = 19l;
                    break;
                case 't':
                    tempInt = 20l;
                    break;
                case 'u':
                    tempInt = 21l;
                    break;
                case 'v':
                    tempInt = 22l;
                    break;
                case 'w':
                    tempInt = 23l;
                    break;
                case 'x':
                    tempInt = 24l;
                    break;
                case 'y':
                    tempInt = 25l;
                    break;
                case 'z':
                    tempInt = 26l;
                    break;
                default:
                    return;
                
            }


            sum += (tempInt * (long)Math.pow(r, i));
        
        }

        System.out.print(sum % m);

    }

}
