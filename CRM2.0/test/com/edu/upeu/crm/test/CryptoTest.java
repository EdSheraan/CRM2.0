/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.upeu.crm.test;

import pe.edu.upeu.crm.util.Crypto;

/**
 *
 * @author Andres
 */
public class CryptoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String m ="mi password con % / &";
        System.out.println(m);
        String en = Crypto.encrypt(m);
        System.out.println(en);
        String de = Crypto.decrypt(en);
        System.out.println(de);
    }
    
}
