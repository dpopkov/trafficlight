package khasang.javaweb.trafficlight;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LightDuration green = enterDuration(LightColor.GREEN);
        LightDuration yellow = enterDuration(LightColor.YELLOW);
        LightDuration red = enterDuration(LightColor.RED);
        System.out.println();

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setLightSequence(green, yellow, red);
        trafficLight.turnOn();
    }

    private static LightDuration enterDuration(LightColor lightColor) {
        System.out.print("Введите длительность в минутах для цвета " + lightColor + ": ");
        int duration = scanner.nextInt();
        LightDuration lightDuration = new LightDuration(lightColor, duration);
        return lightDuration;
    }
}
