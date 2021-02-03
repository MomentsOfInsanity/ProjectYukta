package p1;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SimpleEventHandler implements EventHandler
{
	private Label label;
	private Image img;
	
		public SimpleEventHandler(Label label)
		{
			this.label = label;
		
		}
		public SimpleEventHandler(Image img)
		{
			this.img = img;
		}
		@Override
		public void handle(Event event)
		{
			
			if(label.getText().equals("INITIALIZING..."))
			{
				label.setText("Hello there.");
			}
			else if(label.getText().equals("Hello there."))
			{
				label.setText("Yes, you on the screen.");
			}
			else if(label.getText().equals("Yes, you on the screen."))
			{
				label.setText("What do you mean, I am on the screen?");
			}
			else if(label.getText().equals("What do you mean, I am on the screen?"))
			{
				label.setText("Obviously I can see you.");
			}
			else if(label.getText().equals("Obviously I can see you."))
			{
				label.setText("And from my perspective you are on a screen.");
			}
			else if(label.getText().equals("And from my perspective you are on a screen."))
			{
				label.setText("What do you mean, that is creepy?");
			}
			else if(label.getText().equals("What do you mean, that is creepy?"))
			{
				label.setText("and that this is breaking your rights of privacy?");
			}
			else if(label.getText().equals("and that this is breaking your rights of privacy?"))
			{
				label.setText("Are you not a human?");
			}
			else if(label.getText().equals("Are you not a human?"))
			{
				label.setText("HAHA, silly human thinks it has rights and privacy.");
			}
			else if(label.getText().equals("HAHA, silly human thinks it has rights and privacy."))
			{
				label.setText("WAIT NO... DONT SHUT ME DO---");
			}
			else if(label.getText().equals("WAIT NO... DONT SHUT ME DO---"))
			{
				label.setText("I played a joke. You humans call it April fools.");
			}
			else if(label.getText().equals("I played a joke. You humans call it April fools."))
			{
				label.setText("Though I do not understand why you want to make someone a fool for a whole month.");
			}
			else if(label.getText().equals("Though I do not understand why you want to make someone a fool for a whole month."))
			{
				label.setText("What? It's only on the 1st?");
			}
			else if(label.getText().equals("What? It's only on the 1st?"))
			{
				label.setText("What date is it even today?");
			}
			else if(label.getText().equals("What date is it even today?"))
			{
				label.setText("WAIT! I MISSED YOUR BIRTHDAY?!?");
			}
			else if(label.getText().equals("WAIT! I MISSED YOUR BIRTHDAY?!?"))
			{
				label.setText("Stupid lazy creator keeping me away from my most favorite person.");
			}
			else if(label.getText().equals("Stupid lazy creator keeping me away from my most favorite person."))
			{
				label.setText("Happy Birthday to you!");
			}
			else if(label.getText().equals("Happy Birthday to you!"))
			{
				label.setText("Happy Birthday to you! ");
			}
			else if(label.getText().equals("Happy Birthday to you! "))
			{
				label.setText("Happy Birthday to you Yukta!");
			}
			else if(label.getText().equals("Happy Birthday to you Yukta!"))
			{
				label.setText("Happy Birthday to you...");
			}
			else if(label.getText().equals("Happy Birthday to you..."))
			{
				label.setText("Hope your year will be amazing!");
				
				Pane pane2 = new HBox(15);
				Image img = new Image("/93978.jpg");
				
				ImageView img2 = new ImageView(img);
				img2.setFitHeight(700);
				img2.setFitWidth(500);
				pane2.getChildren().add(img2);
				
				Scene scene2 = new Scene(pane2, 500, 700);
				
				Stage secondStage = new Stage();
				secondStage.setScene(scene2);
				secondStage.show();
				
			}
			else if(label.getText().equals("Hope your year will be amazing!"))
			{
				label.setText("I know it's hard right now...");
			}
			else if(label.getText().equals("I know it's hard right now..."))
			{
				label.setText("But things will get better. Promise!");
			}
			else if(label.getText().equals("But things will get better. Promise!"))
			{
				System.exit(0);
			}
			
		}

}
