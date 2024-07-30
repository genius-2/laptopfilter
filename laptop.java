package laptopfilter;

public class laptop {
    String model;
    int memory_value;
    String os;
    String color;
    int screen_res;

    public laptop(String Model, int Memory, String Os, String Color, int Screen){
        this.model = Model;
        this.memory_value = Memory;
        this.os = Os;
        this.color = Color;
        this.screen_res = Screen;
    }

    public String get_model(){
        return model;
    }
    public int get_memory_value(){
        return memory_value;
    }
    public String get_os(){
        return os;
    }
    public String get_color(){
        return color;
    }
    public int get_screen_res(){
        return screen_res;
    }

    @Override
    public String toString() {
        return String.format(
                "laptop name: %s; memory value: %d; operation system: %s; color: %s; screen resolution: %d", model,
                memory_value, os, color, screen_res);
    }
}
