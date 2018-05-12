package BusinessLayer;

public class EventModel {

    private int id;
    private String name;
    private String time;
    private String note;
    
    public EventModel(String name, String eventTime, String note) {
        this.name = name;
        this.time = eventTime;
        this.note = note;
    }

	    public int getId() {
        return id;
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
