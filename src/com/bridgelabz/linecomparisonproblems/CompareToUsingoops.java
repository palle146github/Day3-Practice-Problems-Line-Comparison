package com.bridgelabz.linecomparisonproblems;

public class CompareToUsingoops {
    private double x1, y1, x2, y2;

    public CompareToUsingoops() {

    }

    public CompareToUsingoops(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double lengthOftheLine() {
        double lengthoftheline = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return lengthoftheline;
    }

    static void compareTo(Double lengthoftheline1, Double lengthoftheline2) {
        if (lengthoftheline1.compareTo(lengthoftheline2) == 1) {
            double difference = (Double.valueOf(lengthoftheline1)) - (Double.valueOf(lengthoftheline2));
            System.out.println("Line 1 is longer than line 2 by " + difference);
        } else if (lengthoftheline1.compareTo(lengthoftheline2) == 0) {
            System.out.println("Both lines are equal");
        } else {
            double difference = (Double.valueOf(lengthoftheline2)) - (Double.valueOf(lengthoftheline1));
            System.out.println("Line 2 is longer than line 1 by " + difference);
        }
    }

    public static void main(String[] args) {
        CompareToUsingoops length1 = new CompareToUsingoops(5, 7, 3, 9);
        Double lengthOfLine1 = length1.lengthOftheLine();
        CompareToUsingoops length2 = new CompareToUsingoops(6, 3, 3, 8);
        Double lengthOfLine2 = length2.lengthOftheLine();
        compareTo(lengthOfLine1, lengthOfLine2);
    }
}


