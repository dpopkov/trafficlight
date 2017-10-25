package khasang.javaweb.trafficlight;

/**
 * Цвет светофора.
 */
public enum LightColor {
    GREEN("Зеленый"),
    YELLOW("Желтый"),
    RED("Красный");

    private String name;

    LightColor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
