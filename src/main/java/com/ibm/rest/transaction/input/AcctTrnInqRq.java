
package com.ibm.rest.transaction.input;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


public class AcctTrnInqRq {

    private ANZTraceInfo aNZTraceInfo;
    private String rqUID;
    private ANZAcctId aNZAcctId;
    private CustId custId;
    private SelRangeDt selRangeDt;
    private String incDetail;
    private String recCtrlIn;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The aNZTraceInfo
     */
    public ANZTraceInfo getANZTraceInfo() {
        return aNZTraceInfo;
    }

    /**
     * 
     * @param aNZTraceInfo
     *     The ANZTraceInfo
     */
    public void setANZTraceInfo(ANZTraceInfo aNZTraceInfo) {
        this.aNZTraceInfo = aNZTraceInfo;
    }

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
     *     The incDetail
     */
    public String getIncDetail() {
        return incDetail;
    }

    /**
     * 
     * @param incDetail
     *     The IncDetail
     */
    public void setIncDetail(String incDetail) {
        this.incDetail = incDetail;
    }

    /**
     * 
     * @return
     *     The recCtrlIn
     */
    public String getRecCtrlIn() {
        return recCtrlIn;
    }

    /**
     * 
     * @param recCtrlIn
     *     The RecCtrlIn
     */
    public void setRecCtrlIn(String recCtrlIn) {
        this.recCtrlIn = recCtrlIn;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
