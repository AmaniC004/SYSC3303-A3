/**
 * The PedestrianCrossingStateMachine class implements the Context interface to represent a pedestrian crossing state machine.
 * It manages the current and previous states of the state machine and provides methods to start the state machine, handle timeout events, and handle pedestrian waiting events.
 * @author Nkechi Chukwuma
 */
public class PedestrianCrossingStateMachine implements Context {
    private State currentState;
    private State previousState;

    /**
     * Constructs a PedestrianCrossingStateMachine with an initial state of OperationalState.
     */
    public PedestrianCrossingStateMachine() {
        this.currentState = new OperationalState();
        this.previousState = null;
    }

    /**
     * Starts the state machine by invoking the start method of the current state.
     */
    @Override
    public void start() {
        currentState = currentState.start(this);
    }

    /**
     * Sets the state of the state machine.
     *
     * @param state The new state to set.
     */
    public void setState(State state) {
        this.previousState = this.currentState;
        this.currentState = state;
    }

    /**
     * Retrieves the previous state of the state machine.
     *
     * @return The previous state.
     */
    public State getPreviousState() {
        return previousState;
    }

    /**
     * Retrieves the current state of the state machine.
     *
     * @return The current state.
     */
    @Override
    public State getCurrentState() {
        return currentState;
    }

    /**
     * Simulates a timeout event in the state machine by invoking the handleTimeout method of the current state.
     */
    @Override
    public void timeout() {
        currentState = currentState.handleTimeout(this);
    }

    /**
     * Simulates a pedestrian waiting event in the state machine by invoking the handlePedestrianWaiting method of the current state.
     */
    @Override
    public void pedestrianWaiting() {
        currentState = currentState.handlePedestrianWaiting(this);
    }

    /**
     * The main method initializes a PedestrianCrossingStateMachine and continuously simulates events in the state machine.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        PedestrianCrossingStateMachine stateMachine = new PedestrianCrossingStateMachine();

        // Continuously simulate the sequence of events in the state machine
        while (true) {
            // Start the state machine
            stateMachine.start();
            // Simulate a timeout event (transition from VehiclesGreenState to VehiclesYellowState)
            stateMachine.timeout();
            // Simulate a pedestrian waiting event
            stateMachine.pedestrianWaiting();
        }
    }
}
