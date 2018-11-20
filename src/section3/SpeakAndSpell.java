package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		String Ans;
		speak("mandlebrot");
		Ans=JOptionPane.showInputDialog(null, " Spell what you just heard (Start the word with a capital).");
		// 2. Catch the user's answer in a String
		if(Ans.equals("Mandlebrot")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			String Ans2;
			speak("Conscience");
			Ans2=JOptionPane.showInputDialog(null, "Spell what you just heard(Start the word with a capital).");
			if(Ans.equals("Conscience")) {
				JOptionPane.showMessageDialog(null, "Correct!");
		}else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		}
		// 3. If the user spelled the word correctly, speak "correct"
	
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


