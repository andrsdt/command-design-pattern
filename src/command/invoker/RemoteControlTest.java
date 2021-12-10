package command.invoker;

import command.commandobjects.CarMoveCommand;
import command.commandobjects.CarStopCommand;
import command.commandobjects.CommandBase;
import command.commandobjects.TopRotateCommand;
import command.commandobjects.TopStopRotateCommand;
import command.receiver.Car;
import command.receiver.RotatingTop;

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