package Assigment;

public class TextInfotLogik {
    // Fyra attributer för att hålla koll på antaltecken,rader, antal ord & spara längsta ordet.
    private int numOfChar;
    private int numOfLine;
    private int words;
    private String longestWord;

    //har skapat konstroktur på att sätta startvärden för attributen,
    //även om Java automatiskt ger värdet 0 och null för text.
    public TextInfotLogik() {
        // Har gett inne i konstrokturn startvärden för attributerna som börjar med 0 och med tomt ord.
        numOfChar = 0;
        numOfLine = 0;
        words = 0;
        longestWord = "";

    }
    /*skapat en metod som ger oss returntype en boolean för att
    vi behöver veta om textinput är lika med stop och boolean ger oss
     ett svaar om det är sant eller falskt.*/

    public boolean isStop(String textInput) {
        boolean isStop = false;  // ger startvärden t false,vi antar att användaren skriver text sen ordet stop.
        if (textInput.equalsIgnoreCase("stop")) {
            isStop = true;
        }//om användaren skriver ordet stop oavsett om hen skriver med stora eller små tecken då ska det ändras till true.
        return isStop;// här vill jag skicka tillbaka isstop för att ge mig svar om texten är stop, för att loopen ska kunna stannas.

    }

    // Skapat en metod för att se processen för rader, tecken,antalord och längstaordet.
    public void calculation(String textInput) {

        numOfLine++; // Varje gång användaren skriver text ökas variabeln numOfLine med 1.
        numOfChar += textInput.length(); // Antal tecken sparas/läggstill på variabeln numOfChar.

        // Delat upp texten i ord med hjälp av en array och uppdatera wordvariablen.
        // För varje input så skapas det en ny arrays att gå igenom varje ord.
        String[] splitWords = textInput.split(" ");
        words += splitWords.length;


        //Skapat en foreach för att gå igenom varje ord i en arrays.
        for (String eachWord : splitWords) {
            if (eachWord.length() > longestWord.length()) { //kollar om ordet i eachword.length är större än det ordet som vi sparat i variablen longestword.
                longestWord = eachWord;// här upptaderar vi longestword variablen med det längsta ordet
                                       // t.ex. i början har vi haft Fitore, nu ändras det till FitoreShehu


            }

        }


    }

    // Gjort get-metoder för att kunna använda attributens värden i main-klassen eftersom dem är privata.
    public int getNumOfChar() {
        return numOfChar;
    }

    public int getNumOfLine() {
        return numOfLine;
    }

    public int getword() {
        return words;
    }

    public String getLongestWord() {
        return longestWord;
    }
}