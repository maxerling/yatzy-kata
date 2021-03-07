package com.king.kata.yatzy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	public class  YatzyTest {

	private YatzyScorer yatzyScorer;

	@BeforeEach
	public void setUp() {
		yatzyScorer = new YatzyScorer();
	}

	@Test
	public void chanceScoresCorrectly() {
		assertEquals(18,yatzyScorer.calculateScore(Category.CHANCE, new YatzyRoll(5, 2, 1, 4, 6)));
		assertEquals(14, yatzyScorer.calculateScore(Category.CHANCE, new YatzyRoll(1, 1, 3, 3, 6)));
		assertEquals(21, yatzyScorer.calculateScore(Category.CHANCE, new YatzyRoll(4, 5, 5, 6, 1)));
		assertNotEquals(1,yatzyScorer.calculateScore(Category.CHANCE, new YatzyRoll(5, 2, 1, 4, 6)));
	}

	@Test
	public void yatzyScoresCorrectly() {
		assertEquals(50,yatzyScorer.calculateScore(Category.YATZY,new YatzyRoll(1,1,1,1,1)));
		assertEquals(50,yatzyScorer.calculateScore(Category.YATZY,new YatzyRoll(2,2,2,2,2)));
		assertNotEquals(5,yatzyScorer.calculateScore(Category.YATZY,new YatzyRoll(1,1,1,1,1)));

	}

	@Test
	public void onesToSixesScoreCorrectly() {
		assertEquals(2,yatzyScorer.calculateScore(Category.ONES,new YatzyRoll(1,1,2,3,4)));
		assertEquals(0,yatzyScorer.calculateScore(Category.ONES,new YatzyRoll(3,3,3,4,5)));
		assertNotEquals(2,yatzyScorer.calculateScore(Category.ONES,new YatzyRoll(3,3,3,4,5)));

		assertEquals(4,yatzyScorer.calculateScore(Category.TWOS,new YatzyRoll(2,2,1,3,4)));
		assertEquals(0,yatzyScorer.calculateScore(Category.TWOS,new YatzyRoll(3,3,3,4,5)));
		assertNotEquals(4,yatzyScorer.calculateScore(Category.TWOS,new YatzyRoll(3,3,3,4,5)));

		assertEquals(6,yatzyScorer.calculateScore(Category.THREES,new YatzyRoll(3,1,2,3,4)));
		assertEquals(0,yatzyScorer.calculateScore(Category.THREES,new YatzyRoll(6,6,6,4,5)));
		assertNotEquals(6,yatzyScorer.calculateScore(Category.THREES,new YatzyRoll(2,2,2,4,5)));

		assertEquals(8,yatzyScorer.calculateScore(Category.FOURS,new YatzyRoll(4,2,1,3,4)));
		assertEquals(0,yatzyScorer.calculateScore(Category.FOURS,new YatzyRoll(3,3,3,4,5)));
		assertNotEquals(8,yatzyScorer.calculateScore(Category.FOURS,new YatzyRoll(3,3,3,4,5)));

		assertEquals(10,yatzyScorer.calculateScore(Category.FIVES,new YatzyRoll(5,5,1,3,4)));
		assertEquals(0,yatzyScorer.calculateScore(Category.FIVES,new YatzyRoll(3,3,3,4,5)));
		assertNotEquals(10,yatzyScorer.calculateScore(Category.FIVES,new YatzyRoll(3,3,3,4,5)));

		assertEquals(12,yatzyScorer.calculateScore(Category.SIXES,new YatzyRoll(6,6,1,3,4)));
		assertEquals(0,yatzyScorer.calculateScore(Category.SIXES,new YatzyRoll(3,3,3,4,5)));
		assertNotEquals(12,yatzyScorer.calculateScore(Category.SIXES,new YatzyRoll(3,3,3,4,5)));
	}

	}