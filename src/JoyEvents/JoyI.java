package JoyEvents;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class JoyI extends JoyEvent {

    int keycode = KeyEvent.VK_I;

    public void pressed() {
        if (!alive) {
            try {
                (new Robot()).keyPress(keycode);
                alive = true;
            } catch (Exception ex) {
                System.out.println(keycode + " Key Code Error..");
            }
        }
    }

    public void released() {
        if (alive) {
            try {
                (new Robot()).keyRelease(keycode);
                alive = false;

            } catch (Exception ex) {
                System.out.println(keycode + " Key Code Error..");
            }
        }
    }
}
