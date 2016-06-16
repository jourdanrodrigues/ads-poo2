/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jourdanrodrigues
 */
public class Utils {    
    public static Matcher checkDate(String date) {
        String pattern = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
        // RegEx for email
        Matcher m = Pattern.compile(pattern).matcher(date);
        if (!m.find())
            throw new IllegalArgumentException("Data inválida!");
        else
            return m;
    }
}
