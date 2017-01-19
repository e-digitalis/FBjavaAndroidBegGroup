/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginnerTasks;

/**
 *
 * @author User
 */
public class SummingToN {

    public static void main(String[] args) {
        long sum = 0;
        int n = 8;
        for (int counter = 1; counter <= n; counter++) {
            sum += counter;
        }
        System.out.println(sum);

    }
}


/*
Complete the method to return the sum of the following series upto n terms:
0+1+2+3+4+5+....+n
long sum(int n){
//do the coding
return answer;
}
 */
