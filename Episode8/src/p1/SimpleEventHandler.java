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
			
			if(label.getText().equals("He was her pen."))
			{
				label.setText("She was his highlighter.");
			}
			else if(label.getText().equals("She was his highlighter."))
			{
				label.setText("He drew the world.");
			}
			else if(label.getText().equals("He drew the world."))
			{
				label.setText("She made it brighter.");
			}
			else if(label.getText().equals("She made it brighter."))
			{
				label.setText("Miles and miles between them.");
			}
			else if(label.getText().equals("Miles and miles between them."))
			{
				label.setText("But he's worth it.");
			}
			else if(label.getText().equals("But he's worth it."))
			{
				label.setText("But she's worth it.");
			}
			else if(label.getText().equals("But she's worth it."))
			{
				label.setText("She's jealous of the sun.");
			}
			else if(label.getText().equals("She's jealous of the sun."))
			{
				label.setText("Who gets to be the first to see him.");
			}
			else if(label.getText().equals("Who gets to be the first to see him."))
			{
				label.setText("He's jealous of the coffee cup.");
			}
			else if(label.getText().equals("He's jealous of the coffee cup."))
			{
				label.setText("Who gets to kiss her sleept lips awake.");
			}
			else if(label.getText().equals("Who gets to kiss her sleept lips awake."))
			{
				label.setText("She counts every star.");
			}
			else if(label.getText().equals("She counts every star."))
			{
				label.setText("Till he comes from afar.");
			}
			else if(label.getText().equals("Till he comes from afar."))
			{
				label.setText("He dreams of old memories.");
			}
			else if(label.getText().equals("He dreams of old memories."))
			{
				label.setText("but it's starting to feel like centuries.");
			}
			else if(label.getText().equals("but it's starting to feel like centuries."))
			{
				label.setText("She loves him.");
			}
			else if(label.getText().equals("She loves him."))
			{
				label.setText("He loves her.");
			}
			else if(label.getText().equals("He loves her."))
			{
				label.setText("A deeper love than any human heart.");
			}
			else if(label.getText().equals("A deeper love than any human heart."))
			{
				label.setText("She wants to hear about his day.");
			}
			else if(label.getText().equals("She wants to hear about his day."))
			{
				label.setText("He wants her to know everything's gonna be okay.");
			}
			else if(label.getText().equals("He wants her to know everything's gonna be okay."))
			{
				label.setText("Despite the distance...");
			}
			else if(label.getText().equals("Despite the distance..."))
			{
				label.setText("It's only kept them closer.");
			}
			else if(label.getText().equals("It's only kept them closer."))
			{
				label.setText("For she is the future he dreams about.");
			}
			else if(label.getText().equals("For she is the future he dreams about."))
			{
				label.setText("While he is the light in her heart.");
			}
			else if(label.getText().equals("While he is the light in her heart."))
			{
				label.setText("Through thick and thin...");
			}
			else if(label.getText().equals("Through thick and thin..."))
			{
				label.setText("She loves him. ");
			}
			else if(label.getText().equals("She loves him. "))
			{
				label.setText("and he loves her.");
			}
			else if(label.getText().equals("and he loves her."))
			{
				System.exit(0);
			}
			
		}

}

