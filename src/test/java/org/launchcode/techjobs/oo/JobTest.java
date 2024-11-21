package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job constructorJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
//       Employer acme = new Employer("ACME");

        assertEquals(constructorJob.getName(), "Product tester");
        //assertEquals(constructorJob.getEmployer(), constructorJob.setEmployer(Employer "ACME"));
        assertEquals(constructorJob.getEmployer().getValue(), "ACME");
        assertEquals(constructorJob.getLocation().getValue(), "Desert");
        assertEquals(constructorJob.getPositionType().getValue(), "Quality control");
        assertEquals(constructorJob.getCoreCompetency().getValue(), "Persistence");

        assertTrue(constructorJob.getName() instanceof String);
        assertTrue(constructorJob.getEmployer() instanceof Employer);
        assertTrue(constructorJob.getLocation() instanceof Location);
        assertTrue(constructorJob.getPositionType() instanceof PositionType);
        assertTrue(constructorJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job jobFirstId = new Job("Product Designer", new Employer("Intel"), new Location("Taiwan"),
                new PositionType("Coder"), new CoreCompetency("Team Player"));

        Job jobSecondId = new Job("Product Designer", new Employer("Intel"), new Location("Taiwan"),
                new PositionType("Coder"), new CoreCompetency("Team Player"));

        assertNotEquals(jobFirstId, jobSecondId);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobToString = new Job("Product ReDesigner", new Employer("AMD"), new Location("South Korea"),
                new PositionType("Software Engineer"), new CoreCompetency("Java"));
        String format = new String(System.lineSeparator() +
                "ID: " + jobToString.getId() + System.lineSeparator() +
                "Name: " + jobToString.getName() + System.lineSeparator() +
                "Employer: " + jobToString.getEmployer() + System.lineSeparator() +
                "Location: " + jobToString.getLocation() + System.lineSeparator() +
                "Position Type: " + jobToString.getPositionType() + System.lineSeparator() +
                "Core Competency: " + jobToString.getCoreCompetency() +
                System.lineSeparator());

        assertEquals(jobToString.toString().startsWith(System.lineSeparator()) , format.startsWith(System.lineSeparator()));
        assertEquals(jobToString.toString().endsWith(System.lineSeparator()) , format.endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job jobToString = new Job("Product ReDesigner", new Employer("AMD"), new Location("South Korea"),
                new PositionType("Software Engineer"), new CoreCompetency("Java"));

        String format = new String(System.lineSeparator() +
                "ID: " + jobToString.getId() + System.lineSeparator() +
                "Name: " + jobToString.getName() + System.lineSeparator() +
                "Employer: " + jobToString.getEmployer() + System.lineSeparator() +
                "Location: " + jobToString.getLocation() + System.lineSeparator() +
                "Position Type: " + jobToString.getPositionType() + System.lineSeparator() +
                "Core Competency: " + jobToString.getCoreCompetency() +
                System.lineSeparator());

        assertEquals(jobToString.toString() , format);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job jobToString = new Job("Product ReDesigner", new Employer(""), new Location("South Korea"),
                new PositionType("Software Engineer"), new CoreCompetency("Java"));

        String format = new String(System.lineSeparator() +
                "ID: " + jobToString.getId() + System.lineSeparator() +
                "Name: " + jobToString.getName() + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: " + jobToString.getLocation() + System.lineSeparator() +
                "Position Type: " + jobToString.getPositionType() + System.lineSeparator() +
                "Core Competency: " + jobToString.getCoreCompetency() +
                System.lineSeparator());

        assertEquals(jobToString.toString() , format);
    }

}
