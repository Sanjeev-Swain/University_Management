package com.example.University_Management.event_service;

import com.example.University_Management.event_model.EventModel;
import com.example.University_Management.student_model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


@Service
public class EventService {

    private static List<EventModel> events = new ArrayList<>();
    private static int event_count=0;

    static
    {
        events.add(new EventModel(++event_count,"Dance","Delhi",21,1,2,"url1"));
        events.add(new EventModel(++event_count,"Sing","Gurgaon",22,2,3,"url2"));
        events.add(new EventModel(++event_count,"Paint","Haryana",23,3,4,"url3"));
        events.add(new EventModel(++event_count,"Sports","Palampur",24,4,5,"url4"));
        events.add(new EventModel(++event_count,"Quiz","Noida",24,5,6,"url5"));

    }

    public List<EventModel> findALlEvents()
    {
        return events;
    }

    public EventModel findEventById(int date)
    {
        Predicate<? super EventModel> predicate = eventmodel -> eventmodel.getDate() == date;
        EventModel eventmodel = events.stream().filter(predicate).findFirst().get();
        return eventmodel;
    }

    public void addEvents(EventModel eventmodel)
    {
        events.add(eventmodel);
    }

    public void deleteEvents(int id)
    {
        Predicate<? super EventModel> predicate = eventmodel -> eventmodel.getId() == id;
        events.removeIf(predicate);
    }

    public void updateEvents(int id,EventModel newEvent)
    {
        EventModel eventmodel = findEventById(id);
        eventmodel.setId(newEvent.getId());
        eventmodel.setEvent_name(newEvent.getEvent_name());
        eventmodel.setLocation(newEvent.getLocation());
        eventmodel.setDate(newEvent.getDate());
        eventmodel.setStart(newEvent.getStart());
        eventmodel.setEnd(newEvent.getEnd());
        eventmodel.setUrl(newEvent.getUrl());

    }
}
