package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int month;
        double bankaccount = 4000;
        double prir;
        for(month=0;month<10;month++){
            if(month<3){
                prir=bankaccount*0.06;
                bankaccount=bankaccount+prir;
            }
            else {
                prir=bankaccount*0.048;
                bankaccount=bankaccount+prir;
            }
            System.out.println(prir);
        }
        System.out.println();
        bankaccount=4000;
        for(month=0;month<10;month++){
            if(month==2){
            }
            else {
                if(month<3){
                    prir=bankaccount*0.06;
                    bankaccount=bankaccount+prir;
                }
                else {
                    prir=bankaccount*0.048;
                    bankaccount=bankaccount+prir;
                }
            }
            System.out.println(bankaccount);
        }
    }
}