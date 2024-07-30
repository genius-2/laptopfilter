package laptopfilter;

public class laptop {
    String model;
    int memory_value;
    String os;
    String color;
    int screen_res;

    @Override
    public String toString() {
        return String.format(
                "laptop name: %s; momory value: %d; operation system: %s; color: %s; screen resolution: %d", model,
                memory_value, os, color, screen_res);
    }
}
