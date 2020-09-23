package javafxhelloworld;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;

public class JavaFXHelloWorld extends Application {







	@Override
	public void start( Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("JavaFX practice");
		
		Label label = new Label("Open a new window");
		Button btn = new Button("Click me");
		btn.setOnMouseClicked(e -> AlertBox.displayWindow("Alterbox", "Make a choice"));
	
		VBox layout = new VBox();
		layout.getChildren().addAll(label,btn);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout,200,200);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	
	}



	public static void main( String[] args) {
		System.out.println( "main method");
		launch( args);
	}
}
