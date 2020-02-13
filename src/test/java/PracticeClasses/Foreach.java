package PracticeClasses;

import java.lang.reflect.Array;

public class Foreach {
    public int[] fillingWithNumbers(int[] array){
        int len = array.length;
        for(int i=0; i < len; i++){
            array[i] = (int)(Math.random()*10)+1;
        }
        return array;

    }
    public void foreachSyntax(){
        short size = 8;
        int [] array = new int[size];
        array = fillingWithNumbers(array);
        bubbleMethod(array);
        for (int i:array) {
            System.out.println(i);
            
        }


    }
    public int[] bubbleMethod(int[] array){
        int len = array.length;
        int replace = 0;
        for(int i =0; i < len-1; i++){
            for(int j=0; j < len-1; j++){
                if(array[j] > array[j+1]){
                    replace = array[j+1];
                    array[j+1] = array[j];
                    array[j] = replace;
                }
            }
        }
        return array;
    }

}
