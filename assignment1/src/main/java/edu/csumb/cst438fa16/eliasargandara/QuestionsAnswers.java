package edu.csumb.cst438fa16.eliasargandara;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * @author eliasargandara
 *
 * A half-secretive map of questions to answers (at most one answer per question).
 * Gives out random questions (keys) from the map, and
 * can be queried to test if a given question maps to a given answer.
 */

public class QuestionsAnswers {
	static private Random numberGenerator = new Random();
	private HashMap<String, String> questionsAnswersMap = new HashMap<String, String>();
	
	/**
	 * Maps questions to answers.
	 */
	void put(String question, String answer) {
		this.questionsAnswersMap.put(question, answer);
	}
	
	/**
	 * Queries if question maps to answer
	 */
	boolean testAnswer(String question, String answer) {
		String queriedAnswer = this.questionsAnswersMap.get(question);
		return queriedAnswer.equals(answer);
	}
	
	/** 
	 * Gives out a random question from the key set.
	 */
	String getRandomQuestion() {
		Set<String> questionsSet = questionsAnswersMap.keySet();
		String[] questionsArray = (String[]) questionsSet.toArray();
		int numberOfQuestions = questionsArray.length;
		int randomQuestionIndex = numberGenerator.nextInt(numberOfQuestions);
		
		if (questionsArray.length > 0) {
			return questionsArray[randomQuestionIndex];
		}
		else {
			return null;
		}
	}
}
