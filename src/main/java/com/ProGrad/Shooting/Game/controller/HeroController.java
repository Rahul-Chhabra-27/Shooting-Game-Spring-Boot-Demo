package com.ProGrad.Shooting.Game.controller;

import com.ProGrad.Shooting.Game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {
    @Autowired
    private GameService heroService;

    @GetMapping("/hero-health")
    public int getHeroHealth(){
        return heroService.getHealth();
    }
    @PostMapping ("/reduce-hero-health-by-gun-1")
    public void reduceHeroHealthByGunOne() { heroService.reduceHealthByGunOne(); }
    @PostMapping ("/reduce-hero-health-by-gun-2")
    public void reduceHeroHealthByGunTwo() { heroService.reduceHealthByGunTwo(); }
    @PostMapping ("/reduce-hero-health-by-gun-3")
    public void reduceHeroHealthByGunThree() {
        heroService.reduceHealthByGunThree();
    }
}

