/**
 * The VehiclesYellowState class represents the state where vehicles are transitioning from green to red in a pedestrian crossing.
 * It defines behavior for handling timeout events and pedestrian waiting events.
 * @author Nkechi Chukwuma
 */
public class VehiclesYellowState extends State {
    // Timeout duration for transitioning to the red state (3 seconds)
    private final int RED_TIMEOUT = 3000;
    // Timeout duration for transitioning to the green state (10 seconds)
    private final int GREEN_TIMEOUT = 10000;

    /**
     * Handles the timeout event by transitioning to either VehiclesGreenState or VehiclesRedState based on the previous state.
     *
     * @param context The context in which the state machine operates.
     * @return The current state after handling the timeout event.
     */
    @Override
    public State handleTimeout(Context context) {
        State nextState;
        if (context.getPreviousState() instanceof PedestriansFlashState) {
            // Transition to VehiclesGreenState if the previous state was PedestriansFlashState
            System.out.println("Switching from VEHICLES_YELLOW to VEHICLES_GREEN");
            try {
                // Simulate pedestrian walking time
                Thread.sleep(GREEN_TIMEOUT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nextState = new VehiclesGreenState();
            context.setState(nextState);
        } else {
            // Transition to VehiclesRedState if the previous state was not PedestriansFlashState
            System.out.println("Switching from VEHICLES_YELLOW to VEHICLES_RED");
            try {
                // Simulate transition to red state
                Thread.sleep(RED_TIMEOUT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nextState = new VehiclesRedState();
            context.setState(nextState);
        }
        return context.getCurrentState();
    }

    /**
     * Handles the pedestrian waiting event detected while in the VehiclesYellowState.
     *
     * @param context The context in which the state machine operates.
     * @return The current state after handling the pedestrian waiting event.
     */
    @Override
    public State handlePedestrianWaiting(Context context) {
        System.out.println("Pedestrian waiting detected in VEHICLES_YELLOW state.");
        // Additional logic to handle pedestrian waiting event can be implemented here
        return this;
    }
}
