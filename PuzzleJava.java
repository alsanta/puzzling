import java.util.Random;

public class PuzzleJava {
    
    public static int[] getTenRolls() {
        // Making the New instance of Random that we imported
        Random rand = new Random();
        // Making the New empty Array
        int [] myArr;
        // Initializing the Array and setting the max contents to be 10
        myArr = new int[10];
        for(int x = 0; x < 10; x++){
        // Using the random instance I made and telling it to give me a random 0-19
            int n = rand.nextInt(20);
        // We have to add the number in the array specifying the index number
        // Also since the random number will be 0-19 we have to add 1 to it
            myArr[x] = n+1;
        }
        return myArr;
    }

    public static String getRandomLetter(){
        // Making a new string array and setting all the values
        String[] myArr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        // Making the New instance of Random that we imported
        Random rand = new Random();
        // Getting the random number between 0-26
        int n = rand.nextInt(26);
        // Using the random number for the index of the string we made
        return myArr[n];
    }

    public static String generatePassword(){
        // Making a new empty string
        String myArr = "";
        // For loop to get 8 letters
        for(int x = 0; x < 8; x++){
        // Using the previous method to get a single letter for every loop and add to the string
            myArr += getRandomLetter();
        }
        return myArr;
    }

    public static String [] getNewPasswordSet(int num){
        // Make my empty array
        String myArr[];
        // Initialize it to have the lenght of the input
        myArr = new String[num];
        // The for loop that will make as many passwords as the lenght
        for (int x = 0; x < num; x++){
        // Make the indef of the array the 8 long string of letters
            myArr[x] = generatePassword();
            }
            return myArr;
    }
}