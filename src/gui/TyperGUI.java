package gui;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class TyperGUI {
	private TextField inputField;
	//private TextField currentLine;
	private TextArea currentCodeField;
	private Label currentLine;
	private BorderPane root;
	
	public TyperGUI(){
		inputField = new TextField("Gnarly");
		currentLine = new Label("Squirm");
		currentCodeField = new TextArea();
		root = new BorderPane();
		buildGUI();
	}
	
	public Parent getRoot(){
		return root;
	}
	
	private void buildGUI(){
		VBox vert = new VBox(currentLine,inputField);
		root.setTop(vert);
		root.setCenter(currentCodeField);
		//currentLine.setEditable(false);
		//root.setTop();
	}
	
	public void nextLine(String line){
		currentLine.setText(line);
		currentLine.setTextFill(Color.web("0xF280A1"));
	}
}
