package com.ProGrad.Shooting.Game.controller;

import com.ProGrad.Shooting.Game.service.VillainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VillainController {

    @Autowired
    private VillainService villainService;
    @GetMapping("/villain-health")
    public int getVillainHealth() {
        return villainService.getVillainHealth();
    }
    @PostMapping("/reduce-villain-health-by-gun-1")
    public void reduceVillainHealthByGunOne() {
        villainService.reduceVillainHealthByGunOne();
    }
    @PostMapping ("/reduce-villain-health-by-gun-2")
    public void reduceVillainHealthByGunTwo() {
        villainService.reduceVillainHealthByGunTwo();
    }
    @PostMapping ("/reduce-villain-health-by-gun-3")
    public void reduceVillainHealthByGunThree() {
        villainService.reduceVillainHealthByGunThree();
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

