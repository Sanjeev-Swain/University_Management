package com.example.University_Management.event_cotroller;

import com.example.University_Management.event_model.EventModel;
import com.example.University_Management.event_service.EventService;
import com.example.University_Management.student_model.StudentModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/events")
public class EventController {

    private final EventService eventService;


    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/find-all-events")
    public List<EventModel> findAllEvents()
    {
        return eventService.findALlEvents();
    }
    @GetMapping("/find-events/date/{date}")
    public EventModel findEventById(@PathVariable int date)
    {
        return eventService.findEventById(date);
    }
    @PostMapping("/add-students")
    public void addEvents(@RequestBody EventModel eventmodel)
    {
        eventService.addEvents(eventmodel);
    }
    @DeleteMapping("/delete-students")
    public void deleteEvents(@PathVariable int id)
    {
        eventService.deleteEvents(id);
    }
    @PutMapping("/update-students/id/{id}")
    public void updateEvents(@PathVariable int id,@RequestBody EventModel eventmodel)
    {
        eventService.updateEvents(id,eventmodel);
    }
}
