package main;

import java.util.HashMap;

public class Class {

    private static final HashMap<String, Double> gradeToGradePointPerUnit = new HashMap<>();

    static
    {
        gradeToGradePointPerUnit.put("A+", 4.0);
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
