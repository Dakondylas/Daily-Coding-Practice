import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Main class that manages student records.
 * This class demonstrates file I/O and exception handling in Java.
 * 
 * The StudentRecordsManager handles:
 * - Reading student data from CSV files
 * - Processing and validating the data
 * - Calculating statistics
 * - Writing formatted results to output files
 * - Proper exception handling throughout the process
 */
public class StudentRecordsManager {
    
    /**
     * Main method to run the program.
     * Handles user input and delegates processing to other methods.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        StudentRecordsManager manager = new StudentRecordsManager();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter input filename: ");
        String inputFile = scanner.nextLine();
        
        System.out.print("Enter output filename: ");
        String outputFile = scanner.nextLine();
        
        try {
            /**
             * TODO: Call the processStudentRecords method with appropriate parameters
             * 
             * This should pass the inputFile and outputFile variables to the method
             */

            new StudentRecordsManager().processStudentRecords(inputFile, outputFile);

        } catch (Exception e) {
            /**
             * TODO: Handle general exceptions
             * 
             * - Display a user-friendly error message
             * - Include the exception's message for debugging purposes
             * - Consider using System.err instead of System.out for error messages
             */

            System.err.println("Input Error: " + e.getMessage() + "\n Line 40");

        } finally {
            /**
             * The scanner is closed in the finally block to ensure resources are
             * properly released regardless of whether an exception occurred.
             * This demonstrates proper resource management.
             */
            scanner.close();
        }
    }
    
    /**
     * Process student records from an input file and write results to an output file.
     * This method orchestrates the entire data processing workflow.
     * 
     * @param inputFile Path to the input file containing student records
     * @param outputFile Path to the output file where results will be written
     */
    public void processStudentRecords(String inputFile, String outputFile) {
        try {
            /**
             * TODO: Call readStudentRecords and writeResultsToFile methods
             * 
             * 1. Call readStudentRecords to get a list of Student objects
             * 2. Call writeResultsToFile to output the processed data
             * 3. Print a success message to the console
             */

            List<Student> studentsList = readStudentRecords(inputFile);
            writeResultsToFile(studentsList, outputFile);

            System.out.println("\nData Processed\n");

        } catch (FileNotFoundException e) {
            /**
             * TODO: Handle file not found exception
             * 
             * Provide a clear message indicating which file couldn't be found
             * and possibly suggest solutions (check spelling, path, etc.)
             */

            System.err.println(e.getMessage() + "\nFile: " + inputFile + " or " + outputFile + " Not Found");

        } catch (IOException e) {
            /**
             * TODO: Handle general I/O exceptions
             * 
             * These could be permission issues, disk full, etc.
             * Provide helpful information about the nature of the I/O problem.
             */

            System.err.println(e.getMessage() + "\nInput/Output error. Could be permission issues, disk full, etc.");

        }
    }
    
    /**
     * Read student records from a file and convert them to Student objects.
     * This method demonstrates file reading operations and exception handling.
     * 
     * @param filename Path to the input file
     * @return List of Student objects created from the file data
     * @throws IOException If an I/O error occurs during file reading
     */
    public List<Student> readStudentRecords(String filename) throws IOException {
        List<Student> students = new ArrayList<>();
        /**
         * TODO: Implement using try-with-resources to read the file
         * 
         * 1. Create a BufferedReader wrapped around a FileReader
         * 2. Read each line of the file
         * 3. For each line, parse the student data:
         *    - Split the line by commas
         *    - Extract studentId (parts[0]) and name (parts[1])
         *    - Parse the four grade values (parts[2] through parts[5])
         * 4. Create a Student object with the parsed data
         * 5. Add the Student object to the students list
         * 
         * Remember to handle these specific exceptions:
         * - NumberFormatException: When a grade cannot be parsed as an integer
         * - InvalidGradeException: When a grade is outside the valid range (0-100)
         * - ArrayIndexOutOfBoundsException: When a line has too few fields
         * 
         * For each exception, provide clear error messages that include the line number
         * where the error occurred for easier debugging.
         */

        try {
            System.out.println("1");
            String[] splitData = new String[5];
            int[] tempGrades = new int[4];
            File studentObj = new File(filename);
            Scanner studentReader = new Scanner(studentObj);
            while (studentReader.hasNextLine()) {
                String studentdata = studentReader.nextLine();

                splitData = studentdata.split(",");
                tempGrades[0] = Integer.parseInt(splitData[2]);
                tempGrades[1] = Integer.parseInt(splitData[3]);
                tempGrades[2] = Integer.parseInt(splitData[4]);
                tempGrades[3] = Integer.parseInt(splitData[5]);
                for (int x = 0; x < tempGrades.length; x++) {
                    System.out.println(x);
                    if (0 > tempGrades[x] || tempGrades[x] > 100) {
                        System.out.println(x);
                        InvalidGradeException invalidGradeException = new InvalidGradeException("ERROR: LINE 155\nGRADE OUT OF RANGE (0-100)");
                        throw invalidGradeException;
                    }
                }
                Student studentData = new Student(splitData[0], splitData[1], tempGrades);
                students.add(studentData);
            }
            studentReader.close();
        } catch(NumberFormatException e) {
            System.err.println(e.getMessage() + "\nGrade cannot be parsed as an int");
        } catch(InvalidGradeException e) {
            System.err.println(e.getMessage() + "\nOne or more of the grades were out of the allowed grade range (0-100)");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage() + "\nTried to access a list index that did not exist");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage() + "\nThe file: " + filename + " was not found");
        }
        System.out.println("2");
        return students;
    }
    
    /**
     * Write processed student results to an output file.
     * This method demonstrates file writing operations.
     * 
     * @param students List of Student objects to be written to the file
     * @param filename Path to the output file
     * @throws IOException If an I/O error occurs during file writing
     */
    public void writeResultsToFile(List<Student> students, String filename) throws IOException {
        System.out.println("3");
        /**
         * TODO: Implement using try-with-resources to write to the file
         * 
         * 1. Create a PrintWriter wrapped around a FileWriter
         * 2. Write a header section with title and separator
         * 3. Write each student's information
         * 4. Calculate and write class statistics:
         *    - Total number of students
         *    - Class average grade
         *    - Distribution of letter grades (how many A's, B's, etc.)
         * 
         * For calculating statistics:
         * 1. Initialize counters for each letter grade (A, B, C, D, F)
         * 2. Initialize a sum for calculating the average
         * 3. Loop through all students, incrementing counters and adding to sum
         * 4. Calculate the class average and format it to 2 decimal places
         * 5. Write all statistics to the file
         * 
         * Consider using a StringBuilder for building complex strings
         * before writing them to the file.
         */
        FileWriter fileName = new FileWriter(filename);
        java.io.PrintWriter printWriter = new java.io.PrintWriter(fileName);
        System.out.println("4");
        printWriter.write("STUDENT GRADES:\n--------------------\n");
        for (int x = 0; x < students.size(); x++) {
            System.out.println(x);
            System.out.println(students.size());
            Student currentStudent = students.get(x);
            System.out.println("AHHH");
            printWriter.println("Student " + x + ". \n" + currentStudent.toString());
        }
        printWriter.close();
        System.out.println("5_");

    }
}