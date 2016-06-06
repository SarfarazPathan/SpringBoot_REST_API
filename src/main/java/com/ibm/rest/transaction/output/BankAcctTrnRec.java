
package com.ibm.rest.transaction.output;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


public class BankAcctTrnRec {

    private String postedDt;
    private String trnDt;
    private String trnType;
    private String trnCode;
    private String desc1;
    private String desc2;
    private String amt;
    private String runningBal;
    private String refNum;
    private String cardUsed;
    private String cardSequence;
    private String categoryCode;
    private String plan;
    private String planSeq;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The postedDt
     */
    public String getPostedDt() {
        return postedDt;
    }

    /**
     * 
     * @param postedDt
     *     The PostedDt
     */
    public void setPostedDt(String postedDt) {
        this.postedDt = postedDt;
    }

    /**
     * 
     * @return
     *     The trnDt
     */
    public String getTrnDt() {
        return trnDt;
    }

    /**
     * 
     * @param trnDt
     *     The TrnDt
     */
    public void setTrnDt(String trnDt) {
        this.trnDt = trnDt;
    }

    /**
     * 
     * @return
     *     The trnType
     */
    public String getTrnType() {
        return trnType;
    }

    /**
     * 
     * @param trnType
     *     The TrnType
     */
    public void setTrnType(String trnType) {
        this.trnType = trnType;
    }

    /**
     * 
     * @return
     *     The trnCode
     */
    public String getTrnCode() {
        return trnCode;
    }

    /**
     * 
     * @param trnCode
     *     The TrnCode
     */
    public void setTrnCode(String trnCode) {
        this.trnCode = trnCode;
    }

    /**
     * 
     * @return
     *     The desc1
     */
    public String getDesc1() {
        return desc1;
    }

    /**
     * 
     * @param desc1
     *     The Desc1
     */
    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    /**
     * 
     * @return
     *     The desc2
     */
    public String getDesc2() {
        return desc2;
    }

    /**
     * 
     * @param desc2
     *     The Desc2
     */
    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    /**
     * 
     * @return
     *     The amt
     */
    public String getAmt() {
        return amt;
    }

    /**
     * 
     * @param amt
     *     The Amt
     */
    public void setAmt(String amt) {
        this.amt = amt;
    }

    /**
     * 
     * @return
     *     The runningBal
     */
    public String getRunningBal() {
        return runningBal;
    }

    /**
     * 
     * @param runningBal
     *     The RunningBal
     */
    public void setRunningBal(String runningBal) {
        this.runningBal = runningBal;
    }

    /**
     * 
     * @return
     *     The refNum
     */
    public String getRefNum() {
        return refNum;
    }

    /**
     * 
     * @param refNum
     *     The RefNum
     */
    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }

    /**
     * 
     * @return
     *     The cardUsed
     */
    public String getCardUsed() {
        return cardUsed;
    }

    /**
     * 
     * @param cardUsed
     *     The CardUsed
     */
    public void setCardUsed(String cardUsed) {
        this.cardUsed = cardUsed;
    }

    /**
     * 
     * @return
     *     The cardSequence
     */
    public String getCardSequence() {
        return cardSequence;
    }

    /**
     * 
     * @param cardSequence
     *     The CardSequence
     */
    public void setCardSequence(String cardSequence) {
        this.cardSequence = cardSequence;
    }

    /**
     * 
     * @return
     *     The categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * 
     * @param categoryCode
     *     The CategoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * 
     * @return
     *     The plan
     */
    public String getPlan() {
        return plan;
    }

    /**
     * 
     * @param plan
     *     The Plan
     */
    public void setPlan(String plan) {
        this.plan = plan;
    }

    /**
     * 
     * @return
     *     The planSeq
     */
    public String getPlanSeq() {
        return planSeq;
    }

    /**
     * 
     * @param planSeq
     *     The PlanSeq
     */
    public void setPlanSeq(String planSeq) {
        this.planSeq = planSeq;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
