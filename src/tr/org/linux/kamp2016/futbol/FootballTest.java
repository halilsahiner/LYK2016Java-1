package tr.org.linux.kamp2016.futbol;

public class FootballTest {
	
	public static void main(String args[]){
		
		FootballClub genclerbirligi = new FootballClub("Gençlerbirliği", "Kara kızıl", 123456,"19 Mayıs", 22500);
		FootballClub ankaragucu = new FootballClub("Ankaragücü", "Sarı lacivert",132,"19 mayıs",22500);
		SimulateMatch futbol = new SimulateMatch();
		
		futbol.setAsHomeTeam(genclerbirligi.getClubName());
		futbol.setAsGuestTeam(ankaragucu.getClubName());
		futbol.rollTheBall();
		futbol.homeTeamScoresAGoal();
		futbol.homeTeamScoresAGoal();
		futbol.homeTeamScoresAGoal();
		futbol.endOfFirstHalf();
		futbol.homeTeamScoresAGoal();
		futbol.homeTeamScoresAGoal();
		futbol.guestTeamScoresAGoal();
		futbol.endOfGame();
		futbol.announceWinner();
		
		
		
	}
	
	
}
