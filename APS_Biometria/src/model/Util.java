/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Jefferson
 */
public class Util {

    

    public Util() {
    }

    //Metodo que remove mascaras dos campos numericos
    public String removeMask(String x) {
        String str = x;
        while (str.indexOf("-") != -1) {
            if (str.indexOf("-") != 0) {
                str = str.substring(0, str.indexOf("-"))
                        + str.substring(str.indexOf("-") + 1);
            } else {
                str = str.substring(str.indexOf("-") + 1);
            }
        }
        while (str.indexOf(".") != -1) {
            if (str.indexOf(".") != 0) {
                str = str.substring(0, str.indexOf("."))
                        + str.substring(str.indexOf(".") + 1);
            } else {
                str = str.substring(str.indexOf(".") + 1);
            }
        }
        return str;

    }

    //Metodo que retorna data atual.
    public Date getPegaDataAtual() {
        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        calendar.setTime(date);
        return calendar.getTime();

    }

    public static String aplicarHash(String entrada) throws NoSuchAlgorithmException {

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(entrada.getBytes(), 0, entrada.length());

            BigInteger hash = new BigInteger(1, md.digest());

            //Formatando o resultado em uma cadeia de 32 caracteres, completando com 0 caso falte
            return String.format("%1$032X", hash);
        } catch (NoSuchAlgorithmException ex) {
            throw ex;
        }

    }

}
