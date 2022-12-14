package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
    public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
			Image icon = new Image("icon.png");
			stage.getIcons().add(icon);
	        stage.setTitle("L'egal");
	        stage.setScene(new Scene(root));

	        stage.show();
		} catch (Exception e){
			e.printStackTrace();
		}
        
    }

    public static void main(String[] args) {
        launch();
    }
}
