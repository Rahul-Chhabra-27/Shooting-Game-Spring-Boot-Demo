package com.ProGrad.Shooting.Game.service;

import org.springframework.stereotype.Service;

@Service
public class VillainService {
    private int villainHealth = 100;
    private boolean isShieldEnabled = false;
    public int getVillainHealth() {
        return  this.villainHealth;
    }

    public void reduceVillainHealthByGunOne() {
        int potentialLossInPowerOfVillain = 8 - (this.isShieldEnabled ? 4 : 0);
        if(this.villainHealth <= potentialLossInPowerOfVillain) {
            this.villainHealth = 100;
        }
        else {
            this.villainHealth -= potentialLossInPowerOfVillain;
        }
    }
    public void reduceVillainHealthByGunTwo() {
        int potentialLossInPowerOfVillain = 16 - (this.isShieldEnabled ? 4 : 0);
        if(this.villainHealth <= potentialLossInPowerOfVillain) {
            this.villainHealth = 100;
        }
        else {
            this.villainHealth -= potentialLossInPowerOfVillain;
        }
    }

    public void reduceVillainHealthByGunThree() {
        int potentialLossInPowerOfVillain = 32 - ((this.isShieldEnabled) ? 4 : 0);
        if(this.villainHealth <= potentialLossInPowerOfVillain) {
            this.villainHealth = 100;
        }
        else {
            this.villainHealth -= potentialLossInPowerOfVillain;
        }
    }

    public void enableVillainShield() {
        this.isShieldEnabled = true;
    }
}
