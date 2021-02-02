package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;

	public Node getLast() {
		return last;
	}
	
	private static final int RETURN = -1;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty()) {
			return RETURN;
		} else {
			return last.getValue();
		}
	}

	public int pop() {
		if (isEmpty()) {
			return RETURN;
		} else {
			int ret = last.getValue();
			last = last.getPrev();
			return ret;
		}
	}

}
