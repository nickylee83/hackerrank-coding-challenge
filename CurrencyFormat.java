package hacker_rank;

import java.util.*;
import java.text.*;

public class CurrencyFormat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter amount: ");
        double payment = 12324.134;// scanner.nextDouble();
        scanner.close();
        
        NumberFormat df = NumberFormat.getCurrencyInstance();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("Rs.");
        ((DecimalFormat) df).setDecimalFormatSymbols(dfs);
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = df.format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}