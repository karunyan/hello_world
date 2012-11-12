import java.io.*;

public class SimpleDotComeTestDrive {

	public static void main (String[] args){
		
		int numOfGuesses = 0;
		int randomNum = (int)(Math.random()*5);
		int[] locations = {2,3,4};

		
		SimpleDotCom dot = new SimpleDotCom();
		dot.setLocationCells(locations);
		
		//InputStreamReader kGuess = new InputStreamReader(System.in);
		//BufferedReader userGuess = new BufferedReader(kGuess);
		
		
		String userGuess="2";
		String result = dot.checkYourself(userGuess);
		
		String testResult = "failed";
		
		if (result.equals("hit")){
			testResult = "passed";
		}
		
		System.out.println(testResult);
	}
}
