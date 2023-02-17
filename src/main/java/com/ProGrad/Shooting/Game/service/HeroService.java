package com.ProGrad.Shooting.Game.service;


import org.springframework.stereotype.Service;

@Service
public class HeroService {
    private int heroHealth = 100;

    public int getHeroHealth() {
        return this.heroHealth;
    }
    
    public void reduceHeroHealthByGunOne() {
        if(this.heroHealth <= 8) {
            this.heroHealth = 100;
        }
        else {
            this.heroHealth -= 8;
        }
    }

    public void reduceHeroHealthByGunTwo() {
        if(this.heroHealth <= 16) {
            this.heroHealth = 100;
        }
        else {
            this.heroHealth -= 16;
        }
    }

    public void reduceHeroHealthByGunThree() {
        if(this.heroHealth <= 32) {
            this.heroHealth = 100;
        }
        else {
            this.heroHealth -= 32;
        }
    }
}
