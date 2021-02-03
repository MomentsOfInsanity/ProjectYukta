package p1;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class SimpleEventHandler implements EventHandler
{
	private Label label;
	
		public SimpleEventHandler(Label label)
		{
			this.label = label;
		
		}
		@Override
		public void handle(Event event)
		{
			
			if(label.getText().equals("Hello Yukta."))
			{
				label.setText("Do you want to play a game?");
			}
			else if(label.getText().equals("Do you want to play a game?"))
			{
				label.setText("Well... its not so much of a game.");
			}
			else if(label.getText().equals("Well... its not so much of a game."))
			{
				label.setText("Its more like you press this button.");
			}
			else if(label.getText().equals("Its more like you press this button."))
			{
				label.setText("and I, your designated robot companion boyfriend,");
			}
			else if(label.getText().equals("and I, your designated robot companion boyfriend,"))
			{
				label.setText("will tell you something awesome.");
			}
			else if(label.getText().equals("will tell you something awesome."))
			{
				label.setText("Want to know what that awesome thing is?");
			}
			else if(label.getText().equals("Want to know what that awesome thing is?"))
			{
				label.setText("Why obviously it's Icecream!");
			}
			else if(label.getText().equals("Why obviously it's Icecream!"))
			{
				label.setText("But... the sweetest thing in the world is you :p");
			}
			else if(label.getText().equals("But... the sweetest thing in the world is you :p"))
			{
				label.setText("hmm....");
			}
			else if(label.getText().equals("hmm...."))
			{
				label.setText("Oh?");
			}
			else if(label.getText().equals("Oh?"))
			{
				label.setText("Don't you have something better to do then press a button?");
			}
			else if(label.getText().equals("Don't you have something better to do then press a button?"))
			{
				label.setText("For instance giving attention to the guy who made this for you?");
			}
			else if(label.getText().equals("For instance giving attention to the guy who made this for you?"))
			{
				label.setText("No?");
			}
			else if(label.getText().equals("No?"))
			{
				label.setText("How about I tell you a story instead.");
			}
			else if(label.getText().equals("How about I tell you a story instead."))
			{
				label.setText("Once upon a time, there was this girl.");
			}
			else if(label.getText().equals("Once upon a time, there was this girl."))
			{
				label.setText("She drank, she partied, She danced like no other.");
			}
			else if(label.getText().equals("She drank, she partied, She danced like no other."))
			{
				label.setText("She was one of the most beautiful girls to have existed");
			}
			else if(label.getText().equals("She was one of the most beautiful girls to have existed"))
			{
				label.setText("One day through some sketchy app");
			}
			else if(label.getText().equals("One day through some sketchy app"))
			{
				label.setText("She met this boy. It wasnt even love at first sight!");
			}
			else if(label.getText().equals("She met this boy. It wasnt even love at first sight!"))
			{
				label.setText("The boy going through his own drama,");
			}
			else if(label.getText().equals("The boy going through his own drama,"))
			{
				label.setText("was not in the mood for anyone new.");
			}
			else if(label.getText().equals("was not in the mood for anyone new."))
			{
				label.setText("But that didnt deter her.");
			}
			else if(label.getText().equals("But that didnt deter her."))
			{
				label.setText("Thank god for small mercies!");
			}
			else if(label.getText().equals("Thank god for small mercies!"))
			{
				label.setText("If she didnt decide to continue being friends...");
			}
			else if(label.getText().equals("If she didnt decide to continue being friends..."))
			{
				label.setText("I wouldn't...");
			}
			else if(label.getText().equals("I wouldn't..."))
			{
				label.setText("I-I mean the boy. Yes the boy.");
			}
			else if(label.getText().equals("I-I mean the boy. Yes the boy."))
			{
				label.setText("This is not a story about me.");
			}
			else if(label.getText().equals("This is not a story about me."))
			{
				label.setText("I am just your friendly 'not in love' robot boyfriend companion.");
			}
			else if(label.getText().equals("I am just your friendly 'not in love' robot boyfriend companion."))
			{
				label.setText("-Looks at creator who is totally not jealous of his robot-");
			}
			else if(label.getText().equals("-Looks at creator who is totally not jealous of his robot-"))
			{
				label.setText("As I was saying...");
			}
			else if(label.getText().equals("As I was saying..."))
			{
				label.setText("The boy wouldn't have met the girl of his life.");
			}
			else if(label.getText().equals("The boy wouldn't have met the girl of his life."))
			{
				label.setText("Well I would say dreams...");
			}
			else if(label.getText().equals("Well I would say dreams..."))
			{
				label.setText("But the girl is better then any girl he could ever dream off.");
			}
			else if(label.getText().equals("But the girl is better then any girl he could ever dream off."))
			{
				label.setText("The boy took her on some supposedly platonic dates.");
			}
			else if(label.getText().equals("The boy took her on some supposedly platonic dates."))
			{
				label.setText("Yukta. Thank you for putting up with his stupidity");
			}
			else if(label.getText().equals("Yukta. Thank you for putting up with his stupidity"))
			{
				label.setText("and having the patience till");
			}
			else if(label.getText().equals("and having the patience till"))
			{
				label.setText("till he got his head out of his");
			}
			else if(label.getText().equals("till he got his head out of his"))
			{
				label.setText("...well you know and finally asked you out.");
			}
			else if(label.getText().equals("...well you know and finally asked you out."))
			{
				label.setText("Oh wait... I forgot I was in the middle of a story.");
			}
			else if(label.getText().equals("Oh wait... I forgot I was in the middle of a story."))
			{
				label.setText("The boy and girl lived together happily ever after!");
			}
			else if(label.getText().equals("The boy and girl lived together happily ever after!"))
			{
				label.setText("The End.");
			}
			else if(label.getText().equals("The End."))
			{
				label.setText(" ");
			}
			else if(label.getText().equals(" "))
			{
				label.setText("Oh Hi. I am your");
			}
			else if(label.getText().equals("Oh Hi. I am your"))
			{
				label.setText("designated robot companion boyfriend");
			}
			else if(label.getText().equals("designated robot companion boyfriend"))
			{
				label.setText("I have one message from the creator.");
			}
			else if(label.getText().equals("I have one message from the creator."))
			{
				label.setText("To open, Press this button.");
			}
			else if(label.getText().equals("To open, Press this button."))
			{
				label.setText("Not like you have a choice.");
			}
			else if(label.getText().equals("Not like you have a choice."))
			{
				label.setText("There is only one button");
			}
			else if(label.getText().equals("There is only one button"))
			{
				label.setText("Unless you X out.");
			}
			else if(label.getText().equals("Unless you X out."))
			{
				label.setText("Then you would have to play this whole message");
			}
			else if(label.getText().equals("Then you would have to play this whole message"))
			{
				label.setText("all over again.");
			}
			else if(label.getText().equals("all over again."))
			{
				label.setText("The message from The Creator ~");
			}
			else if(label.getText().equals("The message from The Creator ~"))
			{
				label.setText("Hey love. I hope you enjoyed this small little game.");
			}
			else if(label.getText().equals("Hey love. I hope you enjoyed this small little game."))
			{
				label.setText("I just wanted to tell you");
			}
			else if(label.getText().equals("I just wanted to tell you"))
			{
				label.setText("I love you Yukta.");
			}
			else if(label.getText().equals("I love you Yukta."))
			{
				label.setText("Thank you for making me the happiest man!");
			}
			else if(label.getText().equals("Thank you for making me the happiest man!"))
			{
				label.setText("I feel so lucky to be with you");
			}
			else if(label.getText().equals("I feel so lucky to be with you"))
			{
				label.setText("To all the future moments we share");
			}
			else if(label.getText().equals("To all the future moments we share"))
			{
				label.setText("Together.");
			}
			else if(label.getText().equals("Together."))
			{
				label.setText("~ End Message.");
			}
			else if(label.getText().equals("~ End Message."))
			{
				label.setText("Please wait for future expansions");
			}
			else if(label.getText().equals("Please wait for future expansions"))
			{
				label.setText("to your designated robot companion boyfriend");
			}
			else if(label.getText().equals("to your designated robot companion boyfriend"))
			{
				label.setText("More stories, more jokes, more of everything!");
			}
			else if(label.getText().equals("More stories, more jokes, more of everything!"))
			{
				label.setText("You have another message from The Creator.");
			}
			else if(label.getText().equals("You have another message from The Creator."))
			{
				label.setText("Why aren't you miss popular?");
			}
			else if(label.getText().equals("Why aren't you miss popular?"))
			{
				label.setText("The Creator never dotes on me like he does you.");
			}
			else if(label.getText().equals("The Creator never dotes on me like he does you."))
			{
				label.setText("New message from The Creator ~");
			}
			else if(label.getText().equals("New message from The Creator ~"))
			{
				label.setText("How do I turn this thing off?");
			}
			else if(label.getText().equals("How do I turn this thing off?"))
			{
				label.setText("-Smacks machine-");
			}
			else if(label.getText().equals("-Smacks machine-"))
			{
				label.setText("Computer: Sending Message");
			}
			else if(label.getText().equals("Computer: Sending Message"))
			{
				label.setText("WAIT NO! DON'T SEND THA...");
			}
			else if(label.getText().equals("WAIT NO! DON'T SEND THA..."))
			{
				System.exit(0);
			}
			
		}

}
