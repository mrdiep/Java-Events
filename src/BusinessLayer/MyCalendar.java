package BusinessLayer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;


public class MyCalendar {

    ArrayList<EventModel> events = new ArrayList<EventModel>();

    public ArrayList<EventModel> getEvents() {
        return events;
    }
    
    public boolean addEvent(String eventName, String date, String dateFrom, String dateTo, String note) {
        System.out.println(eventName);
        events.add(new EventModel(eventName, date + "  " + dateFrom + "->" + dateTo, note));
        return false;
    }
	
	public boolean removeEvent(int id)
	{
		return false;
	}
    
}
