package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter your hours worked: ");
        float hoursWorked = input.nextFloat();
        System.out.print("Enter your pay rate: ");
        float payRate = input.nextFloat();

        float grossPay;

        grossPay = getGrossPay(hoursWorked, payRate);

        System.out.printf("%s worked %.2f hrs. Gross pay is $%.2f", employeeName, hoursWorked, grossPay);


    }

    private static float getGrossPay(float hoursWorked, float payRate) {
        float grossPay;
        if (hoursWorked > 40)
        {
            float overTime = hoursWorked - 40;
            float overTimePay = (overTime * 1.5f * payRate);
            grossPay = (40 * payRate) + overTimePay;
        }
        else
        {
            grossPay = hoursWorked * payRate;
        }
        return grossPay;
    }
}
