package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassTest {

    @Test
    public void APlusGradeAnd1UnitShouldBe4Point0GradePoints() {
        Class myClass = new Class(1, "A+");
        assertEquals(4.0, myClass.computeGradePoints(), .1);
    }

    @Test
    public void BMinusGradeAnd3UnitsShouldBe8Point1GradePoints() {
        Class myClass = new Class(3, "B-");
        assertEquals(8.1, myClass.computeGradePoints(), .1);
    }

}