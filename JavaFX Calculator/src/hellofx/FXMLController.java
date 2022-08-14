package hellofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class FXMLController implements Initializable 
{
    String firstStr, secondStr, resultStr, symStr;
    int firstInt, secondInt, resultInt, sequence = 0, function = 0;
    boolean lockSym = false;
    double result;

    @FXML
    private Pane displayPane;
    @FXML
    private Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, times, divide, equals;
    @FXML
    private Label firstNo, symbol, secondNo, results, eq;
    @FXML
    private Button reset;
    @FXML
    private Label fail;

    @Override
    public void initialize(URL url, ResourceBundle rb) {}    

    private void handleButton(ActionEvent event){}
    
    private void functions()
    {
        System.out.println(function);
        switch (function) 
        {
            case 0:
                resultInt = firstInt + secondInt;
                results.setText(String.valueOf(resultInt));
                break;
            case 1:
                resultInt = firstInt - secondInt;
                results.setText(String.valueOf(resultInt));
                break;
            case 2:
                resultInt = firstInt * secondInt;
                results.setText(String.valueOf(resultInt));
                break;
            case 3:
                resultInt = firstInt / secondInt;
                results.setText(String.valueOf(resultInt));
                break;
            default:
                break;
        }
    }

    @FXML
    private void handleButtonOne(ActionEvent event) 
    {
        if (sequence == 0)
        {
            firstInt = 1;
            if (firstStr != null){firstStr = firstStr + String.valueOf(firstInt);}
            else {firstStr = String.valueOf(firstInt);}
            firstNo.setText(firstStr);
        }
        else if (sequence == 1)
        {
            firstInt = Integer.valueOf(firstStr);
            lockSym = true;
            secondInt = 1;
            if (secondStr != null){secondStr = secondStr + String.valueOf(secondInt);}
            else {secondStr = String.valueOf(secondInt);}
            secondNo.setText(secondStr);
        }
    }
    
    @FXML
    private void handleButtonTwo(ActionEvent event) 
    {
        if (sequence == 0)
        {
            firstInt = 2;
            if (firstStr != null){firstStr = firstStr + String.valueOf(firstInt);}
            else {firstStr = String.valueOf(firstInt);}
            firstNo.setText(firstStr);
        }
        else if (sequence == 1)
        {
            firstInt = Integer.valueOf(firstStr);
            lockSym = true;
            secondInt = 2;
            if (secondStr != null){secondStr = secondStr + String.valueOf(secondInt);}
            else {secondStr = String.valueOf(secondInt);}
            secondNo.setText(secondStr);
        }
    }

    @FXML
    private void handleButtonThree(ActionEvent event) 
    {
        if (sequence == 0)
        {
            firstInt = 3;
            if (firstStr != null){firstStr = firstStr + String.valueOf(firstInt);}
            else {firstStr = String.valueOf(firstInt);}
            firstNo.setText(firstStr);
        }
        else if (sequence == 1)
        {
            firstInt = Integer.valueOf(firstStr);
            lockSym = true;
            secondInt = 3;
            if (secondStr != null){secondStr = secondStr + String.valueOf(secondInt);}
            else {secondStr = String.valueOf(secondInt);}
            secondNo.setText(secondStr);
        }
    }

    @FXML
    private void handleButtonFour(ActionEvent event) 
    {
        if (sequence == 0)
        {
            firstInt = 4;
            if (firstStr != null){firstStr = firstStr + String.valueOf(firstInt);}
            else {firstStr = String.valueOf(firstInt);}
            firstNo.setText(firstStr);
        }
        else if (sequence == 1)
        {
            firstInt = Integer.valueOf(firstStr);
            lockSym = true;
            secondInt = 4;
            if (secondStr != null){secondStr = secondStr + String.valueOf(secondInt);}
            else {secondStr = String.valueOf(secondInt);}
            secondNo.setText(secondStr);
        }
    }

    @FXML
    private void handleButtonFive(ActionEvent event) 
    {
        if (sequence == 0)
        {
            firstInt = 5;
            if (firstStr != null){firstStr = firstStr + String.valueOf(firstInt);}
            else {firstStr = String.valueOf(firstInt);}
            firstNo.setText(firstStr);
        }
        else if (sequence == 1)
        {
            firstInt = Integer.valueOf(firstStr);
            lockSym = true;
            secondInt = 5;
            if (secondStr != null){secondStr = secondStr + String.valueOf(secondInt);}
            else {secondStr = String.valueOf(secondInt);}
            secondNo.setText(secondStr);
        }
    }

    @FXML
    private void handleButtonSix(ActionEvent event) 
    {
        if (sequence == 0)
        {
            firstInt = 6;
            if (firstStr != null){firstStr = firstStr + String.valueOf(firstInt);}
            else {firstStr = String.valueOf(firstInt);}
            firstNo.setText(firstStr);
        }
        else if (sequence == 1)
        {
            firstInt = Integer.valueOf(firstStr);
            lockSym = true;
            secondInt = 6;
            if (secondStr != null){secondStr = secondStr + String.valueOf(secondInt);}
            else {secondStr = String.valueOf(secondInt);}
            secondNo.setText(secondStr);
        }
    }

    @FXML
    private void handleButtonSeven(ActionEvent event) 
    {
        if (sequence == 0)
        {
            firstInt = 7;
            if (firstStr != null){firstStr = firstStr + String.valueOf(firstInt);}
            else {firstStr = String.valueOf(firstInt);}
            firstNo.setText(firstStr);
        }
        else if (sequence == 1)
        {
            firstInt = Integer.valueOf(firstStr);
            lockSym = true;
            secondInt = 7;
            if (secondStr != null){secondStr = secondStr + String.valueOf(secondInt);}
            else {secondStr = String.valueOf(secondInt);}
            secondNo.setText(secondStr);
        }
    }

    @FXML
    private void handleButtonEight(ActionEvent event) 
    {
        if (sequence == 0)
        {
            firstInt = 8;
            if (firstStr != null){firstStr = firstStr + String.valueOf(firstInt);}
            else {firstStr = String.valueOf(firstInt);}
            firstNo.setText(firstStr);
        }
        else if (sequence == 1)
        {
            firstInt = Integer.valueOf(firstStr);
            lockSym = true;
            secondInt = 8;
            if (secondStr != null){secondStr = secondStr + String.valueOf(secondInt);}
            else {secondStr = String.valueOf(secondInt);}
            secondNo.setText(secondStr);
        }
    }

    @FXML
    private void handleButtonNine(ActionEvent event) 
    {
        if (sequence == 0)
        {
            firstInt = 9;
            if (firstStr != null){firstStr = firstStr + String.valueOf(firstInt);}
            else {firstStr = String.valueOf(firstInt);}
            firstNo.setText(firstStr);
        }
        else if (sequence == 1)
        {
            firstInt = Integer.valueOf(firstStr);
            lockSym = true;
            secondInt = 9;
            if (secondStr != null){secondStr = secondStr + String.valueOf(secondInt);}
            else {secondStr = String.valueOf(secondInt);}
            secondNo.setText(secondStr);
        }
    }

    @FXML
    private void handleButtonZero(ActionEvent event) 
    {
        if (sequence == 0)
        {
            firstInt = 0;
            if (firstStr != null){firstStr = firstStr + String.valueOf(firstInt);}
            else {firstStr = String.valueOf(firstInt);}
            firstNo.setText(firstStr);
        }
        else if (sequence == 1)
        {
            firstInt = Integer.valueOf(firstStr);
            lockSym = true;
            secondInt = 0;
            if (secondStr != null){secondStr = secondStr + String.valueOf(secondInt);}
            else {secondStr = String.valueOf(secondInt);}
            secondNo.setText(secondStr);
        }
    }

    @FXML
    private void handleButtonPlus(ActionEvent event) 
    {
        if (!lockSym)
        {
            sequence = 1;
            symbol.setText("+");
        }
    }

    @FXML
    private void handleButtonMinus(ActionEvent event) 
    {
        if (!lockSym)
        {
            sequence = 1;
            symbol.setText("-");
            function = 1;
        }
    }

    @FXML
    private void handleButtonTimes(ActionEvent event) 
    {
        if (!lockSym)
        {
            sequence = 1;
            symbol.setText("*");
            function = 2;
        }
    }

    @FXML
    private void handleButtonDivide(ActionEvent event) 
    {
        if (!lockSym)
        {
            sequence = 1;
            symbol.setText("/");
            function = 3;
        }
    }
    
    @FXML
    private void equals(ActionEvent event) 
    {
        if (secondInt == 0 && secondStr.length() == 1 && function == 3){fail.setText("Bro you fail math issit");}
        else 
        {
            eq.setText("=");
            sequence = 2;
            secondInt = Integer.valueOf(secondStr);
            functions();
        }
    }

    @FXML
    private void reset(ActionEvent event) 
    {
        firstInt = 0;
        firstStr = "";
        secondInt = 0;
        secondStr = "";
        resultInt = 0;
        resultStr = "";
        sequence = 0;
        function = 0;
        lockSym = false;
        
        firstNo.setText("");
        secondNo.setText("");
        symbol.setText("");
        eq.setText("");
        results.setText("");
        fail.setText("");
    }
}