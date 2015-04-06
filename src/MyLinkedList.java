import java.util.Iterator;
import java.util.NoSuchElementException;

class Node<T> {
	// FIXME implement this
	final T item;
	public Node<T> prev;
	public Node<T> next;

	public Node(T obj) {
		this.item = obj;
		this.prev = null;
		this.next = null;
	}
}

public class MyLinkedList<T extends Comparable<T>> implements Iterable<T> {
	// FIXME implement this
	// Implement a linked list.
	// This linked list should maintain the items in a sorted order.
	// This linked list should discard a duplicate.

	Node<T> head = null;
	private int size;

	public MyLinkedList() {
		size = 0;
	}

	@Override
	public Iterator<T> iterator() {
		// This code does not have to be modified.
		// Implement MyLinkedListIterator instead.
		return new MyLinkedListIterator<T>(this);
	}

	public boolean add(T obj) {
		
		// if there isn't any objects in list
		// same as if ( size == 0 ) {}
		if ( head == null ) {
			head = new Node<T>(obj);
			return true;
		}
		
		// FIXME implement this
		Node<T> indexToInsert = head;
		Node<T> tmp = new Node<T>(obj);
		
		// Search where to insert
		while( null != indexToInsert.next ) {
			if ( obj.compareTo(indexToInsert.next.item) < 0 ) {
				
				tmp.prev = indexToInsert;
				indexToInsert.next = tmp;
				tmp.next = indexToInsert.next;
				indexToInsert.next.prev = tmp; 

				return true;
			}
			// do not add when same thing exists
			else if ( obj.compareTo(indexToInsert.next.item) == 0 ) return false;
			indexToInsert = indexToInsert.next;
		}
		// reached the END
		tmp.prev = indexToInsert;
		indexToInsert.next = tmp;

		return true;
	}

	public boolean remove(T obj) {
		// if there isn't any objects in list
		if ( head == null ) return false;

		Node<T> indexToRemove = head;

		// Search where to Remove
		while( null != indexToRemove.next ) {
			if ( obj.compareTo(indexToRemove.next.item) == 0 ) {

				if ( indexToRemove.next.next != null ) {
					indexToRemove = indexToRemove.next.next;
					indexToRemove.next.next.prev = indexToRemove;
				}
				else indexToRemove.next = null;

				return true;
			}
			indexToRemove = indexToRemove.next;
		}
		// reached the END. nothing in match
		return false;
	}

	public int size() {
		return head != null ? size : 0;
	}

	public T first() {
		// FIXME implement this
		// This is a helper method.
		// You do not necessarily have to implement this but still might be useful to do so.
		if (head != null)
			return head.item;
		else
			throw new NoSuchElementException();
	}

	public T last() {
		// FIXME implement this
		// This is a helper method.
		// You do not necessarily have to implement this but still might be useful to do so.
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String toString() {
		Node<T> node = head;
		String str = "";
		while( null != node ) {
			str += node.item.toString() + "\n";
			node = node.next;
		}
		return str;
	}
}
