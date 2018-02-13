/*
Implement this class to be a fully functioning generic Stack
*/
public class Stack<T>
{
    class Node<T>{
        T data;
        Node<T> next;
    }

    Node<T> head = null;
    Node<T> tail = null;

	/*
	The method should return true if the stack 
	is empty and false if it it is not empty.
	*/
	public boolean isEmpty()
	{
		if (head==null) {
            return true;
        }else{
            return false;
        }
	}
	
	
	/*
	This method should push the element passed as
	a parameter on top of the stack.
	*/
	public void push(T el)
	{
	    Node<T> nd = new Node<>();
	    nd.data = el;
	    if (isEmpty()){
	    	head = nd;
		}else{
			nd.next = head;
			head = nd;
		}

	}
	
	/*
	This method should remove and return the element at
	the top of the stack.  If the stack is empty, it should
	return null.
	*/
	public T pop()
	{
	    T el;
	    el = head.data;
	    head = head.next;
	    return el;

	}
			
	/*
	This method should return the method at the top of the stack
	but not remove it.  If the stack is empty, simply return null.
	*/
	public T peek()
	{
	    return head.data;
	}
	
	/*
	This method should return a string representation of the stack.
	The elements should appear between square brackets and be comma-
	separated.  If the elements 7, 6, 5 and 3 were pushed onto the stack
	in that order, then the string representation of the stack would be.
	 
	"[3,5,6,7]", where 3 is at the top of the stack.
	
	Your string should not contain any additional characters or white space.
	The string for an empty stack is simply "[]"
	*/
	public String toString()
	{
        if (isEmpty()){
            return "[]";
        }else{
            String output;
            output = "[";
            Node<T> node = new Node<>();
            node = head;
            while(node.next != null){
                output += node.data + ",";
                node = node.next;
            }
            output += node.data + "]";

            return output;
        }
	}
	
}
