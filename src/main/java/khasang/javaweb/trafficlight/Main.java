package khasang.javaweb.trafficlight;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LightDuration green = enterDurationFor(LightColor.GREEN);
        LightDuration yellow = enterDurationFor(LightColor.YELLOW);
        LightDuration red = enterDurationFor(LightColor.RED);
        System.out.print("Введите количество циклов: ");
        int cycles = scanner.nextInt();
        System.out.println();

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setLightSequence(green, yellow, red);
        trafficLight.start(cycles);
    }

    private static LightDuration enterDurationFor(LightColor lightColor) {
        System.out.print("Введите длительность в минутах для цвета " + lightColor + ": ");
        int duration = scanner.nextInt();
        LightDuration lightDuration = new LightDuration(lightColor, duration);
        return lightDuration;
    }
}
