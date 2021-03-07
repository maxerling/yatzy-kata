package com.king.kata.yatzy;

public class YatzyScorer {
	public int calculateScore(Category category, YatzyRoll roll) {
		if (category.equals(Category.CHANCE)) {
			int sum = 0;
			/*for (int i = 0; i < roll.getDice().length; i++) {
				sum =+ roll.getDice();
			}*/

			for (int i: roll.getDice()) {
				sum += i;
			}

			return sum;

		} else if (category.equals(Category.YATZY)) {
			int[] tempArray = roll.getDice();
			int sameNumber = 0;
			int firstNumber = tempArray[0];
			for (int i: roll.getDice()) {
				if (firstNumber == i) {
					sameNumber++;
				}
			} else if (category.equals(Category.ONES || Category.TWOS || Category.THREES || Category.FOURS || Category.FIVES || Category.SIXES)) {
				
			}

			if (sameNumber == 5) {
				return 50;
			}
		}
		return 0;
	}


}
