/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author pminp
 */
public class getToday {
    public static String getToday(){
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        String today = myFormat.format(cal.getTime());
        return today;
    }
}
