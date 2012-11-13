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
		System.out.println("Try to sink them all in the fewest number of guesses \n");


		for (DotCom dotComToSet : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}

	}

	private void startPlaying() {
		while (!dotComList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String Guess) {
		numOfGuesses++;
		String result = "miss";

		for (DotCom dotComToTest : dotComList) {
			result = dotComToTest.checkYourself(Guess);
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}

	private void finishGame() {
		System.out
				.println("All Dot Coms are dead! Your stock is now worthless");
		if (numOfGuesses <= 18) {
			System.out
					.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got out before your options sank.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses
					+ " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	}

	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}

}
