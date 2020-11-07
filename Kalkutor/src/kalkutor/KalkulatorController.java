/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkutor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
/**
 *
 * @author SheilaMallenium
 */
public class KalkulatorController implements Initializable {

   @FXML
    TextArea textOutput;
         
    // Reset
    private boolean reset = true;
    
    // Operator state
    private boolean hasOperator = false;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     
    @FXML
    private void keypadAction(ActionEvent event)
    { 
        // Get Button text
        Button button = (Button)event.getSource();
        String buttonText = button.getText();
        
        pressKey(buttonText);
       
    }
    // Press Key
    private void pressKey(String key)
    {
         // If we are resetting, clear everything
        if(reset)
        {
            textOutput.setText("");
            reset = false;
            hasOperator = false;
        }
         
        // Draw to output
        addToOutput(key);
    }
    
     // Adds text to output
    private void addToOutput(String text)
    {
        // If we only have a 0 in output, clear it
        if("0".equals(textOutput.getText()) )
        {
            textOutput.setText("");
        }
        textOutput.setText(textOutput.getText() + text);
    }
}
