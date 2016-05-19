package blinkerapp.controllers.workers;

import blinkerapp.controllers.BlinkController;
import javax.swing.SwingWorker;

/**
 *
 * @author sam
 */
public class BlinkerWorker extends SwingWorker<Object, Object> {

    private boolean continuePlaying = true;
    private BlinkController blinkController;

    public BlinkerWorker(BlinkController bc) {
        blinkController = bc;
    }

    public void setContinuePlaying(boolean continuePlaying) {
        this.continuePlaying = continuePlaying;
    }

    @Override
    protected Object doInBackground() throws Exception {

        while (continuePlaying) {

            this.blinkController.blinkForWorker();

            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
            }
        }

        return null;
    }

}
