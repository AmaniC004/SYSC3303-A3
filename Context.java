/**
 * The Context interface represents the context in which a state machine operates.
 * It defines methods to interact with the context and manage its state.
 * @author Nkechi Chukwuma
 */
public interface Context {

    /**
     * Starts the context or state machine.
     */
    void start();

    /**
     * Notifies the context about a timeout event.
     */
    void timeout();

    /**
     * Notifies the context about a pedestrian waiting event.
     */
    void pedestrianWaiting();

    /**
     * Sets the state of the context.
     *
     * @param state The new state to set.
     */
    void setState(State state);

    /**
     * Retrieves the previous state of the context.
     *
     * @return The previous state.
     */
    Object getPreviousState();

    /**
     * Retrieves the current state of the context.
     *
     * @return The current state.
     */
    State getCurrentState();
}
