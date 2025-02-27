package org.example.wordleapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;


public class Answer {
    static String filePath = "/wordle-words.txt";  // Path to your .txt file
    static String[] words = readWordsFromFile(filePath);
   // static String[] wordList = {"stock ", "chair", "table", "peach", "joint", "glare", "hoist", "grape", "stain"};
//    private Random random =  new Random();
//    int randomIndex = random.nextInt(wordList.length);
//    String word = wordList[randomIndex];
    public static String setWordleAnswer() {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }


        public static String[] readWordsFromFile(String filePath) {
            ArrayList<String> wordList = new ArrayList<>();  // Use ArrayList to dynamically store words

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                    Answer.class.getResourceAsStream(filePath)))) {
                String line;

                // Read the file line by line
                while ((line = reader.readLine()) != null) {
                    wordList.add(line.trim());  // Add the word (remove any extra spaces)
                }
            } catch (IOException e) {
                e.printStackTrace();  // Handle any potential I/O errors
            }

            // Convert ArrayList to String[] and return it
            return wordList.toArray(new String[0]);
        }

    public static ArrayList<String> stringToLetterArrayList(String str) {
        // Create an empty ArrayList
        ArrayList<String> letterList = new ArrayList<>();

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // Add each character as a string to the ArrayList
            letterList.add(String.valueOf(str.charAt(i)));
        }

        return letterList;
    }

    public static boolean checkGuess(ArrayList<String> guessedWord) {
        boolean wordFound = false;
        String guessedWordString = "";
        for (String word : guessedWord) {
            guessedWordString += word;
        }

        for (String word : words) {
            if (guessedWordString.equalsIgnoreCase(word)) {
                wordFound = true;
            }
        }

        return wordFound;
    }




}
