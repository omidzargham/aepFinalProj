package main;

import java.util.HashMap;

/** JOB: Understands a single course. **/
public class Class {

    private static final HashMap<String, Double> gradeToGradePointPerUnit = new HashMap<>();

    static
    {
        gradeToGradePointPerUnit.put("A+", 4.0);
        gradeToGradePointPerUnit.put("A", 4.0);
        gradeToGradePointPerUnit.put("A-", 3.7);
        gradeToGradePointPerUnit.put("B+", 3.3);
        gradeToGradePointPerUnit.put("B", 3.0);
        gradeToGradePointPerUnit.put("B-", 2.7);
        gradeToGradePointPerUnit.put("C+", 2.3);
        gradeToGradePointPerUnit.put("C", 2.0);
        gradeToGradePointPerUnit.put("C-", 1.7);
        gradeToGradePointPerUnit.put("D+", 1.3);
        gradeToGradePointPerUnit.put("D", 1.0);
        gradeToGradePointPerUnit.put("D-", 0.7);
        gradeToGradePointPerUnit.put("F", 0.0);
    }

    private double units;
    private String grade;

    public Class(double units, String grade) {
        this.units = units;
        this.grade = grade;
    }


    public double computeGradePoints() {
        return units * gradeToGradePointPerUnit.get(grade);
    }


    public static double calculateGPA(Class[] myClasses) {
        double sumGradePoints = 0.0;
        double currentSemUnits = 0.0;
        for (Class thisClass: myClasses) {
            double thisClassGradePoints = thisClass.computeGradePoints();
            sumGradePoints += thisClassGradePoints;
            currentSemUnits += thisClass.units;
        }
        if (currentSemUnits <= 0) {
            return 0.0;
        }
        else {
            return sumGradePoints / currentSemUnits;
        }
    }

    public static double calculateGPA(double oldGPA, double previousUnits, Class[] myClasses) {
        double totalGradePoints = oldGPA * previousUnits;
        double currentSemUnits = 0.0;
        for (Class thisClass: myClasses) {
            totalGradePoints += thisClass.computeGradePoints();
            currentSemUnits += thisClass.units;
        }
        return totalGradePoints / (previousUnits + currentSemUnits);
    }
}
