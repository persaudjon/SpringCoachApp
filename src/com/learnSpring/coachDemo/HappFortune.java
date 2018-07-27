package com.learnSpring.coachDemo;

public class HappFortune implements FortuneService {
    @Override
    public String getFortune(){
        return "New Adventures are on the Horizon";
    }
}
