package se.lexicon.manage_spring.util;

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
}