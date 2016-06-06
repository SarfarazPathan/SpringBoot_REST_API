
package com.ibm.rest.transaction.input;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


public class ANZTraceInfo {

    private String effDt;
    private String initCompany;
    private String operatorId;
    private String branchId;
    private String terminalId;
    private String origApp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The effDt
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * 
     * @param effDt
     *     The EffDt
     */
    public void setEffDt(String effDt) {
        this.effDt = effDt;
    }

    /**
     * 
     * @return
     *     The initCompany
     */
    public String getInitCompany() {
        return initCompany;
    }

    /**
     * 
     * @param initCompany
     *     The InitCompany
     */
    public void setInitCompany(String initCompany) {
        this.initCompany = initCompany;
    }

    /**
     * 
     * @return
     *     The operatorId
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * 
     * @param operatorId
     *     The OperatorId
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 
     * @return
     *     The branchId
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * 
     * @param branchId
     *     The BranchId
     */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    /**
     * 
     * @return
     *     The terminalId
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * 
     * @param terminalId
     *     The TerminalId
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * 
     * @return
     *     The origApp
     */
    public String getOrigApp() {
        return origApp;
    }

    /**
     * 
     * @param origApp
     *     The OrigApp
     */
    public void setOrigApp(String origApp) {
        this.origApp = origApp;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
