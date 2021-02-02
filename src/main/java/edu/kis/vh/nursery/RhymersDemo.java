package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

import java.util.Random;

class RhymersDemo {

	public static final java.lang.String TEXT_DESCRIPTION = "total rejected is ";
	public static final int RAND_INT_20 = 20;
	public static final int MAX_RHYMES = 15;

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};
		Random random = new Random();

		for (int i = 1; i < MAX_RHYMES; i++) {
			for (int j = 0; j < 3; j++) {
				rhymers[j].countIn(i);
			}
		}

		for (int i = 1; i < MAX_RHYMES; i++) {
			rhymers[3].countIn(random.nextInt(RAND_INT_20));
		}
		
		for (DefaultCountingOutRhymer rhymer : rhymers) {
			while (!rhymer.callCheck()) {
				System.out.print(rhymer.countOut() + "  ");
			}
			System.out.println();
		}
		
		System.out.println(TEXT_TOTAL_REJECTED_IS
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
		
	}
	
}