import java.util.Iterator;

public class MyLinkedListIterator<T extends Comparable<T>> implements Iterator<T> {
	// FIXME implement this
	// Implement the iterator for MyLinkedList.
	// You have to maintain the current position of the iterator.
	private int cursor;

	private final MyLinkedList<T> l;

	public MyLinkedListIterator(MyLinkedList<T> myLinkedList) {
		this.l = myLinkedList;
		this.cursor = 0;
	}

	@Override
	public boolean hasNext() {
		return cursor != l.size();
	}

	@Override
	public T next() {
		return null;
	}

	@Override
	public void remove() {
		// This code does not have to be modified.
		throw new UnsupportedOperationException();
	}
}
