# Employee Payroll System

## Overview
The **Employee Payroll System** is a simple Java-based system that manages employee details and calculates salaries for both full-time and part-time employees. The system allows adding, removing, and displaying employees, along with computing their salaries based on their employment type.

## Features
- Add full-time and part-time employees to the payroll system.
- Remove employees based on their unique ID.
- Display the list of employees along with their salary details.
- Uses **Object-Oriented Programming (OOP)** principles such as **abstraction, inheritance, and polymorphism**.

## Classes and Responsibilities

### 1. **Main Class**
- The entry point of the program.
- Creates an instance of `PayRollSystem`.
- Adds employees and performs operations such as displaying and removing employees.

### 2. **PayRollSystem**
- Manages a list of employees.
- Provides methods to add, remove, and display employees.

### 3. **Employee (Abstract Class)**
- Represents a general employee with name and ID.
- Contains an abstract method `calculateSalery()` to be implemented by subclasses.
- Overrides `toString()` to display employee details.

### 4. **FullTimeEmployee (Subclass of Employee)**
- Represents full-time employees with a fixed monthly salary.
- Implements `calculateSalery()` to return the monthly salary.

### 5. **PartTimeEmployee (Subclass of Employee)**
- Represents part-time employees with hourly wages.
- Implements `calculateSalery()` based on hours worked and hourly rate.

## Installation and Usage
### Prerequisites
- Java Development Kit (JDK) installed
- Any Java IDE (e.g., IntelliJ IDEA, Eclipse, VS Code) or command line

### Running the Application
1. Clone the repository:
   ```sh
   git clone https://github.com/PulkitLatta/Employee-Payroll-System.git
   ```
2. Navigate to the project directory:
   ```sh
   cd Employee-Payroll-System
   ```
3. Compile and run the program:
   ```sh
   javac Main.java
   java Main
   ```

## Example Output
```
Initial Employee Details:
Employee [Name= John Doe ID= 101 Salary= 5000.0 ]
Employee [Name= Jane Smith ID= 102 Salary= 450 ]

Removing Employee...

Remaining Employee Details:
Employee [Name= Jane Smith ID= 102 Salary= 450 ]
```

## Future Enhancements
- Implement database integration for persistent storage.
- Add a GUI for better user experience.
- Extend functionality with additional employee types.

## License
This project is licensed under the MIT License.

