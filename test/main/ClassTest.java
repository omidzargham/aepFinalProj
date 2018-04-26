package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassTest {

    @Test
    public void APlusGradeAnd1UnitShouldBe4Point0GradePoints() {
        Class myClass = new Class(1, "A+");
        assertEquals(4.0, myClass.computeGradePoints(), .01);
    }

    @Test
    public void BMinusGradeAnd3UnitsShouldBe8Point1GradePoints() {
        Class myClass = new Class(3, "B-");
        assertEquals(8.1, myClass.computeGradePoints(), .01);
    }

    @Test
    public void FGradeAnd2UnitsShouldBe0Point0GradePoints() {
        Class myClass = new Class(2, "F");
        assertEquals(0.0, myClass.computeGradePoints(), .01);
    }

    @Test
    public void ZeroClassesShouldBeA0Point0GPA() {
        Class[] myClasses = new Class[] {};
        assertEquals(0.0, Class.calculateGPA(myClasses), .01);
    }

    @Test
    public void OneAPlusClassShouldBeA4Point0GPA() {
        Class Chemistry = new Class(4, "A+");
        Class[] myClasses = new Class[] {Chemistry};
        assertEquals(4.0, Class.calculateGPA(myClasses), .01);
    }

    @Test
    public void APlusClassAndCClassShouldBeA3Point0GPA() {
        Class Chemistry = new Class(4, "A+");
        Class Math = new Class(4, "C");
        Class[] myClasses = new Class[] {Chemistry, Math};
        assertEquals(3.0, Class.calculateGPA(myClasses), .01);
    }

    @Test
    public void Previous4Point0GPAWithNoNewClassesShouldStay4Point0() {
        Class[] myClasses = new Class[] {};
        assertEquals(4.00, Class.calculateGPA(4.00, 40, myClasses),.01);
    }

    @Test
    public void Previous3Point5GPAWith4UnitClassWithGradeBShouldBe3Point39() {
        Class Chemistry = new Class(4, "B");
        Class[] myClasses = new Class[] {Chemistry};
        assertEquals(3.39, Class.calculateGPA(3.50, 15, myClasses),.01);
    }

    @Test
    public void WillNeedA4PointAvg0With8UnitsThisSemToRaiseCumGPATo3Point8() {
        double currentUnits = 8.0;
        assertEquals(4.00, Class.calculateNecessaryGPA(3.7, 16, 3.8, currentUnits),.01);
    }

    @Test
    public void WillNeedA3Point71Avg0With16UnitsThisSemToRaiseCumGPATo3Point5() {
        double currentUnits = 16.0;
        assertEquals(3.71, Class.calculateNecessaryGPA(3.4, 35, 3.5, currentUnits),.01);
    }

}