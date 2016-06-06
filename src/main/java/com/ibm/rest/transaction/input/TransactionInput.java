
package com.ibm.rest.transaction.input;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


public class TransactionInput {

    private AcctTrnInqRq acctTrnInqRq;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The acctTrnInqRq
     */
    public AcctTrnInqRq getAcctTrnInqRq() {
        return acctTrnInqRq;
    }

    /**
     * 
     * @param acctTrnInqRq
     *     The AcctTrnInqRq
     */
    public void setAcctTrnInqRq(AcctTrnInqRq acctTrnInqRq) {
        this.acctTrnInqRq = acctTrnInqRq;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
