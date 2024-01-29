package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    @Before
    public void sampleJobObjects() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
    }

    @Test
    public void testSettingJobId() {
    Job testJob1 = new Job();
    Job testJob2 = new Job();

   assertFalse(testJob1.equals(testJob2));
   assertTrue((testJob2.getId()-1) == testJob1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertTrue(testJob3.getName() == "Product tester");
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(testJob3.getName(),"Product tester");
        assertEquals(testJob3.getEmployer().getValue(), "ACME");
        assertEquals(testJob3.getLocation().getValue(),"Desert");
        assertEquals(testJob3.getPositionType().getValue(),"Quality control");
        assertEquals(testJob3.getCoreCompetency().getValue(), "Persistence");


    }

    @Test
    public void testJobsForEquality() {
        Job testJob4 = new Job ("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job testJob5 = new Job ("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(testJob4.equals(testJob5));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        int newLine = (testJob3.toString().length() - 1);
        assertTrue(testJob3.toString().charAt(0) == '\n');
        assertTrue(testJob3.toString().charAt(newLine) == '\n');



    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals("Product tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer().getValue());
        assertEquals("Desert", testJob3.getLocation().getValue());
        assertEquals("Quality control", testJob3.getPositionType().getValue());
        assertEquals("Persistence", testJob3.getCoreCompetency().getValue());
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("Product tester",
                new Employer(""),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency(""));





    }
}
