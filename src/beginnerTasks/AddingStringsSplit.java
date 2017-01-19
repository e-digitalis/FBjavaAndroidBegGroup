/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginnerTasks;

import java.io.*;

/**
 *
 * @author User
 */
public class AddingStringsSplit {

    public static void main(String args[]) {
        addingStrings("5,10,15,25,100,1000");
    }

    public static void addingStrings(String s) {
        int result = 0;
   
        for (String splittedval : s.split(",")) {
            result += Integer.parseInt(splittedval);
        }

        System.out.println("Added value: " + result);
    }

    public static int addString(String str) {
        int total = 0;
        for (String splitstr : str.split(",")) {
            total += Integer.parseInt(splitstr);
        }
        return total;
    }

    public static void splittingTest() {
        String str = new String("Welcome-to-my-computing-home-!");
        System.out.println("Return Value :");

        for (String retval : str.split("-")) {
            System.out.println(retval);

            String stri = new String("5,10,15,25,100,1000");
            System.out.println("Return Value :");

            for (String retuval : stri.split(",")) {
                System.out.println(retuval);
            }

        }
    }
}

//System.out.println(addString("5,10,15,25,100,1000"));
//#Task Same as previous task (add int array), but this time we will add the contents of a String of numbers. Use the following String: 
//String numberString = "5,10,15,25,100,1000"; 
//Your method will look like: public static int addString(String str){ //Code return total; }

