package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CellTest {

	@Test
	void testCell() {
		Cell cell = new Cell("apple", "apple.png", 0, 0);
		assertEquals(cell.value, "apple");
		assertEquals(cell.filename, "apple.png");
		assertEquals(cell.row, 0);
		assertEquals(cell.col, 0);
	}

}
