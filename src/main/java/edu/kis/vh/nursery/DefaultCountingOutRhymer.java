package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TAB_SIZE = 12;
	private static final int TOTAL = 11;
	private static final int RETURN = -1;
	private final int[] numbers = new int[TAB_SIZE];

	private int INITIAL = -1;
	
	public int getINITIAL() {
		return INITIAL;
	}


	protected void countIn(int in) {
		if (!isFull())
			numbers[++INITIAL] = in;
	}

	protected boolean callCheck() {
		return INITIAL == RETURN;
	}

	protected boolean isFull() {
		return INITIAL == TOTAL;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return RETURN;
		} else {
			return numbers[INITIAL];
		}
	}

	protected int countOut() {
		if (callCheck()) {
			return RETURN;
		} else {
			return numbers[INITIAL--];
		}
	}

}
