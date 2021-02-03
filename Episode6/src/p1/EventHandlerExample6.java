package p1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlerExample6 extends Application
{

	public static void main(String[] args)
	{
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Button button = new Button("Press to continue");
		Label label = new Label("INITIALIZING...");
		
		EventHandler myHandler = new SimpleEventHandler(label);
		button.setOnAction(myHandler);
		
//		Pane pane2 = new HBox(15);
//		
//		Image img = new Image("93978.jpg");
//		
//		ImageView img2 = new ImageView(img);
//		img2.setFitHeight(700);
//		img2.setFitWidth(500);
//		pane2.getChildren().add(img2);
//		
//		Scene scene2 = new Scene(pane2, 500, 700);
		
		primaryStage.setTitle("An Image View Pane App");
		
		VBox pane = new VBox(20);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(label, button);
		
		primaryStage.setScene(new Scene(pane, 500, 150));
		primaryStage.show();
		
		
//		Stage secondStage = new Stage();
//		secondStage.setScene(scene2);
//		secondStage.show();
		
//		primaryStage.setScene(scene2);
		
	}

}
