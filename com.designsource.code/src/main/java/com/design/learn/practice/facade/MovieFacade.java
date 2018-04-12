package com.design.learn.practice.facade;

public class MovieFacade {
    private DVDPlayer dvdPlayer;
    private CDPlayer cdPlayer;
    private Screen screen;
    private Projector projector;
    //多参数使用Builder构建器
    public MovieFacade(DVDPlayer dvdPlayer, CDPlayer cdPlayer, Screen screen, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.screen = screen;
        this.projector = projector;
    }

    public void openMovie(){
        screen.on();
        dvdPlayer.on();
        projector.on();
    }


}
