package percevalgenerator.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import percevalgenerator.models.Quotes;
import percevalgenerator.views.MyLittleGenerator;

/**
 *
 * @author sam
 */
public class MyLittleGeneratorController {

    private Quotes quotes;
    private MyLittleGenerator myLittleGenerator;
    
    public MyLittleGeneratorController() {
        quotes = new Quotes();
        myLittleGenerator = new MyLittleGenerator();
        this.initController();
    }
    
    public void initController() {
        ActionListener generateListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateAction();
            }
        };
        
        ActionListener quitListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quitAction();
            }
        };
        
        myLittleGenerator.getGenerateButton().addActionListener(generateListener);
        myLittleGenerator.getQuitButton().addActionListener(quitListener);
        
        myLittleGenerator.setVisible(true);
    }
    
    public void generateAction() {
        this.myLittleGenerator.getQuoteArea().setText(quotes.randomQuote());
    }
    
    public void quitAction(){
        System.exit(0);
    }
}
