package milliondollarstupidapps.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import milliondollarstupidapps.models.Counter;
import milliondollarstupidapps.views.HelloWorld;

/**
 *
 * @author sam
 */
public class HelloWorldController {

    private HelloWorld myView;
    private Counter myModel;
    
    
    public HelloWorldController() {
        myView = new HelloWorld();
        myModel = new Counter();
        this.initController();
    }

    public void initController(){
        
        ActionListener clickMeButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickMeAction();
            }
        };
        
        this.myView.getClickMeButton().addActionListener(clickMeButtonListener);
        
        this.myView.setVisible(true);
    }
    
    public void clickMeAction(){
        this.myModel.increment(1);
        this.myView.getLabelCounter().setText(String.format("%s", this.myModel.getCounter()));
    }
    
}
