/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.slc;

import com.leapfrog.slc.marksheet.MarkSheet;
import java.util.Scanner;

/**
 *
 * @author zak
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MarkSheet marksheet = new MarkSheet(input);

        while (true) {
            marksheet.entry();
            System.out.println("Total Marks Obtained = " + marksheet.marksObtained());
            System.out.println("Percentage = " + marksheet.getPercentage());
            if (marksheet.isFail()) {
                System.out.println("You have Failed!!!");
            } else {
                System.out.println("Grade = " + marksheet.getGrade());
            }
            System.out.println("Do you want to continue[Y/N]:");
            if (input.next().equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }

    }

}
