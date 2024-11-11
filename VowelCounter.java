import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Prompt the user for a string and store it in inputString.
        // Initialize Vowel Counter: vowelCount will store the number of vowels.
        // Convert to Lowercase: Converting inputString to lowercase simplifies the comparison, making it case-insensitive.
        // Loop through Characters: For each character in the string, check if it’s a vowel.
        // Increment Counter: Each time a vowel is found, increase vowelCount.
        // Display Result: Output the total number of vowels in the string.

        intro();
        System.out.println(countVowels(scan));

    }

    public static int countVowels(Scanner scan){
        char[] vowels = {'a','e','i','o','u'};
        int vowelCount = 0;

        System.out.print("Enter word (type 0 to quit): ");
        String inputString = scan.nextLine();

        if (inputString.equals("0")){
            System.out.println("Program has ended.\n");
            System.exit(0);
        }

        for (int i=0; i<inputString.length(); i++){
            for (int j=0; j<vowels.length; j++) {

                if (inputString.charAt(i) == vowels[j]) {
                    vowelCount++;
                }
            }
        }

        if (vowelCount == 1) {
            System.out.println("\"" + inputString + "\" has " + inputString.length() +
                    " letters and " + vowelCount + " vowel.\n");
        } else {
            System.out.println("\"" + inputString + "\" has " + inputString.length() +
                    " letters and " + vowelCount + " vowels.\n");        }

        return countVowels(scan);
    }

    public static void intro(){
        System.out.println("++ Vowel Counter ++");
    }
}
