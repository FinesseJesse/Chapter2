/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chapter2;

/**
 *
 * @author jswai
 */
import java.util.Scanner;

public class Chapter2 {

  public static void main (String [] args) {   
  Scanner input = new Scanner (System.in);

  System.out.println ("Enter a value for feet: ");
  double value = input.nextDouble();
  double meters = value/3.2808;
  System.out.println (value + " feet is " + meters + " meters ");

    }
}