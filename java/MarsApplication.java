/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java;

/**
 *
 * @author Windows
 */
public class MarsApplication {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot();
        spirit.status="Exploring";
        spirit.speed=2;
        spirit.temperature=-60;
        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed=3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -90.");
        spirit.temperature=-70;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}
