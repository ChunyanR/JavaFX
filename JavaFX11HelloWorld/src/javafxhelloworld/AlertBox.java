package javafxhelloworld;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlertBox {
	
	public static void displayWindow(String title, String message) {
		
		Stage window = new Stage();
		window.setTitle(title);
		window.setMinHeight(200);
		window.setMinWidth(200);
		
		
		Label label =new Label(message);
		Button btn1 = new Button("Exit");
		Button btn2 = new Button("No");
		
		btn1.setOnMouseClicked(e->window.close());
		btn2.setOnMouseClicked(e->window.close());

		VBox layoutBox = new VBox(15);
		layoutBox.getChildren().addAll(label,btn1,btn2);
		layoutBox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layoutBox,200,200);
		window.setScene(scene);
		window.showAndWait();
		


		
		
	}

}
