/**
 * Homework 4, Summer 2018
 *
 * Testing a doubly linked list
 * @author A. Smith
 *
 */
public class HW4{

    //Tests a doubly linked list
    public static void main(String args[]){
        //HW4 o = new HW4();
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();


        //---TESTING---
        //addToBack, removeFromBack, and removeFromFront
        System.out.println("");
        System.out.println("=== addToBack, removeFromBack, and removeFromFront ===");
        System.out.println("======================================================= \n");


        //addToBack
        System.out.println("---Fill from back---");
        for (int i = 0; i < 15; i++){
            list.addToBack(i);
        }
        list.printContents();

        //removeFromBack
        System.out.println("---Remove from back---");
        list.removeFromBack();
        list.printContents();


        System.out.println("---Remove all from back---");
        for (int i = list.length(); i > 0 ; i--){
            list.removeFromBack();
        }
        list.printContents();

        System.out.println("---Remove from back with empty list---");
        list.removeFromBack();
        list.printContents();

        System.out.println("---Add from back, and remove from back with one node---");
        list.addToBack(12);
        System.out.println("-Added node-");
        list.removeFromBack();
        System.out.println("-Removed node-");
        list.printContents();

        System.out.println("---Reset list with data as position (not index)---");
        for (int i = 1; i <= 10; i++){  //insert at position cannot add to position 0.  index starts at 1
            list.insertAtPosition(i,i);
        }
        list.printContents();

        //removeFromFront
        System.out.println("---Remove all from front---");
        for (int i = list.length(); i > 0 ; i--){
            list.removeFromFront();
        }
        list.printContents();

        System.out.println("---Remove from front on empty list---");
        list.removeFromFront();
        list.printContents();

        System.out.println("---Remove from front with one node---");
        list.insertAtPosition(10,1);
        System.out.println("-Added to pos 1-");
        list.printContents();
        list.removeFromFront();
        System.out.println("-Removed-");
        list.printContents();


        //peekFront, peekBack, removeFromPosition
        System.out.println("");
        System.out.println("=== peekFront, peekBack, and removeFromPosition ===");
        System.out.println("=================================================== \n");

        System.out.println("---Fill---");
        for (int i = 0; i < 15; i++){
            list.addToBack(i);
        }
        list.printContents();


        //peekFront
        System.out.println("---Peek front---");
        System.out.println("Front is -> " + list.peekFront());
        System.out.println("");

        System.out.println("---Peek front on empty---");
        for (int i = list.length(); i > 0 ; i--){
            list.removeFromFront();
        }
        list.printContents();
        System.out.println("Front is -> " + list.peekFront());
        System.out.println("");

        System.out.println("---Peek front with one node---");
        list.addToBack(23);
        list.printContents();
        System.out.println("Front is -> " + list.peekFront());
        System.out.println("");
        list.removeFromFront();

        System.out.println("---Fill---");
        for (int i = 0; i < 15; i++){
            list.addToBack(i);
        }
        list.printContents();

        //peekBack
        System.out.println("---Peek back---");
        System.out.println("back is -> " + list.peekBack());
        System.out.println("");

        System.out.println("---Peek back on empty---");
        for (int i = list.length(); i > 0 ; i--){
            list.removeFromFront();
        }
        list.printContents();
        System.out.println("Back is -> " + list.peekBack());
        System.out.println("");

        System.out.println("---Peek back with one node---");
        list.addToBack(32);
        list.printContents();
        System.out.println("Back is -> " + list.peekBack());
        System.out.println("");


        //removeFromPosition
        System.out.println("---Reset list with data as position (not index)---");
        list.removeFromFront();
        for (int i = 1; i <= 15; i++){
            list.addToBack(i);
        }
        list.printContents();

        System.out.println("---Remove from position 5---");
        list.removeFromPosition(5);
        list.printContents();

        System.out.println("---Remove from position 1---");
        list.removeFromPosition(1);
        list.printContents();

        System.out.println("---Remove last position---");
        list.removeFromPosition(list.length());
        list.printContents();

        System.out.println("---Remove from outside of range---");
        list.removeFromPosition(list.length() + 5);
        list.printContents();

        System.out.println("---Remove from under range---");
        list.removeFromPosition(0);
        list.printContents();

        System.out.println("---Remove all but 2 nodes---");
        for (int i = list.length(); i > 2 ; i--){
            list.removeFromFront();
        }
        list.printContents();

        System.out.println("---Remove second node---");
        list.removeFromPosition(2);
        list.printContents();

        System.out.println("---Remove last node---");
        list.removeFromPosition(1);
        list.printContents();

        System.out.println("---Remove from empty---");
        list.removeFromPosition(1);
        list.printContents();


        //Testing other data types
        //---String---
        DoublyLinkedList<String> stringList = new DoublyLinkedList<>();
        System.out.println("---String list---");
        stringList.addToBack("nodeA");
        stringList.insertAtPosition("nodeB",2);
        stringList.printContents();
        System.out.println("Front -> " + stringList.peekFront());
        stringList.removeFromFront();
        stringList.removeFromBack();
        stringList.removeFromBack();
        stringList.printContents();

        //---Float---
        DoublyLinkedList<Double> doubleList = new DoublyLinkedList<>();
        System.out.println("---Double list---");
        doubleList.addToBack(2.45);
        doubleList.insertAtPosition(6.3,2);
        doubleList.printContents();
        System.out.println("Back -> " + doubleList.peekBack());
        doubleList.removeFromFront();
        doubleList.removeFromBack();
        doubleList.removeFromBack();
        doubleList.printContents();

        System.out.println("---End of testing---");
        //---END TESTING---


    }//---End Main---


}//---End HW4---
