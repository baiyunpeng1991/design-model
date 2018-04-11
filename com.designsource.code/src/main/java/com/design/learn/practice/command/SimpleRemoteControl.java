package com.design.learn.practice.command;

/**
 * 调用者只关心command
 */
public class SimpleRemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
