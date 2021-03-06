
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GoalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="LIFETIME"/>
 *     &lt;enumeration value="DAILY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GoalType")
@XmlEnum
public enum GoalType {


    /**
     * 
     *                 No goal is specified for the number of ads delivered. The
     *                 {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#CLICK_TRACKING}</li>
     *                 </ul>
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 There is a goal on the number of ads delivered for this line item during
     *                 its entire lifetime. The {@link LineItem#lineItemType} must be
     *                 one of:
     *                 <ul>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#ADSENSE}</li>
     *                 <li>{@link LineItemType#AD_EXCHANGE}</li>
     *                 <li>{@link LineItemType#ADMOB}</li>
     *                 <li>{@link LineItemType#CLICK_TRACKING}</li>
     *                 </ul>
     *               
     * 
     */
    LIFETIME,

    /**
     * 
     *                 There is a daily goal on the number of ads delivered for this line item.
     *                 The {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#HOUSE}</li>
     *                 <li>{@link LineItemType#ADSENSE}</li>
     *                 <li>{@link LineItemType#AD_EXCHANGE}</li>
     *                 <li>{@link LineItemType#ADMOB}</li>
     *                 <li>{@link LineItemType#BUMPER}</li>
     *                 </ul>
     *               
     * 
     */
    DAILY,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static GoalType fromValue(String v) {
        return valueOf(v);
    }

}
