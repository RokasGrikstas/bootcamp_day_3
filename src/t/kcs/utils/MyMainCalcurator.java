package t.kcs.utils;

import java.util.Scanner;

public class MyMainCalcurator {

    public static void main(String[] args) {

        boolean val = Skaiciavimai.isNumberNegative(9);
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite skaiciu");
        int i = 0;


        if(val){
            System.out.println("lyginis");
        }else{
            System.out.println("nelyginis");
        }
    }
}
