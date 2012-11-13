import java.util.*;

public class DotComBust {

	private int numOfGuesses = 0;
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private GameHelper helper = new GameHelper();

	private void setUpGame() {
		DotCom one = new DotCom();
		one.setName("Pet.com");

		DotCom two = new DotCom();
		two.setName("eToy.com");

		DotCom three = new DotCom();
		three.setName("Go2.com");

		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);

		System.out.println("Your goal is to sink there dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");

		for (DotCom dotComToSet : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3); // Resolve
			dotComToSet.setLocationCells(newLocation);
		}

	}

	public void startPlaying() {
		while (!dotComList.isEmpty()){
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	public void checkUserGuess(String Guess) {

	}

	public void finishGame() {

	}

	public static void main(String[] args) {

	}

}
