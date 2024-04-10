/**
 * The PedestriansWalkState class represents the state where pedestrians have the right of way to walk in a pedestrian crossing.
 * It defines behavior for handling timeout events and pedestrian waiting events.
 * @author Nkechi Chukwuma
 */
public class PedestriansWalkState extends State {
    // Timeout duration for transitioning to the PedestriansFlashState (15 seconds)
    private final int WALK_TIMEOUT = 15000;

    /**
     * Handles the timeout event by transitioning to the PedestriansFlashState after a specified timeout duration.
     *
     * @param context The context in which the state machine operates.
     * @return The current state after handling the timeout event.
     */
    @Override
    public State handleTimeout(Context context) {
        System.out.println("Switching from PEDESTRIANS_WALK to PEDESTRIANS_FLASH");
        try {
            // Simulate pedestrian walking time
            Thread.sleep(WALK_TIMEOUT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Transition to PedestriansFlashState
        context.setState(new PedestriansFlashState());
        return context.getCurrentState();
    }

    /**
     * Handles the pedestrian waiting event detected while in the PedestriansWalkState.
     *
     * @param context The context in which the state machine operates.
     * @return The current state after handling the pedestrian waiting event.
     */
    @Override
    public State handlePedestrianWaiting(Context context) {
        System.out.println("Pedestrian waiting detected in PEDESTRIANS_WALK state.");
        // Additional logic to handle pedestrian waiting event can be implemented here
        return this;
    }
}
