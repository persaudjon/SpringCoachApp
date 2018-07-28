package com.learnSpring.coachDemo;

public class BaseballCoach implements Coach {

	FortuneService fortune;
	PracticeDrillService baseballDrills;



    public BaseballCoach(FortuneService fortune){
		this.fortune=fortune;
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








