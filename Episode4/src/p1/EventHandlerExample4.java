package p1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlerExample4 extends Application
{

	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Button button = new Button("Option 1");
		Button button2 = new Button("Option 2");
		Label label = new Label("HOLY FUCK! I HAVE ANOTHER BUTTON.");
		
		EventHandler myHandler = new SimpleEventHandler(label);
		button.setOnAction(myHandler);
		
		EventHandler myHandler2 = new SimpleEventHandler2(label);
		button2.setOnAction(myHandler2);
		
		VBox pane = new VBox(20);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(label, button, button2);
		
		primaryStage.setScene(new Scene(pane, 425, 150));
		primaryStage.show();
		
	}

}
