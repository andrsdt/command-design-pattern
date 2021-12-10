package command.receiver.invoker;

import command.receiver.Car;
import command.receiver.RotatingTop;
import command.receiver.commandobjects.CarMoveCommand;
import command.receiver.commandobjects.CarStopCommand;
import command.receiver.commandobjects.CommandBase;
import command.receiver.commandobjects.TopRotateCommand;
import command.receiver.commandobjects.TopStopRotateCommand;

public class RemoteControlTest {
    public void testRemoteControlButtonPressed() throws Exception {
        RemoteControl remoteControl = new RemoteControl();
        RotatingTop top = new RotatingTop();
        Car car = new Car();

        System.out.println("-----Testing onButtonPressed on RemoteControl for Car-----");
        CommandBase carMoveCommand = new CarMoveCommand(car);
        remoteControl.onButtonPressed(carMoveCommand);

        System.out.println("-----Testing offButtonPressed on RemoteControl for Car-----");
        CommandBase carStopCommand = new CarStopCommand(car);
        remoteControl.offButtonPressed(carStopCommand);

        System.out.println("-----Testing undoButtonPressed() on RemoteControl for Car-----");
        remoteControl.undoButtonPressed();

        System.out.println("-----Testing onButtonPressed on RemoteControl for RotatingTop-----");
        CommandBase topRotateCommand = new TopRotateCommand(top);
        remoteControl.onButtonPressed(topRotateCommand);

        System.out.println("-----Testing offButtonPressed on RemoteControl for RotatingTop-----");
        CommandBase topStopRotateCommand = new TopStopRotateCommand(top);
        remoteControl.offButtonPressed(topStopRotateCommand);

        System.out.println("-----Testing undoButtonPressed on RemoteControl for RotatingTop-----");
        remoteControl.undoButtonPressed();
    }

    public static void main(String[] args) {
        RemoteControlTest test = new RemoteControlTest();
        try {
            test.testRemoteControlButtonPressed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}