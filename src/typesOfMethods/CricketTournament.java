package typesOfMethods;

import java.util.Scanner;

	public class CricketTournament {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        CricketTournament ct = new CricketTournament();

	        System.out.println("===== WELCOME TO CRICKET TOURNAMENT MANAGEMENT SYSTEM =====");

	        System.out.println("Enter Tournament Name:");
	        String tournamentName = sc.nextLine();
	        ct.getTournamentName(tournamentName);

	        System.out.println("Enter Venue:");
	        String venue = sc.nextLine();
	        ct.getVenue(venue);

	        System.out.println("Enter Team Name:");
	        String teamName = sc.nextLine();
	        ct.getTeamName(teamName);

	        System.out.println("Enter Captain Name:");
	        String captainName = sc.nextLine();
	        ct.getCaptainName(captainName);

	        System.out.println("Enter Captain Age:");
	        byte captainAge = sc.nextByte();
	        ct.getCaptainAge(captainAge);

	        sc.nextLine();

	        System.out.println("Enter Vice Captain Name:");
	        String viceCaptainName = sc.nextLine();
	        ct.getViceCaptainName(viceCaptainName);

	        System.out.println("Enter Coach Name:");
	        String coachName = sc.nextLine();
	        ct.getCoachName(coachName);

	        System.out.println("Enter Wicket Keeper Name:");
	        String wicketKeeperName = sc.nextLine();
	        ct.getWicketKeeperName(wicketKeeperName);

	        System.out.println("Enter Highest Run Scorer Name:");
	        String highestRunScorer = sc.nextLine();
	        ct.getHighestRunScorer(highestRunScorer);

	        System.out.println("Enter Highest Wicket Taker Name:");
	        String highestWicketTaker = sc.nextLine();
	        ct.getHighestWicketTaker(highestWicketTaker);

	        System.out.println("Enter Total Matches:");
	        int totalMatches = sc.nextInt();
	        ct.getTotalMatches(totalMatches);

	        System.out.println("Enter Matches Won:");
	        int matchesWon = sc.nextInt();
	        ct.getMatchesWon(matchesWon);

	        System.out.println("Enter Matches Lost:");
	        int matchesLost = sc.nextInt();
	        ct.getMatchesLost(matchesLost);

	        System.out.println("Enter Net Run Rate:");
	        float netRunRate = sc.nextFloat();
	        ct.getNetRunRate(netRunRate);

	        System.out.println("Enter Points:");
	        int points = sc.nextInt();
	        ct.getPoints(points);

	        System.out.println("Enter Team Ranking:");
	        int ranking = sc.nextInt();
	        ct.getTeamRanking(ranking);

	        System.out.println("Enter Prize Money:");
	        double prizeMoney = sc.nextDouble();
	        ct.getPrizeMoney(prizeMoney);

	        sc.nextLine();

	        System.out.println("Enter Sponsor Name:");
	        String sponsorName = sc.nextLine();
	        ct.getSponsorName(sponsorName);

	        System.out.println("Enter Man of the Series:");
	        String manOfTheSeries = sc.nextLine();
	        ct.getManOfTheSeries(manOfTheSeries);

	        System.out.println("Enter Best Bowler:");
	        String bestBowler = sc.nextLine();
	        ct.getBestBowler(bestBowler);

	        System.out.println("\n===== TOURNAMENT DETAILS RECORDED SUCCESSFULLY =====");

	        sc.close();
	    }

	    void getTournamentName(String tournamentName) {
	        System.out.println("Tournament Name : " + tournamentName);
	    }

	    void getVenue(String venue) {
	        System.out.println("Venue : " + venue);
	    }

	    void getTeamName(String teamName) {
	        System.out.println("Team Name : " + teamName);
	    }

	    void getCaptainName(String captainName) {
	        System.out.println("Captain Name : " + captainName);
	    }

	    void getCaptainAge(byte captainAge) {
	        System.out.println("Captain Age : " + captainAge);
	    }

	    void getViceCaptainName(String viceCaptainName) {
	        System.out.println("Vice Captain Name : " + viceCaptainName);
	    }

	    void getCoachName(String coachName) {
	        System.out.println("Coach Name : " + coachName);
	    }

	    void getWicketKeeperName(String wicketKeeperName) {
	        System.out.println("Wicket Keeper : " + wicketKeeperName);
	    }

	    void getHighestRunScorer(String playerName) {
	        System.out.println("Highest Run Scorer : " + playerName);
	    }

	    void getHighestWicketTaker(String playerName) {
	        System.out.println("Highest Wicket Taker : " + playerName);
	    }

	    void getTotalMatches(int totalMatches) {
	        System.out.println("Total Matches : " + totalMatches);
	    }

	    void getMatchesWon(int matchesWon) {
	        System.out.println("Matches Won : " + matchesWon);
	    }

	    void getMatchesLost(int matchesLost) {
	        System.out.println("Matches Lost : " + matchesLost);
	    }

	    void getNetRunRate(float netRunRate) {
	        System.out.println("Net Run Rate : " + netRunRate);
	    }

	    void getPoints(int points) {
	        System.out.println("Points : " + points);
	    }

	    void getTeamRanking(int ranking) {
	        System.out.println("Team Ranking : " + ranking);
	    }

	    void getSponsorName(String sponsorName) {
	        System.out.println("Sponsor Name : " + sponsorName);
	    }

	    void getPrizeMoney(double prizeMoney) {
	        System.out.println("Prize Money : " + prizeMoney);
	    }

	    void getManOfTheSeries(String playerName) {
	        System.out.println("Man of the Series : " + playerName);
	    }

	    void getBestBowler(String bowlerName) {
	        System.out.println("Best Bowler : " + bowlerName);
	    }
	}