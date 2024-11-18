package Assigment;

import java.util.Scanner;

public class TextInputMain {
    public static void main(String[] args) {
        TextInfotLogik textInfo = new TextInfotLogik();

        Scanner scan = new Scanner(System.in);


        System.out.println("Skriv in ditt text här & skriv ordet STOP för att avsluta:");
        // Använder while för att loop ska köras fram tills användaren skriver ordet stop.
        while (true) {
            String textInput = scan.nextLine();
            if (textInfo.isStop(textInput)) {
                break;

            }
            // kallat på metoden för att beräkningen ska köras så länge loopen är sann.
            textInfo.calculation(textInput);
        }


        System.out.println("Din text har så här många rader: " + textInfo.getNumOfLine());
        System.out.println("Din text har så här många tecken: " + textInfo.getNumOfChar());
        System.out.println("Ditt antalord är: " + textInfo.getword());
        System.out.println("Ditt längsta ord är: " + textInfo.getLongestWord());


    }
}
