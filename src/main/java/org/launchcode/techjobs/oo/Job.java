package org.launchcode.techjobs.oo;

import javax.swing.text.Position;
import java.lang.reflect.Field;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;

    }

    public Job(String name, Employer employer, Location location,
                      PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType ;
        this.coreCompetency = coreCompetency;
    }

    public Job(int i) {

    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() { if (name == null || name.isEmpty()) {
        return "Data not available";
    }
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    @Override
    public String toString() {
        if (name.equals("")) {
            name = "Data not available";
        }
        if (employer.getValue().equals("") || employer.getValue() == null) {
            employer.setValue("Data not available");
        }
        if (location.getValue().equals("") || location.getValue() == null) {
            location.setValue("Data not available");
        }
        if (positionType.getValue().equals("") || positionType.getValue() == null) {
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue().equals("") || coreCompetency.getValue() == null) {
            coreCompetency.setValue("Data not available");
        }

        return  "\nID: " + id +
                "\nName: " + name +
                "\nEmployer: " + employer.getValue() +
                "\nLocation: " + location.getValue() +
                "\nPosition Type: " + positionType.getValue() +
                "\nCore Competency: " + coreCompetency.getValue() +
                "\n";

    }

}

