module legal {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires org.junit.jupiter.api;
	requires org.hamcrest.core;
	
	opens application to javafx.graphics, javafx.fxml;
}
