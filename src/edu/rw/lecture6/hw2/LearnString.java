package edu.rw.lecture6.hw2;

public class LearnString {
    String senOne = "I feel very strong.";
    String senTwo = "        I want to win this world.";
    String senThr = "   The world is beautiful.      dwflskvladnv ";
    private void mySen (){

        String nSenTwo = senTwo.trim();
        String nSenThr = senThr.replace ("dwflskvladnv", "The day is bright");
        String nSenThr1 = nSenThr.replace (".",",");
        String nSenThr2 = nSenThr1.trim();
        String nSenThr3 = nSenThr2.replace ("      ", " ");   // showing result despite error
        String nSenThr4 = nSenThr3.toUpperCase();
        String nSenThr5 = nSenThr4.toLowerCase(java.util.Locale.ROOT);  // meaning of (java.util...)
        //        String nSenThr4 = nSenThr3.split(",",2);   // need to learn split() method

        System.out.println(senOne);
        System.out.println(nSenTwo);
        System.out.println(nSenThr3);
        System.out.println(nSenThr4);
        System.out.println(nSenThr5);

//        System.out.println(nSenThr4);
    }
    public void checkResult(){
        LearnString myObj = new LearnString();
        String name = "Nirav";

        boolean result1 = name.contains("N");        // result true is not generated.
        System.out.println(result1);
    }

    public static void main(String[] args) {
        LearnString myObj = new LearnString();
        myObj.mySen();
//        myObj.checkResult();
    }

    //Math class
    //StringBuffer

}
