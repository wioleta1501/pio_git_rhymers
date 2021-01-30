package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int FULL = 11;
	public static final int RETURN_MINUS_1 = -1;
	private int[] numbers = new int[12];

	public int total = RETURN_MINUS_1;
	@Override
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}
	@Override
	public boolean callCheck() {
			return total == RETURN_MINUS_1;
		}
	@Override
	public boolean isFull() {
				return total == FULL;
			}
	@Override
	protected int peekaboo() {
		if (callCheck()) {
			return RETURN_MINUS_1;
		} else {
			return numbers[total];
		}
	}
	@Override
	public int countOut() {
		if (callCheck()) {
			return RETURN_MINUS_1;
		} else {
			return numbers[total--];
		}
	}

}
