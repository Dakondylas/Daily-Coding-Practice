/**
 * Class representing a student record with grades.
 * This class demonstrates basic OOP principles and data encapsulation.
 */
public class Student {
    // TODO: Add private fields for studentId, name, grades array, averageGrade, and letterGrade
    private String studentId;
    private String name;
    private int[] gradesArray;
    private int averageGrade;
    private char letterGrade;

    
    /**
     * Constructor to initialize a Student object
     * @param studentId The student's ID
     * @param name The student's name
     * @param grades Array of the student's grades
     */
    public Student(String studentId, String name, int[] grades) {
        this.studentId = studentId;
        this.name = name;
        this.gradesArray = grades;

        // TODO: Initialize fields and calculate average and letter grade
    }
    
    /**
     * Calculates the average of all grades
     * @return The average grade as a double
     */
    private double calculateAverage() {
        // TODO: Calculate and return the average of all grades
        int average = this.gradesArray[0];
        for (int x = 1; x < 4; x++) {
            average += this.gradesArray[x];
        }
        this.averageGrade = average / 4;
        return this.averageGrade; // Placeholder return
    }
    
    /**
     * Determines the letter grade based on the average
     * @return A character representing the letter grade (A, B, C, D, or F)
     */
    private char determineLetterGrade() {
        // TODO: Return letter grade based on the following scale:
        //       A: 90-100
        //       B: 80-89
        //       C: 70-79
        //       D: 60-69
        //       F: 0-59
        double studentAverage = this.calculateAverage();
        if (studentAverage >= 90) {
            this.letterGrade = 'A';
            return this.letterGrade;
        } else if (studentAverage >= 80) {
            this.letterGrade = 'B';
            return this.letterGrade;
        } else if (studentAverage >= 70) {
            this.letterGrade = 'C';
            return this.letterGrade;
        } else if (studentAverage >= 60) {
            this.letterGrade = 'D';
            return this.letterGrade;
        } else {
            this.letterGrade = 'F';
            return this.letterGrade;
        }
    }
    
    // TODO: Implement getters for all fields

    public String getName() {
        return this.name;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public int[] getGrades() {
        return this.gradesArray;
    }

    public double getAverage() {
        return this.averageGrade;
    }

    public char getLetterGrade() {
        return this.letterGrade;
    }
    // Hint: Follow standard Java naming conventions for getters (getXxx method names)
    
    /**
     * Returns a string representation of the student
     * @return String containing all student information
     */
    @Override
    public String toString() {
        // TODO: Return a string representation of the student including:
        //       - ID, name, all grades, average (formatted to 2 decimal places), and letter grade
        String formattedMessage = ("Student ID: " + this.studentId +
                "\nStudent Name: " + this.name +
                "\nGrades:\n" +
                this.gradesArray[0] + "\n" +
                this.gradesArray[1] + "\n" +
                this.gradesArray[2] + "\n" +
                this.gradesArray[3] + "\n" +
                "Grade Average: " + String.format("%.2f", this.averageGrade) +
                "Letter Grade: " + this.letterGrade);

        // Hint: Use StringBuilder to efficiently build the string as shown in the slides
        // Hint: Use String.format("%.2f", averageGrade) to format the average to 2 decimal places
        return formattedMessage; // Placeholder return
    }

}