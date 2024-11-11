package pla.dev;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] =  50;
        double[] myDouble = new double[10];
        myDouble[1]= 3.45;

        System.out.println(myDouble[1]);

        int[] myNewIntArray = {1,2,3,4,5,6,7,8,9};

        System.out.println(myNewIntArray[myNewIntArray.length - 1]);

        int[] newArray;
        newArray = new int[] {1,2,3,4,5};

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        for (int element:newArray){
            System.out.println(element);
        }
        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;

        if(objectVariable instanceof int[]){
            System.out.println("The objecVariable is and instanse of int[]");
        }else {
            System.out.println("idk");
        }

        Object[] objectArrays = new Object[4];
        objectArrays[0] = 1;
        objectArrays[1] = '2';
        objectArrays[2] = newArray;
        objectArrays[3] = 12;

        System.out.println(Arrays.toString(objectArrays));



    }
}