import java.lang.Math;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Main mainObject = new Main();
        mainObject.talkingcycle();
        System.out.println("\n");
        mainObject.timerfor();
        System.out.println("\n");
        mainObject.timerwhile();
        System.out.println("\n");
        mainObject.clockfor();
        System.out.println("\n");
        mainObject.mathbad();

    }
    private void talkingcycle() {
        Scanner stringInput = new Scanner(System.in);
        int x = 1;
        System.out.println("Enter a letter you want to cycle: ");
        String letter = stringInput.nextLine();

        for (int i = 1; i <= 50; i++) {
            System.out.println("Cycle For: " + letter + ", it was said " + i + " times.");
        }

        while (x <= 50) {
            System.out.println("Cycle While: " + letter + ", it was said " + x + " times.");
            x++;
        }
    }
    private void timerfor() {
        int minFor, hoursFor = 0;
        for (minFor = 0; minFor < 61; minFor++) {
            if (minFor == 60) {
                hoursFor++;
                minFor = 0;
                if (hoursFor == 12) break;
            }
            System.out.println("Time: " + hoursFor + " hours " + minFor + " minutes. (FOR)");
        }
    }
    private void timerwhile(){
        int hoursWhile = 0;
        int minWhile = 0;

        while (hoursWhile < 12) {
            if (minWhile == 60) {
                hoursWhile++;
                minWhile = 0;

                if (hoursWhile == 12) break;
            }
            System.out.println("Time: " + hoursWhile + " hours " + minWhile + " minutes. (WHILE)");
            minWhile++;
        }
    }
    private void clockfor(){
        int sec, m = 0, h = 0;

        for(sec=0; sec<61; sec++) {
            if (sec == 60) {
                m++;
                sec = 0;
                if (m == 60) {
                    h++;
                    m = 0;
                    if (h == 12) break;
                }
            }

            System.out.println("Time: " + h + " hours " + m + " minutes and " + sec + " seconds.");
        }
    }
    private void mathbad(){
        float start1 = 3, end1 = 6.0F, step1 = 0.2F;
        int countWhile = 0;

        while (start1 <= end1) {
            float y1 = (float) myFunctionWhile(start1);
            System.out.println("(WHILE) f(" + start1 + ") = " + y1);
            countWhile++;
            start1 += step1;
        }
        printCountMessage(countWhile);
        float end2 = 6, step2 = 0.2F;
        int countFor = 0;
        for (float start2 = 3; start2 <= end2; start2 += step2) {
            float y2 = (float) myFunctionFor(start2);
            System.out.println("(FOR) f(" + start2 + ") = " + y2);
            countFor++;
        }
        printCountMessage(countFor);
    }

    private static double myFunctionWhile(float start1) {
        return 0.25*Math.pow(start1,3)+start1+1.2502;
    }
    private static double myFunctionFor(float start2) {
        return 0.25*Math.pow(start2,3)+start2+1.2502;
    }
    private static void printCountMessage(int count) {
        if (count == 0) {
            System.out.println("No functions found in the specified range.");
        } else {
            System.out.println("Numbers of function in given range: " + count);
        }
    }
}




