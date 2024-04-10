/**
 * The VehiclesRedState class represents the state where vehicles are stopped at a red signal in a pedestrian crossing.
 * It defines behavior for handling timeout events and pedestrian waiting events.
 * @author Nkechi Chukwuma
 */
public class VehiclesRedState extends State {

    /**
     * Handles the timeout event by transitioning to the PedestriansWalkState.
     *
     * @param context The context in which the state machine operates.
     * @return The current state after handling the timeout event.
     */
    @Override
    public State handleTimeout(Context context) {
        // Transition to PedestriansWalkState
        context.setState(new PedestriansWalkState());
        System.out.println("Switching from VEHICLES_RED to PEDESTRIANS_WALK");
        return context.getCurrentState();
    }

    /**
     * Handles the pedestrian waiting event detected while in the VehiclesRedState.
     *
     * @param context The context in which the state machine operates.
     * @return The current state after handling the pedestrian waiting event.
     */
    @Override
    public State handlePedestrianWaiting(Context context) {
        System.out.println("Pedestrian waiting detected in VEHICLES_RED state.");
        // Additional logic to handle pedestrian waiting event can be implemented here
        return this;
    }
}
