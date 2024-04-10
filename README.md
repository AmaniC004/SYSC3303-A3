# SYSC3303-A3
Assignment 3 for SYSC 3303 Winter 2024
Introduction to Pedestrian Crossing State Machine

Description:
This project implements a pedestrian crossing state machine in Java, consisting of several classes representing different states and components of the system.

Files:
- OperationalState.java: Represents the initial operational state of the pedestrian crossing system.
- VehiclesGreenState.java: Represents the state where vehicles have the right of way.
- VehiclesYellowState.java: Represents the state where vehicles are transitioning from green to red.
- VehiclesRedState.java: Represents the state where vehicles are stopped at a red signal.
- PedestriansWalkState.java: Represents the state where pedestrians have the right of way to walk.
- PedestriansFlashState.java: Represents the state where pedestrians have a flashing "Don't Walk" signal.
- Context.java: Interface defining methods for interacting with the state machine.
- State.java: Abstract class representing a state within the state machine.
- TestHarness.java: Class for testing the state machine by simulating events.
- PedestrianCrossingStateMachine.java: Main class implementing the pedestrian crossing state machine.
- README.txt: File containing project information and setup instructions.
- Diagrams are in the diagram folder

How to Run:
To run the project in IntelliJ IDEA Ultimate, follow these steps:
1. Import the project into IntelliJ IDEA:
   - Open IntelliJ IDEA.
   - Select "File" > "Open" and navigate to the project directory.
   - Select the project folder and click "Open".
2. Ensure that the project SDK is correctly configured:
   - Go to "File" > "Project Structure".
   - Under "Project", verify that the "Project SDK" is set to the appropriate JDK version.
3. Run the `PedestrianCrossingStateMachine` class:
   - Right-click on the "PedestrianCrossingStateMachine" class and select "Run PedestrianCrossingStateMachine.main()".
   - The program will continuously simulate events in the pedestrian crossing state machine, printing the current state after each event.
4. To terminate the program, click the stop button in the IntelliJ IDEA toolbar or press Ctrl+C in the terminal window.

Dependencies:
- Java Development Kit (JDK) 8 or higher
- IntelliJ IDEA Ultimate IDE (latest version recommended)

NB: I couldn't spot the second error.
The first error should be the fact that the don't walk signal doesn't take into consideration the number of pedestrians waiting to cross and how long it would take them to cross.  

Author:
- Nkechi Chukwuma
- Date: 2nd March 2024
