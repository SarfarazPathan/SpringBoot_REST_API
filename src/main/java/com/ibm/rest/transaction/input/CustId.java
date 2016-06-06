
package com.ibm.rest.transaction.input;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


public class CustId {

    private String custPermId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The custPermId
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * 
     * @param custPermId
     *     The CustPermId
     */
    public void setCustPermId(String custPermId) {
        this.custPermId = custPermId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
