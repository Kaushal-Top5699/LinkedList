package com.kaushaltop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        boolean quit = false;

        printMenu();

        while (!quit) {

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    printMenu();
                    break;

                case 2:
                    System.out.println("Enter value for insertion: ");
                    int firstVal = scanner.nextInt();
                    linkedList.insertAtFirst(firstVal);
                    break;

                case 3:
                    System.out.println("Enter value for insertion: ");
                    int lastVal = scanner.nextInt();
                    linkedList.insertAtLast(lastVal);
                    break;

                case 4:
                    System.out.println("Enter position for insertion: ");
                    int insertPos = scanner.nextInt();
                    System.out.println("Enter value for insertion: ");
                    int insertVal = scanner.nextInt();

                    linkedList.insertAtPos(insertVal, insertPos);
                    break;

                case 5:
                    System.out.println("Deleting first node...");
                    linkedList.deleteAtFirst();
                    break;

                case 6:
                    System.out.println("Deleting last node...");
                    linkedList.deleteAtLast();
                    break;

                case 7:
                    System.out.println("Enter position of to be removed: ");
                    int removePos = scanner.nextInt();
                    linkedList.deleteAtPos(removePos);
                    break;

                case 8:
                    linkedList.displayList();
                    break;

                case 9:
                    quit = true;
                    break;

                default:
                    System.out.println("Invalid Choice!!");
            }
        }
    }

    public static void printMenu() {

        System.out.println("1) Print Menu");
        System.out.println("2) Add item at start of the list");
        System.out.println("3) Add item at last of the list");
        System.out.println("4) Add item at specific position in the list");
        System.out.println("5) Delete first item from the list");
        System.out.println("6) Delete last item from the list");
        System.out.println("7) Delete specific position item from the list");
        System.out.println("8) View List");
        System.out.println("9) Quit");
    }
}
