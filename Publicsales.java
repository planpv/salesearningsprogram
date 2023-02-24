package com.mycompany.publicsales;

/**
 *
 * @author Phillip Plangetis
 * Date: 2/21/23
 * Program: Gross Income and Commission Calculator
 */

public class Publicsales {
    public static void main(String[] args) {
        int salary = 200;
        int counter[] = new int[18];
        System.out.println("The Employees Salary    " + "Bonuses");
        
        for (int i = 0; i < 18; i+=2) {
            counter[i] = salary; counter[i+1] = salary+99;
            salary+=100;
        }
        for (int i =0; i <18; i+=2) {
            if ( i == 16)
                System.out.println("$"+counter[i] +"" +"+" +
                        "\t\t" +"$" + (int)(counter[i]*0.09 +200)+"+");
            else
                System.out.println("$"+counter[i] +"-" +"$" + counter[i+1]
                        +"\t\t" +"$" + (int)(counter[i]*0.09 +200)+"-"+"$" +
                        (int)(counter[i+1]*0.09 +200));
    }
  }
}

            /**System.out.println("The employees 
            salaries are: " salary 
            " with a bonus of: "+ bonus "."); **/