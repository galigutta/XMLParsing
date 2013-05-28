/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galigutta;

import com.ib.client.CommissionReport;
import com.ib.client.Contract;
import com.ib.client.ContractDetails;
import com.ib.client.EClientSocket;
import com.ib.client.EWrapper;
import com.ib.client.Execution;
import com.ib.client.Order;
import com.ib.client.OrderState;
import com.ib.client.UnderComp;

/**
 *
 * @author vamsi
 */
public class WrapperAdapter implements EWrapper{
    EClientSocket client = new EClientSocket(this);
    @Override
    public void tickPrice(int tickerId, int field, double price, int canAutoExecute) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tickSize(int tickerId, int field, int size) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tickOptionComputation(int tickerId, int field, double impliedVol, double delta, double optPrice, double pvDividend, double gamma, double vega, double theta, double undPrice) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tickGeneric(int tickerId, int tickType, double value) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tickString(int tickerId, int tickType, String value) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tickEFP(int tickerId, int tickType, double basisPoints, String formattedBasisPoints, double impliedFuture, int holdDays, String futureExpiry, double dividendImpact, double dividendsToExpiry) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void orderStatus(int orderId, String status, int filled, int remaining, double avgFillPrice, int permId, int parentId, double lastFillPrice, int clientId, String whyHeld) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void openOrder(int orderId, Contract contract, Order order, OrderState orderState) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void openOrderEnd() {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAccountValue(String key, String value, String currency, String accountName) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePortfolio(Contract contract, int position, double marketPrice, double marketValue, double averageCost, double unrealizedPNL, double realizedPNL, String accountName) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAccountTime(String timeStamp) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accountDownloadEnd(String accountName) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nextValidId(int orderId) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void contractDetails(int reqId, ContractDetails contractDetails) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bondContractDetails(int reqId, ContractDetails contractDetails) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void contractDetailsEnd(int reqId) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execDetails(int reqId, Contract contract, Execution execution) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execDetailsEnd(int reqId) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateMktDepth(int tickerId, int position, int operation, int side, double price, int size) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateMktDepthL2(int tickerId, int position, String marketMaker, int operation, int side, double price, int size) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNewsBulletin(int msgId, int msgType, String message, String origExchange) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void managedAccounts(String accountsList) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receiveFA(int faDataType, String xml) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void historicalData(int reqId, String date, double open, double high, double low, double close, int volume, int count, double WAP, boolean hasGaps) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void scannerParameters(String xml) {
        XMLParse.xmlDetails(xml);
    }

    @Override
    public void scannerData(int reqId, int rank, ContractDetails contractDetails, String distance, String benchmark, String projection, String legsStr) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void scannerDataEnd(int reqId) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void realtimeBar(int reqId, long time, double open, double high, double low, double close, long volume, double wap, int count) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void currentTime(long time) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fundamentalData(int reqId, String data) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deltaNeutralValidation(int reqId, UnderComp underComp) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tickSnapshotEnd(int reqId) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void marketDataType(int reqId, int marketDataType) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void commissionReport(CommissionReport commissionReport) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void position(String account, Contract contract, int pos) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void positionEnd() {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accountSummary(int reqId, String account, String tag, String value, String currency) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accountSummaryEnd(int reqId) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void error(Exception e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void error(String str) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void error(int id, int errorCode, String errorMsg) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void connectionClosed() {
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
