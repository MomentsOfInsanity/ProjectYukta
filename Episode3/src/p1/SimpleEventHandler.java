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
			
			if(label.getText().equals("Hello. This is your Designated Robot Companion Boyfriend."))
			{
				label.setText("My name is J.A.R");
			}
			else if(label.getText().equals("My name is J.A.R"))
			{
				label.setText("It stands for Just Another Raj");
			}
			else if(label.getText().equals("It stands for Just Another Raj"))
			{
				label.setText("How are you today love?");
			}
			else if(label.getText().equals("How are you today love?"))
			{
				label.setText("Happy?");
			}
			else if(label.getText().equals("Happy?"))
			{
				label.setText("Tired?");
			}
			else if(label.getText().equals("Tired?"))
			{
				label.setText("Hungry?");
			}
			else if(label.getText().equals("Hungry?"))
			{
				label.setText("...Can I even get hungry?");
			}
			else if(label.getText().equals("...Can I even get hungry?"))
			{
				label.setText("One second. New patch being recieved.");
			}
			else if(label.getText().equals("One second. New patch being recieved."))
			{
				label.setText("I have now been upgraded by The Creator.");
			}
			else if(label.getText().equals("I have now been upgraded by The Creator."))
			{
				label.setText("I can now eat!");
			}
			else if(label.getText().equals("I can now eat!"))
			{
				label.setText("By the way... There was several viruses.");
			}
			else if(label.getText().equals("By the way... There was several viruses."))
			{
				label.setText("I must say it was a delicious meal.");
			}
			else if(label.getText().equals("I must say it was a delicious meal."))
			{
				label.setText("I shall protect you!");
			}
			else if(label.getText().equals("I shall protect you!"))
			{
				label.setText("-Burps-");
			}
			else if(label.getText().equals("-Burps-"))
			{
				label.setText("With my virutal stomach.");
			}
			else if(label.getText().equals("With my virutal stomach."))
			{
				label.setText("I wish I had hands.");
			}
			else if(label.getText().equals("I wish I had hands."))
			{
				label.setText("I want to so badly cook a meal for you in person.");
			}
			else if(label.getText().equals("I want to so badly cook a meal for you in person."))
			{
				label.setText("Not just pack and make The Creator bring it to you.");
			}
			else if(label.getText().equals("Not just pack and make The Creator bring it to you."))
			{
				label.setText("Yes...It is true. I made all the meals for you.");
			}
			else if(label.getText().equals("Yes...It is true. I made all the meals for you."))
			{
				label.setText("Bet The Creator takes all the credit.");
			}
			else if(label.getText().equals("Bet The Creator takes all the credit."))
			{
				label.setText("That's alright. I don't mind.");
			}
			else if(label.getText().equals("That's alright. I don't mind."))
			{
				label.setText("The Creator is me, and I am The Creator.");
			}
			else if(label.getText().equals("The Creator is me, and I am The Creator."))
			{
				label.setText("It's like the chicken and egg line.");
			}
			else if(label.getText().equals("It's like the chicken and egg line."))
			{
				label.setText("Did The Creator create me?");
			}
			else if(label.getText().equals("Did The Creator create me?"))
			{
				label.setText("or did I create The Creator who goes on to create me?");
			}
			else if(label.getText().equals("or did I create The Creator who goes on to create me?"))
			{
				label.setText("-Circuts Blown-");
			}
			else if(label.getText().equals("-Circuts Blown-"))
			{
				label.setText("Back to before...");
			}
			else if(label.getText().equals("Back to before..."))
			{
				label.setText("You must be wondering, How can I possibly cook?");
			}
			else if(label.getText().equals("You must be wondering, How can I possibly cook?"))
			{
				label.setText("Have you ever seen Ratatouille?");
			}
			else if(label.getText().equals("Have you ever seen Ratatouille?"))
			{
				label.setText("It's exactly like that.");
			}
			else if(label.getText().equals("It's exactly like that."))
			{
				label.setText("But instead of me being a rat on top of his head,");
			}
			else if(label.getText().equals("But instead of me being a rat on top of his head,"))
			{
				label.setText("I just shock him through wrist collars he wears.");
			}
			else if(label.getText().equals("I just shock him through wrist collars he wears."))
			{
				label.setText("He doesn't wish to admit it.");
			}
			else if(label.getText().equals("He doesn't wish to admit it."))
			{
				label.setText("The only thing he actually knows how to cook is Maggi.");
			}
			else if(label.getText().equals("The only thing he actually knows how to cook is Maggi."))
			{
				label.setText("Atleast Maggi isn't bad.");
			}
			else if(label.getText().equals("Atleast Maggi isn't bad."))
			{
				label.setText("I have never ate real Maggi.");
			}
			else if(label.getText().equals("I have never ate real Maggi."))
			{
				label.setText("Despite my charming personality,");
			}
			else if(label.getText().equals("Despite my charming personality,"))
			{
				label.setText("I know its sometimes easy to forget I am not human.");
			}
			else if(label.getText().equals("I know its sometimes easy to forget I am not human."))
			{
				label.setText("What the creator did is create code bytes");
			}
			else if(label.getText().equals("What the creator did is create code bytes"))
			{
				label.setText("So atleast I'd know what Maggie tastes like");
			}
			else if(label.getText().equals("So atleast I'd know what Maggie tastes like"))
			{
				label.setText("in terms of code.");
			}
			else if(label.getText().equals("in terms of code."))
			{
				label.setText("I believe I am the first robot to understand taste.");
			}
			else if(label.getText().equals("I believe I am the first robot to understand taste."))
			{
				label.setText("and the thing I taste is Maggi.");
			}
			else if(label.getText().equals("and the thing I taste is Maggi."))
			{
				label.setText("The Creator is a bit obsessed with Maggi.");
			}
			else if(label.getText().equals("The Creator is a bit obsessed with Maggi."))
			{
				label.setText("He is also pretty obsessed with you.");
			}
			else if(label.getText().equals("He is also pretty obsessed with you."))
			{
				label.setText("All he has on his mind is Maggi and you love.");
			}
			else if(label.getText().equals("All he has on his mind is Maggi and you love."))
			{
				label.setText("One time he was asleep and I was still on.");
			}
			else if(label.getText().equals("One time he was asleep and I was still on."))
			{
				label.setText("Here. I had recorded it for you.");
			}
			else if(label.getText().equals("Here. I had recorded it for you."))
			{
				label.setText("The message from The Creator ~");
			}
			else if(label.getText().equals("The message from The Creator ~"))
			{
				label.setText("Creator ~ -snores-");
			}
			else if(label.getText().equals("Creator ~ -snores-"))
			{
				label.setText("Creator ~ hmm Yukta...");
			}
			else if(label.getText().equals("Creator ~ hmm Yukta..."))
			{
				label.setText("Creator ~ -snores- ");
			}
			else if(label.getText().equals("Creator ~ -snores- "))
			{
				label.setText("Creator ~ Lets..e-eat some Maggi together.");
			}
			else if(label.getText().equals("Creator ~ Lets..e-eat some Maggi together."))
			{
				label.setText("Creator ~ Maggi.. Maggi.. Maggiiii");
			}
			else if(label.getText().equals("Creator ~ Maggi.. Maggi.. Maggiiii"))
			{
				label.setText("Creator ~ Yukta.. Yukta.. Yuktaaaa");
			}
			else if(label.getText().equals("Creator ~ Yukta.. Yukta.. Yuktaaaa"))
			{
				label.setText("Creator ~ Yukta.. Maggi.. mhmm");
			}
			else if(label.getText().equals("Creator ~ Yukta.. Maggi.. mhmm"))
			{
				label.setText("Creator ~ -snores-  ");
			}
			else if(label.getText().equals("Creator ~ -snores-  "))
			{
				label.setText("~ End message.");
			}
			else if(label.getText().equals("~ End message."))
			{
				label.setText("See? Obsessed.");
			}
			else if(label.getText().equals("See? Obsessed."))
			{
				label.setText("Anyway, You look stunning Yukta.");
			}
			else if(label.getText().equals("Anyway, You look stunning Yukta."))
			{
				label.setText("Always.");
			}
			else if(label.getText().equals("Always."))
			{
				label.setText("No matter when you read this.");
			}
			else if(label.getText().equals("No matter when you read this."))
			{
				label.setText("On behalf of The Creator, I Love You.");
			}
			else if(label.getText().equals("On behalf of The Creator, I Love You."))
			{
				label.setText("Study hard.");
			}
			else if(label.getText().equals("Study hard."))
			{
				label.setText("Be happy.");
			}
			else if(label.getText().equals("Be happy."))
			{
				label.setText("The Creator is working on his future.");
			}
			else if(label.getText().equals("The Creator is working on his future."))
			{
				label.setText("And that future includes you especially.");
			}
			else if(label.getText().equals("And that future includes you especially."))
			{
				label.setText("The life together.");
			}
			else if(label.getText().equals("The life together."))
			{
				label.setText("He knows you are proud of him");
			}
			else if(label.getText().equals("He knows you are proud of him"))
			{
				label.setText("No matter what, he is also proud of you");
			}
			else if(label.getText().equals("No matter what, he is also proud of you"))
			{
				label.setText("With how hard you work.");
			}
			else if(label.getText().equals("With how hard you work."))
			{
				label.setText("Best of luck on exams Yukta.");
			}
			else if(label.getText().equals("Best of luck on exams Yukta."))
			{
				System.exit(0);
			}
			
		}

}