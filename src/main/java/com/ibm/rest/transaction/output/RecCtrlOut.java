
package com.ibm.rest.transaction.output;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


public class RecCtrlOut {

    private String sentRec;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The sentRec
     */
    public String getSentRec() {
        return sentRec;
    }

    /**
     * 
     * @param sentRec
     *     The SentRec
     */
    public void setSentRec(String sentRec) {
        this.sentRec = sentRec;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
