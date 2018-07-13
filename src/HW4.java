public class HW4{

    public static void main(String args[]){
        //HW4 o = new HW4();
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        //---Testing---
        list.insertAtFront(1);
        list.insertAtFront(2);
        list.insertAtFront(3);
        list.addToBack(4);


        list.printContents();

        System.out.println("PEEK FRONT: " + list.peekFront());
        System.out.println("PEEK BACK: " + list.peekBack());

        list.removeFromFront();
        list.printContents();
        list.removeFromBack();
        list.printContents();

        list.removeFromFront();
        list.printContents();
        list.removeFromBack();
        list.printContents();

        //remove from empty
        list.removeFromBack();
        list.removeFromFront();
        list.printContents();

        list.removeFromPosition(134);
        list.removeFromPosition(-1);
        list.removeFromPosition(0);




        //fill again
        System.out.println("Fill Again");
        list.insertAtFront(0);
        list.insertAtFront(1);
        list.insertAtFront(2);
        list.insertAtFront(3);
        list.insertAtFront(4);
        list.insertAtFront(5);
        list.insertAtFront(6);

        list.removeFromPosition(4);
        list.printContents();

        list.removeFromPosition(10);




    }


}
