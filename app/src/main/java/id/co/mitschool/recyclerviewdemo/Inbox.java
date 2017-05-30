package id.co.mitschool.recyclerviewdemo;

/**
 * Created by kakaroto on 30/05/17.
 */

public class Inbox {
    private String name;
    private String message;
    private String time;

    public Inbox(String name, String message, String time) {
        this.name = name;
        this.message = message;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Inbox{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
