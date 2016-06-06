
package com.ibm.rest.transaction.input;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


public class ANZAcctId {

    private String acctId;
    private String acctNo;
    private String acctType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The acctId
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * 
     * @param acctId
     *     The AcctId
     */
    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    /**
     * 
     * @return
     *     The acctNo
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * 
     * @param acctNo
     *     The AcctNo
     */
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    /**
     * 
     * @return
     *     The acctType
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * 
     * @param acctType
     *     The AcctType
     */
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
