package main;

/** JOB: Understands how to compute a GPA. **/
public class gpaCalculator {

    private final Class[] myClasses;

    public gpaCalculator(Class[] myClasses) {
        this.myClasses = myClasses;
    }

    public double calculateGPA(double totalUnits) {
        double sumGradePoints = 0.0;
        for (Class thisClass: myClasses) {
            double thisClassGradePoints = thisClass.computeGradePoints();
            sumGradePoints += thisClassGradePoints;
        }
        if (totalUnits <= 0) {
            return 0.0;
        }
        else {
            return sumGradePoints / totalUnits;
        }
    }
}
