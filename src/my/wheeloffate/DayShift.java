/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.wheeloffate;
import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Denis
 */
public class DayShift {
    String firstEmployee;
    String secondEmployee;
    int listPositionFirstEmployee;
    int listPositionSecondEmployee;
    Calendar shift = Calendar.getInstance();
    DayShift(String first,String second,int firstPos,int secondPos){
        firstEmployee = first;
        secondEmployee = second;
        listPositionFirstEmployee = firstPos;
        listPositionSecondEmployee = secondPos;
    }
    
}
