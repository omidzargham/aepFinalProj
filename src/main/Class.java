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
}
