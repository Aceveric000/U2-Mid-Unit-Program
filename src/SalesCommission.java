/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

find hourly rate
find hours worked
figure out sales comission
total sale of last car





 */

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SalesCommission {



    public static void main(String[] args) {
        double money = getInput("how much do you make an hour? ");
    double hours = getInput("how many hours do you put in? ");
    double commission = getInput("what is your commission? ");
    double sales = getInput("what are the sales? ");



        JOptionPane.showMessageDialog(null, "the pay with cost is " + pay (money,hours) + "\n the commission is is" + salesC(commission,sales)  + "\n total check is");
    System.exit(0);

    }

    //input
    public static double getInput(String message){

        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }
    //hourly rate and hours
    public static double pay(double money, double hours) {
    return money * hours;
    }

    //salesC from user

    public static double salesC(double commission, double sales ){
        double rate = commission/100;
      return rate * sales;

        }
        public static double Check(double salesC, double pay){
        return salesC+ pay;
        }


        }


