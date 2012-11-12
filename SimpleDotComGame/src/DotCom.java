import java.util.ArrayList;

public class DotCom {
	
	private String name;
	private ArrayList<String> locationCells;

	public String checkYourself(String userGuess) {

		String result = "miss";

		int index = locationCells.indexOf(userGuess);

		if (index >= 0) {
			locationCells.remove(index);

			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		return result;

	}

	public void setLocationCells(ArrayList<String> locationCells) {
		this.locationCells = locationCells;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
