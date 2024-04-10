/**
 * The OperationalState class represents the operational state within a state machine.
 * It defines behavior for starting the state machine.
 * @author Nkechi Chukwuma
 */
public class OperationalState extends State {

    /**
     * Starts the pedestrian crossing state machine.
     *
     * @param context The context in which the state machine operates.
     * @return The initial state of the state machine.
     */
    @Override
    public State start(Context context) {
        System.out.println("Starting the pedestrian crossing state machine.");
        return new VehiclesGreenState();
    }
}
