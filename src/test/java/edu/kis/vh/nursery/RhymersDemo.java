package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

import java.util.Random;

class RhymersDemo {

	private static final int MAX_I = 15;
	private static final int MAX_J = 3;
	private  static final int RAND_BOUND = 20;
	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();

		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		Random random = new Random();
		for (int i = 1; i < MAX_I; i++)
			for (int j = 0; j < MAX_J; j++)
				rhymers[j].countIn(i);

		for (int i = 1; i < MAX_I; i++)
			rhymers[3].countIn(random.nextInt(RAND_BOUND));

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			while (!rhymer.callCheck())
				System.out.print(rhymer.countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());

	}

}