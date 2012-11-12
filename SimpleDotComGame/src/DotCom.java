
public class DotCom {

	private int numOfHits = 0;
	private int[] locationCells;
	
public String checkYourself(String userGuess)
{
	int guess = Integer.parseInt(userGuess);
	String result = "miss";
	
	for (int cell : locationCells)
	{
		if (guess == cell){
			result = "hit";
			numOfHits++;
			break;
		}
	}
	if (numOfHits == locationCells.length){
		result="kill";
	}
	
	System.out.println(result);
	return result;
	
}

public void setLocationCells(int[] locationCells) {
	this.locationCells = locationCells;
}



}
