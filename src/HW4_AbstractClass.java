
public abstract class HW4_AbstractClass<AnyType>{
	/*****************************************************************/

	//Extend this class and implement the following method:
	abstract public void insertAtPosition(AnyType x, int pos); // done in class
	abstract public void insertAtFront(AnyType x); // done in class
	abstract public int length(); // provided
	abstract public void addToBack(AnyType x);
	abstract public void removeFromFront();
	abstract public void removeFromBack();
	abstract public AnyType peekFront(); 
	abstract public AnyType peekBack(); 
        abstract public void removeFromPosition(int pos);	
	/*****************************************************************/
}
