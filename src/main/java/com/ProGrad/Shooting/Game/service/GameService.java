package com.ProGrad.Shooting.Game.service;

import org.springframework.stereotype.Service;

@Service
public class GameService {
    private int health = 100;
    private boolean isShieldEnabled = false;
    public int getHealth() {
        return  this.health;
    }

    public void reduceHealthByGunOne() {
        int potentialLossInPower = 8 - (this.isShieldEnabled ? 4 : 0);
        if(this.health <= potentialLossInPower) {
            this.health = 100;
        }
        else {
            this.health -= potentialLossInPower;
        }
    }
    public void reduceHealthByGunTwo() {
        int potentialLossInPower = 16 - (this.isShieldEnabled ? 4 : 0);
        if(this.health <= potentialLossInPower) {
            this.health = 100;
        }
        else {
            this.health -= potentialLossInPower;
        }
    }

    public void reduceHealthByGunThree() {
        int potentialLossInPower = 32 - ((this.isShieldEnabled) ? 4 : 0);
        if(this.health <= potentialLossInPower) {
            this.health = 100;
        }
        else {
            this.health -= potentialLossInPower;
        }
    }

    public void enableVillainShield() {
        this.isShieldEnabled = true;
    }
}
