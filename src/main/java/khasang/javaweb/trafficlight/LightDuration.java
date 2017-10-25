package khasang.javaweb.trafficlight;

/**
 * Представляет продолжительность включения определенного цвета в минутах.
 */
public class LightDuration {
    private LightColor lightColor;
    private int minutes;

    public LightDuration(LightColor lightColor, int minutes) {
        this.lightColor = lightColor;
        this.minutes = minutes;
    }

    public LightColor getLightColor() {
        return lightColor;
    }

    public int getMinutes() {
        return minutes;
    }
}
