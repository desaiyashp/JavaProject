package edu.rw.lecture6.hw1;

public class ModifierOne {
    static float a = 50f;
    static float b = 20f;

    public void runLogicPublic(){
        float c = a/b;
        boolean ans1 = c<0;
        System.out.println(c);                          // 2.5
        System.out.println(ans1);                       // false
    }
    private void runLogicPrivate(){
        float c= a*b;
        boolean ans2 = (c>b && c>a);
        System.out.println(c);                         // 1000
        System.out.println(ans2);                      // true
    }
    protected void runLogicProtect(){
        float c = a+b;
        boolean ans3 = (c<100 || c>50);
        System.out.println(c);                         // 70
        System.out.println(ans3);                      // true
    }
    void runLogicDefault(){
        float c = a-b-12.49f;
        boolean ans4 = (!(c<b) && (c!=0));
        System.out.println(c);                          // 17.51
        System.out.println(ans4);                       // false

    }

    public static void main(String[] args) {
        ModifierOne myObj = new ModifierOne();
        myObj.runLogicPublic();
        myObj.runLogicPrivate();
        myObj.runLogicProtect();
        myObj.runLogicDefault();

    }
}
