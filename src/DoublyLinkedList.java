import org.omg.CORBA.Any;

/**
 * DoublyLinkedList can contain any type of data, but all data must be of the same type.
 * Based on the model provided by Weiss (see pictures, page 76) "dummy" nodes are included.
 * 
 * Data is stored in a doubly-linked list with both head and tail pointers.
 * 
 * @ R McCauley built shell
 */
public class DoublyLinkedList<AnyType> extends HW4_AbstractClass<AnyType>{
    
    /******** an inner class  **********************
     * The node type for a doubly linked list 
     */
    private static class Node<AnyType> {
        
        public Node(AnyType x, Node p, Node n) {
            data = x; prev = p; next = n;           
        }
        
        public AnyType data;
        public Node<AnyType> next;
        public Node<AnyType> prev;
    }
    /**********************************************************/
    
    // The DoublyLinkedList contains a reference to the both the front and back nodes in the list.
    
    private Node<AnyType> head; // front marker
    private Node<AnyType> tail; // back marker
    private int length; // how many nodes in the list
    
    /**
     * Constructor allocates initializes front reference
     */
    public DoublyLinkedList () {
         
        head = new Node<AnyType>(null, null, null);
        tail = new Node<AnyType>(null, head, null);
        head.next = tail;
        length = 0;    // no nodes in list
	}
    
    /**
     * Reports number of nodes in the list
     * @return
     */
    public int length(){
    	  return length;
    }
    
    /**
     *  The following routine is used to mock-up a 
     *  doubly linked list that can be used to test your remove algorithm
     */
    
    public void insertAtFront(AnyType value){ 
    	// Each node stores a null reference, since AnyType could be any type
        Node<AnyType> temp = new Node<>(value, head, head.next); // will be the first node

        head.next = temp;
	    temp.next.prev = temp;
    	length++;
    } 
    	    
    // Verify contents of list
    public void printContents (){
    	
    	   System.out.println("Printing front to back, start of list:");
    	   Node<AnyType> walker = head.next; // don't print dummy
    	   while (walker != tail){
           // assumes AnyType is printable - has a toString
    		   System.out.println(walker.data);
    		   walker = walker.next;
    	   }
    	   
 /*   	   System.out.println("Printing back to front, start of list:");
    	   walker = tail.prev; // don't print dummy
    	   while (walker != head){
    		   System.out.println(walker.data);
    		   walker = walker.prev;
    	   }
    	   */
    	   System.out.println("List has "+ length +" nodes.\n===="); 
    } // end howLong
    
    public void insertAtPosition(AnyType x, int pos) {
    	
    	if (pos < 1 || pos > length + 1)
    		return;
    	// Find position - point to node before where this node
    	// goes
    	int count = 1;
    	Node<AnyType> walker = head;
    	while (count < pos) {
    		walker = walker.next;
    		count++;
    	}
    	// Create new node
    	Node<AnyType> temp = new Node<>(x,walker, walker.next);
    	temp.next.prev = temp;
    	temp.prev.next = temp;
    	length++;
    	
    }


    //---To Do---
	public void addToBack(AnyType x){
		Node<AnyType> walker = head;
		Node<AnyType> n = new Node<>(x,null,null);

		for(int i = 0; i < length; i++){
			walker = walker.next;
		}

		n.next = walker.next;
		walker.next = n;

		n.prev = walker;
		tail.prev = n;

		length++;


	}

	public void removeFromFront(){
    	if(length <= 0)
    		return;

    	Node<AnyType> n = head.next.next;
    	head.next = n;
    	n.prev = head;
    	length--;

	}

	public void removeFromBack(){
		if(length <= 0)
			return;

		Node<AnyType> n = tail.prev.prev;
		tail.prev = n;
		n.next = tail;
		length--;

	}

	public AnyType peekFront(){
		Node<AnyType> n = head.next;
		return n.data;
	}

	public AnyType peekBack(){
		Node<AnyType> n = tail.prev;
		return n.data;
	}

	public void removeFromPosition(int pos){
		Node<AnyType> walker = head;

		if(length == 0)
			return;

		//if pos is in range
		if (pos < 1 || pos > length + 1)
			return;

		//get to pos
		for(int i = 0; i < pos; i++){
			walker = walker.next;
		}

		walker.next.prev = walker.prev;
		walker.prev.next = walker.next;
		length--;

	}

	//---End To Do---



    // This is the main method used to test in class.
    // For HW4, you must create a main in a new HW4 class
    public static void main(String[] args){
    	   final int HOWMANY = 4;

    	   DoublyLinkedList<String> d = new DoublyLinkedList<>();
    	   String nodeLabel = "node";
    	   for (int i = 1; i <= HOWMANY; i++){
    	      d.insertAtFront(nodeLabel + (HOWMANY-i));
    	   }
    	   d.printContents();
    	   d.insertAtPosition("at pos 1", 1);
    	   d.printContents();
      	   d.insertAtPosition("at pos 3", 3);
    	   d.printContents();
    	   d.insertAtPosition("at last pos ", d.length+1);
    	   d.printContents();
    	   d.insertAtPosition("nowhere", 25);
    	   d.printContents();
    	   d.insertAtPosition("nowhere", -4);
    	   d.printContents(); 	   
    }
}
