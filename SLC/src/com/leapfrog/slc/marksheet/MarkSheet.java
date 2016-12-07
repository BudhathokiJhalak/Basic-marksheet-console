/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.slc.marksheet;

import java.util.Scanner;

/**
 *
 * @author zak
 */
public class MarkSheet {

    Scanner input;
    double eng, nep, math, comp, acc;
    double fullMarks = 500;
    int passMarks = 32;

    public MarkSheet() {
    }

    public MarkSheet(Scanner input) {
        this.input = input;
    }   

    public void entry() {
        System.out.println("Please enter marks of English:");
        eng = input.nextInt();
        System.out.println("Please enter marks of Nepali:");
        nep = input.nextInt();
        System.out.println("Please enter marks of Math:");
        math = input.nextInt();
        System.out.println("Please enter marks of Computer:");
        comp = input.nextInt();
        System.out.println("Please enter marks of Account:");
        acc = input.nextInt();
    }

    public boolean isFail() {
        return (eng < passMarks || nep < passMarks || math < passMarks || comp < passMarks || acc < passMarks);
    }

    public double marksObtained() {
        return (eng + nep + math + comp + acc);
    }

    public double getPercentage() {
        return (marksObtained() / fullMarks) * 100;
    }

    public double getTotal() {
        return (eng + nep + math + comp + acc);
    }

    public String getGrade() {
        double percentage = getPercentage();
        String grade = "";
        if (percentage >= 80) {
            return grade = "Distinction";
        } else if (percentage < 80 && percentage >= 60) {
            return grade = "First Division";
        } else if (percentage < 60 && percentage >= 45) {
            return grade = "Second Division";
        } else if (percentage < 45 && percentage >= 32) {
            return grade = "Third Division";
        }
        return grade;
    }

}
