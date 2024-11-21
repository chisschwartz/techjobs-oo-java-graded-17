package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    public Job() {
        id = nextId;
        nextId++;
    }

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(String name, Employer employer, Location location,
               PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name);
//                && Objects.equals(employer, job.employer)
//                && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType)
//                && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
//                employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String toString() {

        String jobName = getName();
        Employer jobEmployer = getEmployer();
        Location jobLocation = getLocation();
        PositionType jobPositionType = getPositionType();
        CoreCompetency jobCoreCompetency = getCoreCompetency();

        for (int i = 5; i >= 0; i -= 1) {

            if (getName() == "") {
                name = "Data not available";

            } else if (getEmployer().getValue() == "") {
                jobEmployer.setValue("Data not available");

            } else if (getLocation().getValue() == "") {
                jobLocation.setValue("Data not available");

            } else if (getPositionType().getValue() == "") {
                jobPositionType.setValue("Data not available");

            } else if (getCoreCompetency().getValue() == "") {
                jobCoreCompetency.setValue("Data not available");
            }
//            return System.lineSeparator() +
//                    "ID: " + getId() + System.lineSeparator() +
//                    "Name: " + name + System.lineSeparator() +
//                    "Employer: " + jobEmployer + System.lineSeparator() +
//                    "Location: " + jobLocation + System.lineSeparator() +
//                    "Position Type: " + jobPositionType + System.lineSeparator() +
//                    "Core Competency: " + jobCoreCompetency +
//                    System.lineSeparator();
        }
        return System.lineSeparator() +
                "ID: " + getId() + System.lineSeparator() +
                "Name: " + name + System.lineSeparator() +
                "Employer: " + jobEmployer + System.lineSeparator() +
                "Location: " + jobLocation + System.lineSeparator() +
                "Position Type: " + jobPositionType + System.lineSeparator() +
                "Core Competency: " + jobCoreCompetency +
                System.lineSeparator();
    }
}
