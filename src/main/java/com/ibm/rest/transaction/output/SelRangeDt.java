
package com.ibm.rest.transaction.output;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


public class SelRangeDt {

    private String startDt;
    private String endDt;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The startDt
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * 
     * @param startDt
     *     The StartDt
     */
    public void setStartDt(String startDt) {
        this.startDt = startDt;
    }

    /**
     * 
     * @return
     *     The endDt
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * 
     * @param endDt
     *     The EndDt
     */
    public void setEndDt(String endDt) {
        this.endDt = endDt;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
