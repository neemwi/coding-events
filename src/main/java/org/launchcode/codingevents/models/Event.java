package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;


public class Event {

    private int id;
    private static int nextId = 1;
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    @NotBlank(message = "Event Name is Required")
    private String name;

    @Size(max = 500, message = "Description too long")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email, try again")
    private String contactEmail;

    @NotBlank(message = "Location is required")
    @Size(max = 200, message="Location too long")
    private String location;

    @AssertTrue
    private Boolean mustRegister = true;

    @Positive
    private int numOfAttendees;



    public Event(String name, String description, String contactEmail, String location, Boolean mustRegister) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.mustRegister = mustRegister;


    }

    public Event() {
        this.id = nextId;
        nextId++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
