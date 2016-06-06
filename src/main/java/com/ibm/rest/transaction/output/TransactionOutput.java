
package com.ibm.rest.transaction.output;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


public class TransactionOutput {

    private AcctTrnInqRs acctTrnInqRs;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The acctTrnInqRs
     */
    public AcctTrnInqRs getAcctTrnInqRs() {
        return acctTrnInqRs;
    }

    /**
     * 
     * @param acctTrnInqRs
     *     The AcctTrnInqRs
     */
    public void setAcctTrnInqRs(AcctTrnInqRs acctTrnInqRs) {
        this.acctTrnInqRs = acctTrnInqRs;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
