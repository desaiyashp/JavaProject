package edu.rw.lecture9.hw;

public class VowelAndConsonant {
    String newText = "Hello, World!";
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
        System.out.println("Length of String is: "+inputText.length());
        System.out.println("Total index value is: "+(i-1));
        System.out.println("-----------------------------");
        System.out.println("No of Vowels: "+vowel);
        System.out.println("No of Consonants: "+consonant);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        VowelAndConsonant findVowelInText = new VowelAndConsonant();
        findVowelInText.findVowelInString(findVowelInText.newText);
    }
}
