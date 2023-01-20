/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Scanner;

/**
 *
 * @author Jared Gamutin
 */
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        links linked = new links();
        int choice;

        linked.getLink();
        boolean again;

        do {

            System.out.println("What would you like to do?");
            System.out.println("1. Display list");
            System.out.println("2. Insert to list");
            System.out.println("3. Remove from list");
            System.out.println("4. Find from list");
            System.out.println("5. Exit Program");
            System.out.println("");
            System.out.print(">>>  ");
            choice = input.nextInt();

            if (choice == 1) {
                linked.DisplayLink();
            } else if (choice == 2) {
                linked.AddLink();
            } else if (choice == 3) {
                linked.RemoveLink();
            } else if (choice == 4) {
                linked.findlist();
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("invalid input\n\n");
            }

        } while (again = true);

    }

}
