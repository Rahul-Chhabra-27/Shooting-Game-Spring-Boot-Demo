package com.ProGrad.Shooting.Game.controller;

import com.ProGrad.Shooting.Game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VillainController {

    @Autowired
    private GameService villainService;
    @GetMapping("/villain-health")
    public int getVillainHealth() {
        return villainService.getHealth();
    }
    @PostMapping("/reduce-villain-health-by-gun-1")
    public void reduceVillainHealthByGunOne() {
        villainService.reduceHealthByGunOne();
    }
    @PostMapping ("/reduce-villain-health-by-gun-2")
    public void reduceVillainHealthByGunTwo() {
        villainService.reduceHealthByGunTwo();
    }
    @PostMapping ("/reduce-villain-health-by-gun-3")
    public void reduceVillainHealthByGunThree() {
        villainService.reduceHealthByGunThree();
    }

    @PostMapping("/enable-shield")
    public void enableVillainShield() {
        villainService.enableVillainShield();
    }
}

// Functions that I have to..
// 1. getHeroHealth.
// 2. getVillainHealth.
// 3. ReduceVillainHealthByGunOne
// 4. ReduceVillainHealthByGunTwo.
// 5. ReduceVillainHealthByGunThree.
// 6. ReduceHeroHealthByGunOne
// 7. ReduceHeroHealthByGunTwo.
// 8. ReduceHeroHealthByGunThree.
// 9. Revert the Shield of Villain.

