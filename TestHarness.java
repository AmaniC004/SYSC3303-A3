/**
 * The TestHarness class is responsible for testing the behavior of a state machine implemented using the Context interface.
 * It provides methods to simulate timeout events and pedestrian waiting events and prints the current state of the system under test.
 * @author Nkechi Chukwuma
 */
class TestHarness {
    private final Context systemUnderTest;

    /**
     * Constructs a TestHarness with the specified system under test.
     *
     * @param test The system under test, implementing the Context interface.
     */
    public TestHarness(Context test) {
        this.systemUnderTest = test;
    }

    /**
     * Simulates a timeout event in the system under test.
     */
    public void testTimeout() {
        // Start the state machine
        systemUnderTest.start();
        printCurrentState();

        // Simulate timeout event
        systemUnderTest.timeout();
        printCurrentState();
    }

    /**
     * Simulates a pedestrian waiting event in the system under test.
     */
    public void testPedestrianWaiting() {
        // Start the state machine
        systemUnderTest.start();
        printCurrentState();

        // Simulate pedestrian waiting event
        systemUnderTest.pedestrianWaiting();
        printCurrentState();
    }

    /**
     * Prints the current state of the system under test.
     */
    private void printCurrentState() {
        System.out.println("Current State: " + systemUnderTest.getCurrentState().getClass().getSimpleName());
    }
}

/**
 * The Main class contains the main method to run the state machine test harness.
 * @author Nkechi Chukwuma
 */
class Main {
    /**
     * The main method initializes the state machine and test harness, and continuously tests the system by simulating events.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Initialize the state machine and test harness
        PedestrianCrossingStateMachine stateMachine = new PedestrianCrossingStateMachine();
        TestHarness testHarness = new TestHarness(stateMachine);

        // Continuously test the system by simulating events
        while (true) {
            // Test timeout
            System.out.println("Testing timeout:");
            testHarness.testTimeout();

            // Test pedestrian waiting
            System.out.println("\nTesting pedestrian waiting:");
            testHarness.testPedestrianWaiting();
        }
    }
}
