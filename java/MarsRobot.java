/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java;

/**
 *
 * @author Windows
 */
public class MarsRobot {
    String status;
    int speed;
    float temperature;
    void checkTemperature() {
        if(temperature<-80) {
            status="returning home";
            speed=5;
        }
    }
    void showAttributes() {
    System.out.println("Status: " +status);
    System.out.println("Speed: " +speed);
    System.out.println("Temperature: " +temperature);
    }
}
