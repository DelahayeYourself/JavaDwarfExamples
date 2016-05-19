package gostop.controllers;

import gostop.controllers.workers.GoStopWorker;
import gostop.views.GoStopFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sam
 */
public class GoStopController {

    private GoStopFrame myView = new GoStopFrame();
    private GoStopWorker goStopWorker = null;

    public GoStopController() {
        initController();
    }

    public GoStopFrame getView() {
        return myView;
    }

    private void initController() {
        ActionListener goStopActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goStopAction();
            }
        };

        myView.getGoStopButton().addActionListener(goStopActionListener);

        myView.getRedLed().setMyColor(Color.RED);
        myView.getOrangeLed().setMyColor(Color.ORANGE);
        myView.getGreenLed().setMyColor(Color.GREEN);
        myView.getRedLed().toggle();

        myView.setVisible(true);
    }

    private void goStopAction() {
        if (goStopWorker == null) {
            goStopWorker = new GoStopWorker(this);
            goStopWorker.execute();
            this.myView.getGoStopButton().setText("Stop");
        } else {
            goStopWorker.setContinuePlay(false);
            try {
                goStopWorker.get();
            } catch (ExecutionException | InterruptedException ex) {
                Logger.getLogger(GoStopController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                this.myView.getGoStopButton().setText("Go");
            }

        }

    }
}
