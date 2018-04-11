package com.design.learn.practice.command.easy;

import java.util.stream.Stream;

public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        Stream.of(commands).forEach(c->c.execute());
    }
}
