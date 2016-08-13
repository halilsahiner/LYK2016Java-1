package tr.org.linux.kamp2016.futbol;

public class FootballClub extends Football {
	
	private String clubName;
	private String colors;
	private int clubValue;
	private String stadiumName;
	private int stadiumCapacity;
	
	public FootballClub(String clubName, String colors, int clubValue, String stadiumName, int stadiumCapacity){
		this.clubName = clubName;
		this.colors = colors;
		this.clubValue = clubValue;
		this.stadiumName = stadiumName;
		this.stadiumCapacity = stadiumCapacity;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public int getClubValue() {
		return clubValue;
	}

	public void setClubValue(int clubValue) {
		this.clubValue = clubValue;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public int getStadiumCapacity() {
		return stadiumCapacity;
	}

	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}

	@Override
	public void rollTheBall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anOpponentScores() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasOpponent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void haveWinner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasHoliganism() {
		// TODO Auto-generated method stub
		
	}
	
	public void displayTeam(){

	     System.out.println("Takım ismi: " + clubName + " Takım renkleri: " + colors + " Kulüp değeri: " + clubValue +
	     " Stadyum ismi: " +stadiumName + " Stadyum kapasitesi " + stadiumCapacity);


	 }
	

}
