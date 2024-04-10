/**
 * The PedestriansFlashState class represents the state where pedestrians have a flashing "Don't Walk" signal in a pedestrian crossing.
 * It defines behavior for handling timeout events and pedestrian waiting events.
 * @author Nkechi Chukwuma
 */
public class PedestriansFlashState extends State {
    // Flash period for the "Don't Walk" signal (2 seconds)
    private final int FLASH_PERIOD = 2000;
    // Counter for the number of times the "Don't Walk" signal flashes
    private int pedestrianFlashCtr = 7;

    /**
     * Handles the timeout event by flashing the "Don't Walk" signal for a certain number of times.
     * After flashing, transitions to the VehiclesYellowState.
     *
     * @param context The context in which the state machine operates.
     * @return The current state after handling the timeout event.
     */
    @Override
    public State handleTimeout(Context context) {
        if (pedestrianFlashCtr > 0) {
            // Flash the "Don't Walk" signal
            System.out.println("Flashing DONT_WALK signal \n" + pedestrianFlashCtr);
            if ((pedestrianFlashCtr & 1) == 0) {
                System.out.println("DONT_WALK signal ON");
            } else {
                System.out.println("DONT_WALK signal OFF");
            }
            pedestrianFlashCtr--;
            try {
                // Wait for the flash period
                Thread.sleep(FLASH_PERIOD);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this;
        } else {
            // Transition to VehiclesYellowState after flashing
            System.out.println("Switching from PEDESTRIANS_FLASH to VEHICLES_YELLOW");
            context.setState(new VehiclesYellowState());
            return context.getCurrentState();
        }
    }

    /**
     * Handles the pedestrian waiting event detected while in the PedestriansFlashState.
     *
     * @param context The context in which the state machine operates.
     * @return The current state after handling the pedestrian waiting event.
     */
    @Override
    public State handlePedestrianWaiting(Context context) {
        System.out.println("Pedestrian waiting detected in PEDESTRIANS_FLASH state.");
        // Additional logic to handle pedestrian waiting event can be implemented here
        return this;
    }
}
