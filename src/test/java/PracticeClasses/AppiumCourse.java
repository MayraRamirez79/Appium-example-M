package PracticeClasses;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class AppiumCourse {
    ///variable
    //float     4 bytes of space
    //double    8 bytes of space

    //byte      1 byte of space in memory 2 raise 8 to raise 8-1(-256 to 255)
    //short     2 bytes of space
    //int       4 bytes of space
    //long      8 bytes of space
    short b = 21;


    //constants
    //values cannot be changed and they are defined with "final" word
    final int constant = 20;

    final String company;

    public AppiumCourse(String companyName){
        this.company= companyName;
    }

    public void hello(){
        System.out.println("Hello World");
    }
    public String getCompanyName(){
        return company;
    }


    //functions
    //constructor


    public void StringWorking(String answer) {
        String str = "Hello Miguel";
        String str2 = "hello";
        String str3 = "HELLO";
        answer= answer.toLowerCase();

        switch (answer){
            case "equals":
                System.out.println("Equals");
                if(str.equals(str2)){

                    System.out.println("Both strings are equals");
                }else{
                    System.out.println("Both strings are not equals");
                }
                break;
            case "equalsignorecase":
                //this function compare strings ignoring the upper and lower cases
                System.out.println("EqualsIgnoreCase");
                if(str2.equalsIgnoreCase(str3)){
                    System.out.println("Both strings are equals");
                }else{
                    System.out.println("Both strings are not equals");
                }
                break;
            case "compareto":
                System.out.println("CompareTo");
                //this function compare strings and returns 0 if true
                if(str2.compareTo(str3)==0){
                    System.out.println("Both strings are equals");
                }else{
                    System.out.println("Both strings are not equals");
                }
                break;
            case "comparetoignorecase":
                System.out.println("CompareToIgnoreCase");
                //this function compare strings ignoring the upper and lower cases and returns 0 if true
                if(str2.compareToIgnoreCase(str3)==0){
                    System.out.println("Both strings are equals");
                }else{
                    System.out.println("Both strings are not equals");
                }
                break;
                default:
                    System.out.println("No valid option");
                    break;
        }

        if (str.equals("hello")){
            System.out.println("Both phrases are Equals");
        }

    }
}
