/**
 * The State class represents a state within a state machine.
 * States define behavior for handling various events within the context.
 * @author Nkechi Chukwuma
 */
public abstract class State {

    /**
     * Handles the start event within the context.
     *
     * @param context The context in which the state machine operates.
     * @return The state after handling the start event.
     */
    public State start(Context context) {
        return this;
    }

    /**
     * Handles the timeout event within the context.
     *
     * @param context The context in which the state machine operates.
     * @return The state after handling the timeout event.
     */
    public State handleTimeout(Context context) {
        return this;
    }

    /**
     * Handles the pedestrian waiting event within the context.
     *
     * @param context The context in which the state machine operates.
     * @return The state after handling the pedestrian waiting event.
     */
    public State handlePedestrianWaiting(Context context) {
        return this;
    }

}
