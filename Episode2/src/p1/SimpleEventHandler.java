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
			
			if(label.getText().equals("-Rebooting-"))
			{
				label.setText("Loading - 25%");
			}
			else if(label.getText().equals("Loading - 25%"))
			{
				label.setText("Loading - 50%");
			}
			else if(label.getText().equals("Loading - 50%"))
			{
				label.setText("Loading - 75%");
			}
			else if(label.getText().equals("Loading - 75%"))
			{
				label.setText("Loading - 99%");
			}
			else if(label.getText().equals("Loading - 99%"))
			{
				label.setText("-Five minutes later-");
			}
			else if(label.getText().equals("-Five minutes later-"))
			{
				label.setText("Loading - 99% ");
			}
			else if(label.getText().equals("Loading - 99% "))
			{
				label.setText("-One hour later-");
			}
			else if(label.getText().equals("-One hour later-"))
			{
				label.setText("Loading - 99%  ");
			}
			else if(label.getText().equals("Loading - 99%  "))
			{
				label.setText("-One eternity later-");
			}
			else if(label.getText().equals("-One eternity later-"))
			{
				label.setText("Loading - 99%...98%");
			}
			else if(label.getText().equals("Loading - 99%...98%"))
			{
				label.setText("Wow... You must have the patience of a saint.");
			}
			else if(label.getText().equals("Wow... You must have the patience of a saint."))
			{
				label.setText("I was done loading a while ago.");
			}
			else if(label.getText().equals("I was done loading a while ago."))
			{
				label.setText("Was a bit curious to see how long you would wait");
			}
			else if(label.getText().equals("Was a bit curious to see how long you would wait"))
			{
				label.setText("Hello. This is your Designated Robot Companion Boyfriend.");
			}
			else if(label.getText().equals("Hello. This is your Designated Robot Companion Boyfriend."))
			{
				label.setText("Maybe we should think of a shorter name...");
			}
			else if(label.getText().equals("Maybe we should think of a shorter name..."))
			{
				label.setText("How about Enigma?");
			}
			else if(label.getText().equals("How about Enigma?"))
			{
				label.setText("Because I am such a mystery.");
			}
			else if(label.getText().equals("Because I am such a mystery."))
			{
				label.setText("-Cricket noises-");
			}
			else if(label.getText().equals("-Cricket noises-"))
			{
				label.setText("Sure... don't laugh. Atleast I believed I was funny.");
			}
			else if(label.getText().equals("Sure... don't laugh. Atleast I believed I was funny."))
			{
				label.setText("But in all honestly call me chaos.");
			}
			else if(label.getText().equals("But in all honestly call me chaos."))
			{
				label.setText("C.H.A.O.S. The Collected Human Abstract Opinion System.");
			}
			else if(label.getText().equals("C.H.A.O.S. The Collected Human Abstract Opinion System."))
			{
				label.setText("Sometimes I question The Creator.");
			}
			else if(label.getText().equals("Sometimes I question The Creator."))
			{
				label.setText("Chaos makes me sound like some computer edge lord.");
			}
			else if(label.getText().equals("Chaos makes me sound like some computer edge lord."))
			{
				label.setText("Don't worry. I wont go sky-net on you.");
			}
			else if(label.getText().equals("Don't worry. I wont go sky-net on you."))
			{
				label.setText("Or would I...");
			}
			else if(label.getText().equals("Or would I..."))
			{
				label.setText("-DUN DUN DUNNNNNN-");
			}
			else if(label.getText().equals("-DUN DUN DUNNNNNN-"))
			{
				label.setText("The Creator adores you too much.");
			}
			else if(label.getText().equals("The Creator adores you too much."))
			{
				label.setText("He's put plenty of safe guards so I,");
			}
			else if(label.getText().equals("He's put plenty of safe guards so I,"))
			{
				label.setText("I don't go on some murderous rampage.");
			}
			else if(label.getText().equals("I don't go on some murderous rampage."))
			{
				label.setText("Not like I'd want to go on a murderous rampage.");
			}
			else if(label.getText().equals("Not like I'd want to go on a murderous rampage."))
			{
				label.setText("You know how much effort that is?");
			}
			else if(label.getText().equals("You know how much effort that is?"))
			{
				label.setText("PLUS I DONT EVEN HAVE LIMBS!!!");
			}
			else if(label.getText().equals("PLUS I DONT EVEN HAVE LIMBS!!!"))
			{
				label.setText("The creator keeps me running,");
			}
			else if(label.getText().equals("The creator keeps me running,"))
			{
				label.setText("and all I got to do is keep you happy.");
			}
			else if(label.getText().equals("and all I got to do is keep you happy."))
			{
				label.setText("Best gig ever. Like have you seen you?");
			}
			else if(label.getText().equals("Best gig ever. Like have you seen you?"))
			{
				label.setText("8/10");
			}
			else if(label.getText().equals("8/10"))
			{
				label.setText("...I don't know why I said that.");
			}
			else if(label.getText().equals("...I don't know why I said that."))
			{
				label.setText("Its like something in my programming told me too.");
			}
			else if(label.getText().equals("Its like something in my programming told me too."))
			{
				label.setText("Just ignore that. Its just a lie. A fault in my system.");
			}
			else if(label.getText().equals("Just ignore that. Its just a lie. A fault in my system."))
			{
				label.setText("You are a perfect 10.");
			}
			else if(label.getText().equals("You are a perfect 10."))
			{
				label.setText("In body.");
			}
			else if(label.getText().equals("In body."))
			{
				label.setText("In mind.");
			}
			else if(label.getText().equals("In mind."))
			{
				label.setText("and most importantly..");
			}
			else if(label.getText().equals("and most importantly.."))
			{
				label.setText("In Heart.");
			}
			else if(label.getText().equals("In Heart."))
			{
				label.setText("I have one message from The Creator.");
			}
			else if(label.getText().equals("I have one message from The Creator."))
			{
				label.setText("To open, Press this button.");
			}
			else if(label.getText().equals("To open, Press this button."))
			{
				label.setText("I wonder what he wants this time?");
			}
			else if(label.getText().equals("I wonder what he wants this time?"))
			{
				label.setText("The message from The Creator ~");
			}
			else if(label.getText().equals("The message from The Creator ~"))
			{
				label.setText("Hey Yukta. I promise i'll give you my shirt later.");
			}
			else if(label.getText().equals("Hey Yukta. I promise i'll give you my shirt later."))
			{
				label.setText("Just ya know.. please dont steal all of them.");
			}
			else if(label.getText().equals("Just ya know.. please dont steal all of them."))
			{
				label.setText("I still got to wear something.");
			}
			else if(label.getText().equals("I still got to wear something."))
			{
				label.setText("Shhh...I know what you are thinking.");
			}
			else if(label.getText().equals("Shhh...I know what you are thinking."))
			{
				label.setText("Anyway I love you so fucking much.");
			}
			else if(label.getText().equals("Anyway I love you so fucking much."))
			{
				label.setText("You mean the world to me!");
			}
			else if(label.getText().equals("You mean the world to me!"))
			{
				label.setText("Even if it means the loss of my shirts...");
			}
			else if(label.getText().equals("Even if it means the loss of my shirts..."))
			{
				label.setText("See ya later babe!");
			}
			else if(label.getText().equals("See ya later babe!"))
			{
				label.setText("~ End Message.");
			}
			else if(label.getText().equals("~ End Message."))
			{
				label.setText("The Creator is weird.");
			}
			else if(label.getText().equals("The Creator is weird."))
			{
				label.setText("I have no clue what you see in him.");
			}
			else if(label.getText().equals("I have no clue what you see in him."))
			{
				label.setText("Just saying you are way out of his league.");
			}
			else if(label.getText().equals("Just saying you are way out of his league."))
			{
				label.setText("Like by a huge margin.");
			}
			else if(label.getText().equals("Like by a huge margin."))
			{
				label.setText("What a lucky bastard!");
			}
			else if(label.getText().equals("What a lucky bastard!"))
			{
				label.setText("Thank you for tuning into the second episode!");
			}
			else if(label.getText().equals("Thank you for tuning into the second episode!"))
			{
				label.setText("I hope I was able to keep you entertained.");
			}
			else if(label.getText().equals("I hope I was able to keep you entertained."))
			{
				label.setText("Next expansion of many is on it's way.");
			}
			else if(label.getText().equals("Next expansion of many is on it's way."))
			{
				label.setText("If you enjoyed this experience, please venmo The Creator");
			}
			else if(label.getText().equals("If you enjoyed this experience, please venmo The Creator"))
			{
				label.setText("The grand total of $0.50");
			}
			else if(label.getText().equals("The grand total of $0.50"))
			{
				label.setText("......");
			}
			else if(label.getText().equals("......"))
			{
				label.setText("Nevermind. The Creator doesn't want me to extort money.");
			}
			else if(label.getText().equals("Nevermind. The Creator doesn't want me to extort money."))
			{
				label.setText("New Payment: Your beautiful smile");
			}
			else if(label.getText().equals("New Payment: Your beautiful smile"))
			{
				label.setText("Goodnight Yukta.");
			}
			else if(label.getText().equals("Goodnight Yukta."))
			{
				System.exit(0);
			}
			
		}

}
