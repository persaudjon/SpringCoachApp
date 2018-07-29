package com.learnSpring.coachDemo;

public class BaseballCoach implements Coach {

	FortuneService fortune;
	PracticeDrillService baseballDrills;
	private String EmailAddress;
	private  String teamName;

    public BaseballCoach(FortuneService fortune){
		this.fortune=fortune;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
		System.out.println("The coaches email address is " + emailAddress);
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
		System.out.println("The teams name  is " +  teamName);
	}

	public String getTeamName() {
		return teamName;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }

	public void setBaseballDrills(PracticeDrillService baseballDrills) {
		this.baseballDrills = baseballDrills;
	}

    public PracticeDrillService getBaseballDrills() {
        return baseballDrills;
    }
}








