package edu.rw.lecture9;

public class FirstArray {        /*    Collection of Variables
                                          no limit of variables, however we can fix the limit
                                          non-primitive - (non-fixed in size)
         Syntax = <DataType>[] <VariableName> = {Value1, Value2, value3, .., ..};
                                                {Index0, Index1, Index2, .., ..};

        */
    static int[] newVariable;
    float[] newDecimal;

    public static void main(String[] args) {
            int [] arr = {10,20,20,30,30};   // unlimited array
            int arrLength = arr.length;
        String  senOne = "my Name is Superstar";
        int senOneLength = senOne.length();
        System.out.println(senOneLength);     // 20

        String[]  senOneArrey = {"my Name is Superstar"};
        int senOneLengthArrey = senOneArrey.length;
        System.out.println(senOneLengthArrey);  // 1


        FirstArray newObj = new FirstArray();
        newObj.newDecimal = new float[5];
        newObj.newDecimal[0]=232.23f;
        newObj.newDecimal[1]=737.23f;
        newObj.newDecimal[2]=434.23f;
        newObj.newDecimal[3]=23.23f;
        newObj.newDecimal[4]=882.23f;

        for (int i =newObj.newDecimal.length-1; i>=0; i--){
            System.out.print(newObj.newDecimal[i]+", ");
        }
        System.out.println();
        for (float newValue : newObj.newDecimal) {
            System.out.print(newValue+", ");
        }

        int[] newNumber;
        newNumber = new int[]{23, 93, 20, 29, 49};

        newVariable=new int[]{43,23,23,32};
    }
}
