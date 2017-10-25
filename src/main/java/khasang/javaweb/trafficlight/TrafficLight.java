package khasang.javaweb.trafficlight;

/**
 * Светофор.
 */
public class TrafficLight {
    private static final int MILLISECONDS_PER_MINUTE = 60000;

    private LightDuration[] sequence;

    /**
     * Устанавливает последовательность влючения цветов.
     * @param sequence массив продолжительностей для каждого цвета
     */
    public void setLightSequence(LightDuration ... sequence) {
        this.sequence = sequence;
    }

    /**
     * Запускает последовательность смены цветов.
     * Перед включением последовательность должна быть установлена
     * с помощью метода <code>setLightSequence()</code>.
     */
    public void turnOn() {
        if (sequence == null) {
            throw new IllegalStateException("Не установлена последовательность включений");
        }
        for (LightDuration lightDuration : sequence) {
            System.out.println(lightDuration.getLightColor());
            pauseMinutes(lightDuration.getMinutes());
        }
    }

    private void pauseMinutes(int minutes) {
        try {
            Thread.sleep(minutes * MILLISECONDS_PER_MINUTE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
