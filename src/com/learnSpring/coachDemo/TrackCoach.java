package com.learnSpring.coachDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public  TrackCoach(FortuneService fortuneService){
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public PracticeDrillService getBaseballDrills() {
		return null;
	}

	@Override
	public void setEmailAddress(String emailAddress) {

	}

	@Override
	public void setTeamName(String teamName) {

	}
}










