public class SimpleDotComeTestDrive {

	public static void main(String[] args) {

		int numOfGuesses = 0;
		int randomNum = (int) (Math.random() * 5);
		int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
		boolean isAlive = true;
		GameHelper helper = new GameHelper();
		
		SimpleDotCom dot = new SimpleDotCom();
		dot.setLocationCells(locations);

		// InputStreamReader kGuess = new InputStreamReader(System.in);
		// BufferedReader userGuess = new BufferedReader(kGuess);

		while (isAlive == true) {

			//String userGuess = "2";
			String userGuess = helper.getUserInput("enter a number");
			String result = dot.checkYourself(userGuess);
			numOfGuesses++;

			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + "guesses");
			}
		}

	}
}
