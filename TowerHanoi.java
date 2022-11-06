// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

import java.util.Scanner;

public class TowerHanoi {

    private static void towerHanoi(int n, String start , String tmp, String end) {

        if (n == 1) {
            System.out.println("Move the disc from pin " + start + " to pin " + end);
        } else {
            towerHanoi(n - 1, start, end, tmp);
            System.out.println("Move the disc from pin " + start + " to pin " + end);
            towerHanoi(n - 1, tmp, start, end);
        }          
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of discs: ");
        int n = sc.nextInt();
        sc.close();
        towerHanoi (n,"A","B","C");        
    }  
}