package blinkerapp.controllers;

import blinkerapp.controllers.workers.BlinkerWorker;
import blinkerapp.views.BlinkFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 *
 * @author sam
 */
public class BlinkController {

    private BlinkFrame myView;
    private BlinkerWorker blinkerWorker = null;

    public BlinkController() {
        myView = new BlinkFrame();
        initController();
    }

    private void initController() {

        ActionListener blinkButtonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blinkButtonAction();
            }
        };

        ActionListener infiniteButtonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infiniteButtonAction();
            }
        };

        myView.getBlinkMeButton().addActionListener(blinkButtonActionListener);
        myView.getInfiniteButton().addActionListener(infiniteButtonActionListener);

        myView.setVisible(true);
    }

    private void infiniteButtonAction() {
        this.myView.getInfiniteButton().setEnabled(false);
        blinkerWorker = new BlinkerWorker(this);
        blinkerWorker.execute();
    }

    private void blinkButtonAction() {
        //Here come the magics !
        Random random = new Random();

        float red = random.nextFloat();
        float green = random.nextFloat();
        float blue = random.nextFloat();

        myView.getBlinker().changeMyColor(new Color(red, green, blue));
    }

    public void blinkForWorker() {
        this.blinkButtonAction();
    }
}
