/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galigutta;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vamsi
 */
public class XMLParse {

    WrapperAdapter wa;

    public static void main(String[] args) {
        XMLParse xmlParse = new XMLParse();
        xmlParse.getXMLOutput();
    }

    private void getXMLOutput() {
        wa = new WrapperAdapter();
        String host = System.getProperty("jts.host");
        host = host != null ? host : "";
        wa.client.eConnect(host, 7496, 1);
        System.out.println(wa.client.isConnected());
//      Code to request XMLdata starts here
        wa.client.reqScannerParameters();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(XMLParse.class.getName()).log(Level.SEVERE, null, ex);
        }
        wa.client.eDisconnect();
    }

    public static void xmlDetails(String xml) {
        System.out.println(xml);
    }
}
