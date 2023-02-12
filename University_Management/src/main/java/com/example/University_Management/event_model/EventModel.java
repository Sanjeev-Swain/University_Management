package com.example.University_Management.event_model;

public class EventModel
{
    private int id;
    private String event_name;
    private String location;
    private int date;
    private int start;
    private int end;
    private String url;

    public EventModel()
    {

    }

    public EventModel(int id, String event_name, String location, int date, int start, int end, String url) {
        this.id = id;
        this.event_name = event_name;
        this.location = location;
        this.date = date;
        this.start = start;
        this.end = end;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "EventModel{" +
                "id=" + id +
                ", event_name='" + event_name + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", start=" + start +
                ", end=" + end +
                ", url='" + url + '\'' +
                '}';
    }
}
