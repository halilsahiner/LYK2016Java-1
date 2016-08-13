package tr.org.linux.kamp2016.futbol;

public class SimulateMatch extends Football{
	private int scoresOfHomeTeam = 0;
	private int scoresOfGuestTeam = 0;
	
	private Object o;
	private Object o2;
	
	public void setAsHomeTeam(Object o){
		this.o = o;
		System.out.println(o + " ev sahibi");
	}
		
	public void setAsGuestTeam(Object o2){
		this.o2 = o2;
		System.out.println(o2 + " misafir");
	}
	
	public void homeTeamScoresAGoal(){
		System.out.println(o + " gol attı!");
		scoresOfHomeTeam = scoresOfHomeTeam + 1;
	}
	
	public void guestTeamScoresAGoal(){
		System.out.println(o2 + " gol attı");
		scoresOfGuestTeam++;
	}
	
	public void endOfFirstHalf(){
		System.out.println("İlk yarı sona erdi");
		
	}
	
	public void endOfGame(){
		
		System.out.println("Maç bitti");
		
	}
	
	public void announceWinner(){
		int x = scoresOfHomeTeam;
		int y = scoresOfGuestTeam;
		
		if (x > y){
			System.out.println("Kazanan " + o);
		}
		else if(x < y)
		System.out.println("Kazanan" + o2);
		else System.out.println("Beraberlik");
		System.out.println(o + " " + scoresOfHomeTeam + " tane gol attı" );
		System.out.println(o2 + " " + scoresOfGuestTeam + " tane gol attı");
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
	
	
	

}
