package day1.robot;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		int i = 0;
	String qwerty = "you have won. you are awesome. good  job. hip hip horray";
		String words = "Wrong";
	String answer1 = JOptionPane.showInputDialog("This is a quiz to determine your stupidity level. Type go to begin.");
	if(answer1.equals("go to begin"))
	{
		String answer2 = JOptionPane.showInputDialog("Why did the chicken cross the road???");
		if(answer2.equals("why do we have to question the chicken's motives?"))
		{
			String answer3 = JOptionPane.showInputDialog("When does christmas come before thanksgiving?");
			if(answer3.equals("in the dictionary"))
			{
				String answer4 = JOptionPane.showInputDialog("What is more useful when it's broken?");
				if(answer4.equals("an egg"))
				{
					speak(qwerty);
				}
				else{
					speak(words);
					JOptionPane.showMessageDialog(null, "Oh you are a 'pure genius'");
				}
			}
			else{
				speak(words);
				JOptionPane.showMessageDialog(null, "You smart");
			}
		}
		else
		{
			speak(words);
			JOptionPane.showMessageDialog(null, "You not that smart");
			
		}
	}
	else{
		speak(words);
		JOptionPane.showMessageDialog(null, "You stupid");
	}
	
	
		
	}
	 static void speak(String words) {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
