package edu.csumb.cst438fa16.eliasargandara;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuestionsAnswersTest {
	
	QuestionsAnswers questionsAnswers;
	
	@Before
	public void initialization() {
		questionsAnswers = new QuestionsAnswers();
	}

	@Test
	public void put_whenEmpty() {
		assertEquals(questionsAnswers.getRandomQuestion(), null);
	}
	
	@Test
	public void put_whenInserting() {
		
	}

}
