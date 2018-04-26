package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassTest {

    @Test
    public void APlusGradeAnd1UnitShouldBe4Point0GradePoints() {
        Class myClass = new Class(1, "A+");
        assertEquals(4.0, myClass.computeGradePoints(), 0);
    }

}