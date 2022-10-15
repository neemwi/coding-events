package org.launchcode.codingevents.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
public class Event extends AbstractEntity {

    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    @NotBlank(message = "Event Name is Required")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private EventDetails eventDetails;

    @NotBlank(message = "Location is required")
    @Size(max = 200, message="Location too long")
    private String location;

    @AssertTrue
    private Boolean mustRegister = true;

    @Positive
    private int numOfAttendees;

    @ManyToOne
    @NotNull(message = "Category is required")
    private EventCategory eventCategory;



    public Event(String name, String location, Boolean mustRegister, EventCategory eventCategory) {
        this.name = name;
        this.eventCategory= eventCategory;
        this.location = location;
        this.mustRegister = mustRegister;


    }

    public Event() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getMustRegister() {
        return mustRegister;
    }

    public void setMustRegister(Boolean mustRegister) {
        this.mustRegister = mustRegister;
    }

    public int getNumOfAttendees() {
        return numOfAttendees;
    }

    public void setNumOfAttendees(int numOfAttendees) {
        this.numOfAttendees = numOfAttendees;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    @Override
    public String toString() {
        return name;
    }


}
