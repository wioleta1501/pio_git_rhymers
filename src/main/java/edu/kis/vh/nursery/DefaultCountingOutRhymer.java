package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int FULL = 11;
	public static final int EMPTY = -1;
	private int[] numbers = new int[12];

	public int total = EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == EMPTY;
		}

	public boolean isFull() {
				return total == FULL;
			}

	protected int peekaboo() {
		if (callCheck()) {
			return EMPTY;
		} else {
			return numbers[total];
		}
	}

	public int countOut() {
		if (callCheck()) {
			return EMPTY;
		} else {
			return numbers[total--];
		}
	}

}
