package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class gpaCalculatorTest {

    @Test
    public void ZeroClassesShouldBeA0Point0GPA() {
        Class[] myClasses = new Class[] {};
        gpaCalculator myCalc = new gpaCalculator(myClasses);
        assertEquals(0.0, myCalc.calculateGPA(0), .01);
    }

    @Test
    public void OneAPlusClassShouldBeA4Point0GPA() {
        Class Chemistry = new Class(4, "A+");
        Class[] myClasses = new Class[] {Chemistry};
        gpaCalculator myCalc = new gpaCalculator(myClasses);
        assertEquals(4.0, myCalc.calculateGPA(4), .01);
    }

}