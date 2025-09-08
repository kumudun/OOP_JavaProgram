# class Calculator
## Explain how this Calculator class works

This `Calculator` class is a simple implementation of a calculator that can perform basic addition operations. It maintains a running total of the numbers added to it and provides methods to reset the total, add numbers, and retrieve the current total value.The add method throws an exception if a negative number is added.


### calculator/Calculator.java
"""
public class Calculator {
private int total;
"""

### Constructor to initialize the total to zero

### Edit-The Calculator() constructor sets the calculator’s running total to zero using this.total = 0
"""
public Calculator() {
    this.total = 0;
}
"""

### Method to reset the total to zero

### Edit-The reset method sets the total back to zero.
"""
public void reset() {
    this.total = 0;
}
"""

### Method to add a number to the total

### Edit-The add method takes one integer as input. If the number is negative, it immediately throws an IllegalArgumentException with the message "Negative numbers are not allowed". This prevents negative numbers from being added. If the number is positive (or zero), it is added to the calculator’s running total
"""
public void add(int number) {
    if (number < 0) {
        throw new IllegalArgumentException("Negative numbers are not allowed");
    }
    this.total += number;
}
"""

### Method to get the current total

### Edit-The getTotal method returns the current value of the total.
"""
public int getTotal() {
    return this.total;
}
""""
### main method to demonstrate the functionality of the Calculator class

### Edit-class works by creating a Calculator, adding numbers, and printing the total.
"""
public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.add(5);
    calculator.add(10);
    System.out.println("Total: " + calculator.getTotal()); // Output: Total: 15
    calculator.reset();
    System.out.println("Total after reset: " + calculator.getTotal()); // Output: Total after reset: 0
}
}   








