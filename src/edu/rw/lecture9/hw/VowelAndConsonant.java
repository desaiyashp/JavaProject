package edu.rw.lecture9.hw;

public class VowelAndConsonant {
    String newText = "Hello, Niravbhai, Good Morning!";
    void findVowelInString (String inputText){
        String lowerCaseText = inputText.toLowerCase();     // converted input text into lowercase
        char[] vowelList = {'a','e','i','o','u'};           // defined & initialised array of vowel
        char[] consonantList = {'q','w','r','t','y','p','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        int i;
        int vowel=0;
        int consonant = 0;
        for (i = 0; i < lowerCaseText.length(); i++) {
            for (char eachVLetter : vowelList) {
                if (lowerCaseText.charAt(i) == eachVLetter) {
                    System.out.println("Index " + i + " is a vowel " + lowerCaseText.charAt(i));
                    vowel++;
                }
            }
            for (char eachCLetter : consonantList) {
                if (lowerCaseText.charAt(i) == eachCLetter) {
                    consonant++;
                }
            }
        }

        System.out.println("-----------------------------");
        System.out.println("Total number of indexes in this String are "+(i-1));
        System.out.println("No of Vowels: "+vowel);
        System.out.println("No of Consonants: "+consonant);
    }

    public static void main(String[] args) {
        VowelAndConsonant findVowelInText = new VowelAndConsonant();
        findVowelInText.findVowelInString(findVowelInText.newText);
    }
}
