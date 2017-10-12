/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crm.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.naming.Context;
import javax.naming.InitialContext;
import org.apache.commons.net.util.Base64;
import org.pmw.tinylog.Logger;

/**
 *
 * @author Andres
 */
public class Crypto {

    private static String getKey() {
        try {
            InitialContext initialContext = new InitialContext();
            Context environmentContext = (Context) initialContext.lookup("java:/comp/env");
            return (String) environmentContext.lookup("cryptoKey");
        } catch (Exception e) {
            Logger.error("Usando clave temporal");
            return "temporarKey";
        }
    }

    public static String encrypt(String strClearText) {
        String strData = "";
        try {
            SecretKeySpec skeyspec = new SecretKeySpec(getKey().getBytes(), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
            byte[] encrypted = cipher.doFinal(strClearText.getBytes());
            byte[] base64 = Base64.encodeBase64(encrypted);
            strData = new String(base64);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strData;
    }

    public static String decrypt(String strEncrypted) {
        String strData = "";
        try {
            SecretKeySpec skeyspec = new SecretKeySpec(getKey().getBytes(), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.DECRYPT_MODE, skeyspec);
            byte[] base64 = Base64.decodeBase64(strEncrypted.getBytes());
            byte[] decrypted = cipher.doFinal(base64);
            strData = new String(decrypted);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strData;
    }
}
