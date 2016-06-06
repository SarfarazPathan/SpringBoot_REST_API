
package com.ibm.rest.transaction.output;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;


public class AcctTrnInqRs {

    private String rqUID;
    private ANZAcctId aNZAcctId;
    private CustId custId;
    private SelRangeDt selRangeDt;
    private RecCtrlOut recCtrlOut;
    private List<BankAcctTrnRec> bankAcctTrnRec = new ArrayList<BankAcctTrnRec>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The rqUID
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * 
     * @param rqUID
     *     The RqUID
     */
    public void setRqUID(String rqUID) {
        this.rqUID = rqUID;
    }

    /**
     * 
     * @return
     *     The aNZAcctId
     */
    public ANZAcctId getANZAcctId() {
        return aNZAcctId;
    }

    /**
     * 
     * @param aNZAcctId
     *     The ANZAcctId
     */
    public void setANZAcctId(ANZAcctId aNZAcctId) {
        this.aNZAcctId = aNZAcctId;
    }

    /**
     * 
     * @return
     *     The custId
     */
    public CustId getCustId() {
        return custId;
    }

    /**
     * 
     * @param custId
     *     The CustId
     */
    public void setCustId(CustId custId) {
        this.custId = custId;
    }

    /**
     * 
     * @return
     *     The selRangeDt
     */
    public SelRangeDt getSelRangeDt() {
        return selRangeDt;
    }

    /**
     * 
     * @param selRangeDt
     *     The SelRangeDt
     */
    public void setSelRangeDt(SelRangeDt selRangeDt) {
        this.selRangeDt = selRangeDt;
    }

    /**
     * 
     * @return
     *     The recCtrlOut
     */
    public RecCtrlOut getRecCtrlOut() {
        return recCtrlOut;
    }

    /**
     * 
     * @param recCtrlOut
     *     The RecCtrlOut
     */
    public void setRecCtrlOut(RecCtrlOut recCtrlOut) {
        this.recCtrlOut = recCtrlOut;
    }

    /**
     * 
     * @return
     *     The bankAcctTrnRec
     */
    public List<BankAcctTrnRec> getBankAcctTrnRec() {
        return bankAcctTrnRec;
    }

    /**
     * 
     * @param bankAcctTrnRec
     *     The BankAcctTrnRec
     */
    public void setBankAcctTrnRec(List<BankAcctTrnRec> bankAcctTrnRec) {
        this.bankAcctTrnRec = bankAcctTrnRec;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
