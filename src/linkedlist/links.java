/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Jared Gamutin
 */
public class links extends Linkedlist {

    Scanner scan;
    LinkedList<String> list;
    public int linkCount = 0;
    int n, size, price;
    String name, model, color, element;
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);
    Scanner scanner4 = new Scanner(System.in);
    Scanner scanner5 = new Scanner(System.in);
    Scanner scanner6 = new Scanner(System.in);
    int num;

    void getLink() {

        scan = new Scanner(System.in);
        list = new LinkedList<String>();

        System.out.println("Laptop Linked List");

        System.out.println("\nHow many would you like to enter?");
        System.out.print("==>  ");
        n = scan.nextInt();
        linkCount = n;

        for (int i = 0; i < n; i++) {
            num = i + 1;
            ask();
            list.add(element);
        }
        System.out.println("");
    }

    void ask() {
        System.out.println(num + ": " + " Laptop Brand : ");
        name = scanner1.nextLine();
        System.out.println(num + ": " + "Laptop Model : ");
        model = scanner2.nextLine();
        System.out.println(num + ": " + "Laptop Color : ");
        color = scanner3.nextLine();
        System.out.println(num + ": " + "Laptop Size : ");
        size = scanner4.nextInt();
        System.out.println(num + ": " + "Laptop Price : ");
        price = scanner5.nextInt();
        element = name + "--" + model + "--" + color + "--" + Integer.toString(size) + "--" + Integer.toString(price);
        scanner1.reset();
        scanner2.reset();
        scanner3.reset();
        scanner4.reset();
        scanner5.reset();
        num = 1;
    }

    void DisplayLink() {
        System.out.println("Link Count: " + linkCount + "");
        System.out.println("\n--==Linked List==--");

        for (int i = 0; i < list.size(); i++) {
            int count = i + 1;
            System.out.print(count + ": ");
            System.out.println(list.get(i));
        }
        System.out.println("");
    }

    void AddLink() {

        boolean again;
        do {
            System.out.println("Enter the number where you like to insert");
            System.out.print("==>  ");
            int index = scan.nextInt();
            if (index > linkCount) {
                System.out.println("Invalid Input");
            } else if (index >= 1 || index <= linkCount) {
                System.out.println("Enter name");
                ask();
                list.add(index - 1, element);
                linkCount++;
                break;
            } else {
                System.out.println("\nInvalid Input");
            }

        } while (again = true);

        System.out.println("");
        System.out.println("Updating...");
        DisplayLink();
        System.out.println("");
    }

    void RemoveLink() {

        System.out.println("\nRemoving Data...");

        boolean again;

        do {

            System.out.println("Enter the number of the link you want to remove");
            System.out.print("==>  ");
            int index = scan.nextInt();
            if (index > linkCount) {
                System.out.println("Invalid Input");
            } else if (index >= 1 || index <= linkCount) {

                list.remove(index - 1);
                linkCount--;
                break;
            } else {
                System.out.println("\nInvalid Input");
            }
        } while (again = true);

        System.out.println("Updating...");
        DisplayLink();
        System.out.println("");
    }

    void findlist() {
        ask();
        String searchElement = element;

        if (list.contains(searchElement)) {
            System.out.println("Search result : " + searchElement + " WAS FOUND on the Linked List");
        } else {
            System.out.println("Search result : " + searchElement + " WAS NOT FOUND in the Linked List");
        }

    }}
