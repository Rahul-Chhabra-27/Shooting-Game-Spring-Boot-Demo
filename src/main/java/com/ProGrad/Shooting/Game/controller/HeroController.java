package com.ProGrad.Shooting.Game.controller;

import com.ProGrad.Shooting.Game.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {
    @Autowired
    private HeroService heroService;

    @GetMapping("/hero-health")
    public int getHeroHealth(){
        return heroService.getHeroHealth();
    }
    @PostMapping ("/reduce-hero-health-by-gun-1")
    public void reduceHeroHealthByGunOne() {
        heroService.reduceHeroHealthByGunOne();
    }
    @PostMapping ("/reduce-hero-health-by-gun-2")
    public void reduceHeroHealthByGunTwo() {
        heroService.reduceHeroHealthByGunTwo();
    }
    @PostMapping ("/reduce-hero-health-by-gun-3")
    public void reduceHeroHealthByGunThree() {
        heroService.reduceHeroHealthByGunThree();
    }
}

