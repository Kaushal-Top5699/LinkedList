package com.kaushaltop;

import javax.management.NotificationEmitter;

public class LinkedList {

    private Node head;
    private int size;

    public LinkedList() {
    }

    public LinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    public boolean isEmpty() {

        if (head == null) {

            return true;
        } else {
            return false;
        }
    }

    public int getListSize() {

        return size;
    }

    public void displayList() {

        Node currentNode;

        if (isEmpty()) {

            System.out.println("List is empty");
        } else {

            currentNode = head;
            for (int i=1; i<=size; i++) {

                System.out.println(" "+currentNode.getData());
                currentNode = currentNode.getNext();
            }
        }
    }

    public void insertAtFirst(int data) {

        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void insertAtLast(int data) {

        Node newNode, currentNode;
        newNode = new Node();
        newNode.setData(data);

        currentNode = head;

        if (isEmpty()) {

            head = newNode;
        } else {

            while (currentNode.getNext() != null) {

                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        size++;
    }

    public void insertAtPos(int data, int position) {

        if (position == 1) {

            insertAtFirst(data);

        } else if (position == size+1){

            insertAtLast(data);

        } else if (position>1 && position<=size) {

            Node newNode, currentNode;
            newNode = new Node(data, null);

            currentNode = head;
            for (int i=1; i<position-1; i++) {

                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
            size++;

        } else {

            System.out.println("Insertion not possible at "+position+" position");
        }
    }

    public void deleteAtFirst() {

        if (isEmpty()) {

            System.out.println("List is empty");
        } else {

            head = head.getNext();
            size--;
        }
    }

    public void deleteAtLast() {

        if (isEmpty()) {

            System.out.println("List is empty");

        } else if (size == 1) {

            head = null;
            size--;
        } else {

            Node currentNode;
            currentNode = head;

            for (int i=1; i<size-1; i++) {

                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            size--;
        }
    }

    public void deleteAtPos(int position) {

        if (isEmpty()) {

            System.out.println("List is empty");

        } else if ((position>size) || (position<1)) {

            System.out.println("Invalid Position");

        } else if (position == 1) {

            deleteAtFirst();

        } else if (position == size) {

            deleteAtLast();

        } else {

            Node currentNode, currentPosNode;
            currentNode = head;

            for (int i=1; i<position-1; i++) {

                currentNode = currentNode.getNext();
            }
            currentPosNode = currentNode.getNext();
            currentNode.setNext(currentPosNode.getNext());
            size--;
        }
    }
}
