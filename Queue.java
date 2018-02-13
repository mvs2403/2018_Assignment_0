/*
A generic Queue class.  Type T must be an object
*/
public class Queue<T>
{
	class Node<T>{
	        T data;
	        Node<T> next;

	   /* Node<T>(){
	        data = null;
	        next = null;
        }*/
    }

    Node<T> head = null;
	Node<T> tail = null;

	/*
	The method should return true if the queue
	is empty and false if it it is not empty.
	*/
	public boolean isEmpty()
	{
	    if (head == null){
		    return true;
	    }else{
	        return false;
        }
	}

	/*
	The element passed in as a parameter should
	be added to the back of the queue.
	*/
	public void enqueue(T el)
	{
		Node<T> n = new Node<T>();
		n.data = el;
		if (isEmpty()){
			head = n;
			tail = n;
		}else{
			tail.next = n;
			tail = tail.next;
		}

	}

	/*
	This method should remove the first element in the queue.
	If the queue is empty, then simply return null.
	*/
	public T dequeue()//dequeue
	{
		if (isEmpty()){// to make sure that it is not empty
            return null;
        }else{
		    T el = head.data;
		    if (tail == head){
		        tail = null;
		        head = null;
            }else{
		        head = head.next;
            }
            return el;
        }
	}

	/*
	This method should return the element at the front of the
	queue without removing it from the queue.
	*/
	public T front()
	{
	    if (isEmpty()) {
            return null;
        }else {
            return head.data;
        }
	}


	/*
	This method should return a string representation of the queue.
	The elements should appear between square brackets and be comma-
	separated.  If the queue contains the elements 5,4,6,7,10 with 5
	being the front of the queue and 10 at the back, the string for
	the queue is:

	"[5,4,6,7,10]"

	Your string should not contain any additional characters or white space.
	The string for an empty queue is simply "[]"
	*/
	public String toString()
	{
        if (isEmpty()){
            return "[]";
        }else{
            String output;
            output = "[";
            Node<T> n = new Node<T>();
            n = head;
            while(n.next != null){
                output += n.data + ",";
                n = n.next;
            }
            output += tail.data + "]";

            return output;
        }

	}
}
