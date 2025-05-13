import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {

        // version 2.0

        Scanner scanner = new Scanner(System.in);

        boolean stillRunning = true;
        char[] vowels = {'a','e','i','o','u'};

        vowelRules();

        while (stillRunning) {
            int vowelCount = 0;

            System.out.print("Enter word/s: ");
            String result = scanner.nextLine().toLowerCase(); // user input

            // exit program
            if (result.equalsIgnoreCase("0")){
                System.out.println("You've ended the program.");
                break;
            }

            for (int i=0; i<result.length(); i++){
                for (int j=0; j<vowels.length; j++){

                    if (vowels[j] == result.charAt(i)){
                        vowelCount++; // counts each vowel
                    }
                }
            }

            if (vowelCount == 1){
                System.out.println(result + " -> " + vowelCount + " vowel");
            } else {
                System.out.println(result + " -> " + vowelCount + " vowels");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void vowelRules(){
        System.out.println("Type any word for vowel count");
        System.out.println("Type '0' to exit\n");
    }
}