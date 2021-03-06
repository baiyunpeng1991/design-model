package com.design.learn.practice.command.easy;

public class DoorOpenCommand implements Command {

    private Door door;

    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
