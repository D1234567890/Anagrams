import javax.swing.JOptionPane;

public class AnagramDecoder {
	public static void main(String[] args) {
		String saveWord = JOptionPane.showInputDialog("I'll find all the anagrams of the word you enter!");
		JOptionPane.showMessageDialog(null, findAndCompareAllPossibleAnagrams(saveWord));
	}

	public static String findAndCompareAllPossibleAnagrams(String word) {
		String addTo = "";
		
	}
}