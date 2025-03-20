/**
 * Program Name: Wheel Exception
 * Date: 2025-03-20
 * @author Spencer DaSilva
 * Program Description: Vehicle Exception
 */

public class WheelException extends RuntimeException {
    public WheelException(int message) {
        super(message + " isn't a valid number. It's impossible for a vehicle for have that many vehicle!");
    }

}
