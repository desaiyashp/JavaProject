package edu.rw.lecture3.hw2;
import com.sun.org.apache.xpath.internal.objects.XString;
public class MySecondPracticeHomework {
    static String sentenceOne = "The different sizes available in table from ";
    static String sentenceTwo = " to ";
    static String sentenceThree = " with price starting $";
    public static void main(String[] args) {
        short minWidth = 99;
        int maxWidth = 8942;
        float tablePrice = 325.96478f;
        double accurateLength = 20.594408;
        String sentenceFour = " and minimum length of ";
        System.out.println(sentenceOne+minWidth+sentenceTwo+maxWidth+sentenceThree+tablePrice+sentenceFour+accurateLength);

    }
}
