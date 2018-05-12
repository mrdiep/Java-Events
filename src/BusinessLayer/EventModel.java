package BusinessLayer;

public class EventModel {

    String name;
    String time;
    String note;
    
    public EventModel(String name, String eventTime, String note) {
        this.name = name;
        this.time = eventTime;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getNote() {
        return note;
    }
}
