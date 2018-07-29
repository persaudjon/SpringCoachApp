package com.learnSpring.coachDemo;

public interface Coach {

	public String getDailyWorkout();

	public String getDailyFortune();

	public PracticeDrillService getBaseballDrills();

	public void setEmailAddress(String emailAddress);

	public void setTeamName(String teamName);
	
}
