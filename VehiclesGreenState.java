/**
 * The VehiclesGreenState class represents the state where vehicles have the right of way in a pedestrian crossing.
 * It defines behavior for handling timeout events and pedestrian waiting events.
 * @author Nkechi Chukwuma
 */
public class VehiclesGreenState extends State {
    // Timeout duration for transitioning to the yellow state (10 seconds)
    private final int YELLOW_TIMEOUT = 10000;

    /**
     * Handles the timeout event by transitioning to the VehiclesYellowState after a specified timeout duration.
     *
     * @param context The context in which the state machine operates.
     * @return The current state after handling the timeout event.
     */
    @Override
    public State handleTimeout(Context context) {
        // Transition to VehiclesYellowState
        context.setState(new VehiclesYellowState());
        System.out.println("Switching from VEHICLES_GREEN to VEHICLES_YELLOW");
        try {
            // Simulate timeout duration
            Thread.sleep(YELLOW_TIMEOUT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return context.getCurrentState();
    }

    /**
     * Handles the pedestrian waiting event detected while in the VehiclesGreenState.
     *
     * @param context The context in which the state machine operates.
     * @return The current state after handling the pedestrian waiting event.
     */
    @Override
    public State handlePedestrianWaiting(Context context) {
        System.out.println("Pedestrian waiting detected in VEHICLES_GREEN state.");
        // Additional logic to handle pedestrian waiting event can be implemented here
        return this;
    }
}
