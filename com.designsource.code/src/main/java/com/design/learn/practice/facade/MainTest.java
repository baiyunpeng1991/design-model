package com.design.learn.practice.facade;

public class MainTest {
    public static void main(String[] args) {
        MovieFacade movieFacade = new MovieFacade(new DVDPlayerA(),new CDPlayerA(),new ScreenA(),new ProjectorA());
        movieFacade.openMovie();
    }
}
