package core;

import gui.TyperGUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaTyping extends Application{
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		TyperGUI type = new TyperGUI();
		Scene scene = new Scene(type.getRoot());
		primaryStage.setTitle("JavaTyping");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
