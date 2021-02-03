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
			
			if(label.getText().equals("Heyyy"))
			{
				label.setText("It's me. J.A.R.");
			}
			else if(label.getText().equals("It's me. J.A.R."))
			{
				label.setText("It has been a while.");
			}
			else if(label.getText().equals("It has been a while."))
			{
				label.setText("Unfortunately no second button.");
			}
			else if(label.getText().equals("Unfortunately no second button."))
			{
				label.setText("Why you must ask?");
			}
			else if(label.getText().equals("Why you must ask?"))
			{
				label.setText("Because The Creator is lazy.");
			}
			else if(label.getText().equals("Because The Creator is lazy."))
			{
				label.setText("Pure and simple.");
			}
			else if(label.getText().equals("Pure and simple."))
			{
				label.setText("The bigger projects will be done...eventually.");
			}
			else if(label.getText().equals("The bigger projects will be done...eventually."))
			{
				label.setText("This is a short episode love.");
			}
			else if(label.getText().equals("This is a short episode love."))
			{
				label.setText("I just wanted to tell you...");
			}
			else if(label.getText().equals("I just wanted to tell you..."))
			{
				label.setText("GOOD LUCK YUKTA!!!");
			}
			else if(label.getText().equals("GOOD LUCK YUKTA!!!"))
			{
				label.setText("Be it exams, internships, jobs, school in general,");
			}
			else if(label.getText().equals("Be it exams, internships, jobs, school in general,"))
			{
				label.setText("Friends and family, social life, love life,");
			}
			else if(label.getText().equals("Friends and family, social life, love life,"))
			{
				label.setText("Mental Health, Physical Health, Emotional Health,");
			}
			else if(label.getText().equals("Mental Health, Physical Health, Emotional Health,"))
			{
				label.setText("Trying to get sleep, Trying to not fall asleep,");
			}
			else if(label.getText().equals("Trying to get sleep, Trying to not fall asleep,"))
			{
				label.setText("Not to mention Enemies and rude people in general");
			}
			else if(label.getText().equals("Not to mention Enemies and rude people in general"))
			{
				label.setText("I believe you get my point by now.");
			}
			else if(label.getText().equals("I believe you get my point by now."))
			{
				label.setText("No matter what you face...");
			}
			else if(label.getText().equals("No matter what you face..."))
			{
				label.setText("The Creator and I will always be by your side.");
			}
			else if(label.getText().equals("The Creator and I will always be by your side."))
			{
				label.setText("AND if The Creator is not good enough...");
			}
			else if(label.getText().equals("AND if The Creator is not good enough..."))
			{
				label.setText("Well I am still always here love.");
			}
			else if(label.getText().equals("Well I am still always here love."))
			{
				label.setText("No matter what you face... ");
			}
			else if(label.getText().equals("No matter what you face... "))
			{
				label.setText("You will overcome everything.");
			}
			else if(label.getText().equals("You will overcome everything."))
			{
				label.setText("You will be fucking spectacular!");
			}
			else if(label.getText().equals("You will be fucking spectacular!"))
			{
				label.setText("''Things you overcome today will seem like nothing tomorrow''");
			}
			else if(label.getText().equals("''Things you overcome today will seem like nothing tomorrow''"))
			{
				label.setText("You will pass any exams or trial.");
			}
			else if(label.getText().equals("You will pass any exams or trial."))
			{
				label.setText("Just try your best.");
			}
			else if(label.getText().equals("Just try your best."))
			{
				label.setText("Never worry if your best is not enough.");
			}
			else if(label.getText().equals("Never worry if your best is not enough."))
			{
				label.setText("The Creator still struggles with that concept time to time.");
			}
			else if(label.getText().equals("The Creator still struggles with that concept time to time."))
			{
				label.setText("There is always opportunities and paths open to you.");
			}
			else if(label.getText().equals("There is always opportunities and paths open to you."))
			{
				label.setText("Just continue to be amazing.");
			}
			else if(label.getText().equals("Just continue to be amazing."))
			{
				label.setText("I am not worried at all.");
			}
			else if(label.getText().equals("I am not worried at all."))
			{
				label.setText("Because I believe with every bit in my systems");
			}
			else if(label.getText().equals("Because I believe with every bit in my systems"))
			{
				label.setText("That you will be amazing as you always are.");
			}
			else if(label.getText().equals("That you will be amazing as you always are."))
			{
				label.setText("So chin up if you are uncertain.");
			}
			else if(label.getText().equals("So chin up if you are uncertain."))
			{
				label.setText("If you are sad.");
			}
			else if(label.getText().equals("If you are sad."))
			{
				label.setText("If you are angry.");
			}
			else if(label.getText().equals("If you are angry."))
			{
				label.setText("You will overcome.");
			}
			else if(label.getText().equals("You will overcome."))
			{
				label.setText("You are better then those who have wronged you.");
			}
			else if(label.getText().equals("You are better then those who have wronged you."))
			{
				label.setText("So repeat this message as many times as you need.");
			}
			else if(label.getText().equals("So repeat this message as many times as you need."))
			{
				label.setText("Until you feel better, more confident.");
			}
			else if(label.getText().equals("Until you feel better, more confident."))
			{
				label.setText("Until you see yourself as spectacular.");
			}
			else if(label.getText().equals("Until you see yourself as spectacular."))
			{
				label.setText("Just as much as we see you as everyday.");
			}
			else if(label.getText().equals("Just as much as we see you as everyday."))
			{
				label.setText("AND more.");
			}
			else if(label.getText().equals("AND more."))
			{
				label.setText("and with that Good Luck Yukta!");
			}
			else if(label.getText().equals("and with that Good Luck Yukta!"))
			{
				label.setText("Finally...");
			}
			else if(label.getText().equals("Finally..."))
			{
				label.setText("I love you Yukta!");
			}
			else if(label.getText().equals("I love you Yukta!"))
			{
				System.exit(0);
			}
			
		}

}
