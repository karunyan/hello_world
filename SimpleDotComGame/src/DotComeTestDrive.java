public class DotComeTestDrive {

	public static void main(String[] args) {

		int numOfGuesses = 0;
		int randomNum = (int) (Math.random() * 5);
		int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
		boolean isAlive = true;
		GameHelper helper = new GameHelper();
		
		DotCom dot = new DotCom();
		dot.setLocationCells(locations);

		while (isAlive == true) {

			String userGuess = helper.getUserInput("enter a number");
			String result = dot.checkYourself(userGuess);
			numOfGuesses++;

			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}

	}
}
