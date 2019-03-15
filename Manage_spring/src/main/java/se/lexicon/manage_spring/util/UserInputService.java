package se.lexicon.manage_spring.util;

import java.time.LocalDate;

public interface UserInputService {

	String getString();

	/**
	 * Get String which is not just empty space
	 * 
	 * @return valid String
	 */
	String getNoEmptyString();

	/**
	 * Get a valid Date
	 * 
	 * @return LocalDate
	 */
	LocalDate getDate();

	/**
	 * Keep asking until get a valid answer *Do not Add "help" as answer
	 * 
	 * @param strings :valid answers
	 * @return valid answer
	 */
	String getVaildAnswer(String... strings);

	/**
	 * Keep asking for answer yes or no , doesn't accept anything else.
	 * 
	 * @param askS :Question to ask for yes or no
	 * @return boolean
	 */
	boolean yesOrNo(String question);

	/**
	 * Check the string is number with in range of Integer or not, until you get a
	 * valid number
	 * 
	 * @return valid number
	 */
	int getInt();

	/**
	 * keep asking for number until you put right number from limit
	 * 
	 * @param max
	 * @param min
	 * @return valid number
	 */
	int getIntFromLimit(int max, int min);

	/**
	 * keep asking for number until you put right number from limit
	 * 
	 * @param max
	 * @param min
	 * @param with decide max and min are Inclusive or not
	 * @return
	 */
	int getIntFromLimit(int max, int min, boolean with);

	int getIntFromLimit(int max, int min, boolean wmax, boolean wmin);

	/**
	 * Check the string is number with in range of Double or not, until you get a
	 * valid number
	 * 
	 * @return valid number
	 */
	double getDouble();

	/**
	 * keep asking for number until you put right number from limit
	 * 
	 * @param max
	 * @param min
	 * @return valid number
	 */
	double getDoubleFromLimit(double max, double min);

	/**
	 * keep asking for number until you put right number from limit
	 * 
	 * @param max
	 * @param min
	 * @param with decide max and min are Inclusive or not
	 * @return
	 */
	double getDoubleFromLimit(double max, double min, boolean with);

	double getDoubleFromLimit(double max, double min, boolean wmax, boolean wmin);

}