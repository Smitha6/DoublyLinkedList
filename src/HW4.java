public class HW4{

    public static void main(String args[]){
        //HW4 o = new HW4();
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();


        //---TESTING---
        //addToBack, removeFromBack, and removeFromFront
        System.out.println("");
        System.out.println("=== addToBack, removeFromBack, and removeFromFront ===");
        System.out.println("======================================================= \n");

        System.out.println("---Fill from back---");
        for (int i = 0; i < 15; i++){
            list.addToBack(i);
        }
        list.printContents();

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

        System.out.println("---Fill from position---");
        for (int i = 1; i <= 10; i++){  //insert at position cannot add to position 0.  index starts at 1
            list.insertAtPosition(i,i);
        }
        list.printContents();

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

        System.out.println("---Fill---");
        for (int i = 0; i < 15; i++){
            list.addToBack(i);
        }
        list.printContents();

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

        //removeFromPosition is next
    }


}
