package gostop.controllers.workers;

import gostop.controllers.GoStopController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;

/**
 *
 * @author sam
 */
public class GoStopWorker extends SwingWorker<Object, Object>{

    private boolean continuePlay = true;
    private GoStopController goStopController;
    private long PAUSE_RED = 2500;
    private long PAUSE_GREEN = 2000;
    private long PAUSE_ORANGE = 1000;
    
    
    public GoStopWorker(GoStopController controller){
        this.goStopController = controller;
    }
    
    public void setContinuePlay(boolean play){
        this.continuePlay = play;
    }
    
    @Override
    protected Object doInBackground() throws Exception {
        
        while (continuePlay) {            
            
            pause(PAUSE_RED);
            this.goStopController.getView().getRedLed().toggle();
            this.goStopController.getView().getGreenLed().toggle();
            pause(PAUSE_GREEN);
            this.goStopController.getView().getGreenLed().toggle();
            this.goStopController.getView().getOrangeLed().toggle();
            pause(PAUSE_ORANGE);
            this.goStopController.getView().getOrangeLed().toggle();
            this.goStopController.getView().getRedLed().toggle();
        }
        
        return null;
    }
    
    
    private void pause(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            Logger.getLogger(GoStopWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
