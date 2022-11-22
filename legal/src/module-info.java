module legal {

	/* la parte más importante que son los elementos para que cada una de las clases funcionen segun su distribucion - Juan Pablo Rojas Castro*/
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
}
