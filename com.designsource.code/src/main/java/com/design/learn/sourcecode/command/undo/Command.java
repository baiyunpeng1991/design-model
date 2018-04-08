package com.design.learn.sourcecode.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
