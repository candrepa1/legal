package application;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class BoardTest {

	@Test
	void testPopulateMatrix() {
		Board board = new Board();
		board.populateMatrix();
		String[] images = {"apple-1", "car-1", "umbrella-1", "apple-2", "car-2", "umbrella-2"};
		assertTrue(isElementInArray(images, "apple"));
	}
	
	public boolean isElementInArray(String[] arr, String element) {
		boolean isInArray = false;
		for (int i = 0; i < arr.length; i++) {
			String name = arr[i].split(Pattern.quote("-"))[0];
			if(name.equals(element)) {
				isInArray = true;
			}
		}
		return isInArray;
	}

}
