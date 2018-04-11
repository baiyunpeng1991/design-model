package com.design.learn.practice.command;

public class MainTest {
    public static void main(String[] args) {
        //创建调用者
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        //创建要被执行的命令，并持有执行者引用
        LightOnCommand lightOnCommand = new LightOnCommand();
        lightOnCommand.setLight(new YellowLight());
        //设置命令，可以随时改变命令
        simpleRemoteControl.setCommand(lightOnCommand);
        //通知命令执行
        simpleRemoteControl.buttonWasPressed();

        //动态改变执行者行为
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand();
        doorOpenCommand.setDoor(new IronDoor());
        simpleRemoteControl.setCommand(doorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
//调用者持有命令引用
//命令持有执行者引用
//通过命令使调用者和执行者解耦