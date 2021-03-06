/**
 * CustomParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * CustomParameters holds a list of CustomParameters to be treated
 * as a map.
 *             It has a special field used to indicate that the current
 * map should be cleared and replaced
 *             with this new map.
 */
public class CustomParameters  implements java.io.Serializable {
    /* The list of custom parameters.
     *                 
     *                 <p>On update, all parameters can be cleared by providing
     * an empty or null list and setting
     *                 doReplace to true. */
    private com.google.api.ads.adwords.axis.v201409.cm.CustomParameter[] parameters;

    /* On SET operation, indicates that the current parameters should
     * be cleared and replaced
     *                 with these parameters. */
    private java.lang.Boolean doReplace;

    public CustomParameters() {
    }

    public CustomParameters(
           com.google.api.ads.adwords.axis.v201409.cm.CustomParameter[] parameters,
           java.lang.Boolean doReplace) {
           this.parameters = parameters;
           this.doReplace = doReplace;
    }


    /**
     * Gets the parameters value for this CustomParameters.
     * 
     * @return parameters   * The list of custom parameters.
     *                 
     *                 <p>On update, all parameters can be cleared by providing
     * an empty or null list and setting
     *                 doReplace to true.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.CustomParameter[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this CustomParameters.
     * 
     * @param parameters   * The list of custom parameters.
     *                 
     *                 <p>On update, all parameters can be cleared by providing
     * an empty or null list and setting
     *                 doReplace to true.
     */
    public void setParameters(com.google.api.ads.adwords.axis.v201409.cm.CustomParameter[] parameters) {
        this.parameters = parameters;
    }

    public com.google.api.ads.adwords.axis.v201409.cm.CustomParameter getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, com.google.api.ads.adwords.axis.v201409.cm.CustomParameter _value) {
        this.parameters[i] = _value;
    }


    /**
     * Gets the doReplace value for this CustomParameters.
     * 
     * @return doReplace   * On SET operation, indicates that the current parameters should
     * be cleared and replaced
     *                 with these parameters.
     */
    public java.lang.Boolean getDoReplace() {
        return doReplace;
    }


    /**
     * Sets the doReplace value for this CustomParameters.
     * 
     * @param doReplace   * On SET operation, indicates that the current parameters should
     * be cleared and replaced
     *                 with these parameters.
     */
    public void setDoReplace(java.lang.Boolean doReplace) {
        this.doReplace = doReplace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomParameters)) return false;
        CustomParameters other = (CustomParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            ((this.doReplace==null && other.getDoReplace()==null) || 
             (this.doReplace!=null &&
              this.doReplace.equals(other.getDoReplace())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDoReplace() != null) {
            _hashCode += getDoReplace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CustomParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CustomParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doReplace");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "doReplace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
