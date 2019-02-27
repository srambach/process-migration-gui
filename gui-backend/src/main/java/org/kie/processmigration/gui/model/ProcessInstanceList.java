//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 05:43:16 PM EDT 
//


package org.kie.processmigration.gui.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="process-instance" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="process-instance-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="process-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="process-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="process-version" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="process-instance-state" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="container-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="initiator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="start-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="process-instance-desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="correlation-key" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="parent-instance-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="sla-compliance" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processInstance"
})
@XmlRootElement(name = "process-instance-list")
public class ProcessInstanceList {

    @XmlElement(name = "process-instance")
    protected List<ProcessInstanceList.ProcessInstance> processInstance;

    /**
     * Gets the value of the processInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessInstanceList.ProcessInstance }
     * 
     * 
     */
    public List<ProcessInstanceList.ProcessInstance> getProcessInstance() {
        if (processInstance == null) {
            processInstance = new ArrayList<ProcessInstanceList.ProcessInstance>();
        }
        return this.processInstance;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="process-instance-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="process-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="process-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="process-version" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="process-instance-state" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="container-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="initiator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="start-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="process-instance-desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="correlation-key" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="parent-instance-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="sla-compliance" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "processInstanceId",
        "processId",
        "processName",
        "processVersion",
        "processInstanceState",
        "containerId",
        "initiator",
        "startDate",
        "processInstanceDesc",
        "correlationKey",
        "parentInstanceId",
        "slaCompliance"
    })
    public static class ProcessInstance {

        @XmlElement(name = "process-instance-id")
        protected byte processInstanceId;
        @XmlElement(name = "process-id", required = true)
        protected String processId;
        @XmlElement(name = "process-name", required = true)
        protected String processName;
        @XmlElement(name = "process-version")
        protected float processVersion;
        @XmlElement(name = "process-instance-state")
        protected byte processInstanceState;
        @XmlElement(name = "container-id", required = true)
        protected String containerId;
        @XmlElement(required = true)
        protected String initiator;
        @XmlElement(name = "start-date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startDate;
        @XmlElement(name = "process-instance-desc", required = true)
        protected String processInstanceDesc;
        @XmlElement(name = "correlation-key")
        protected byte correlationKey;
        @XmlElement(name = "parent-instance-id")
        protected byte parentInstanceId;
        @XmlElement(name = "sla-compliance")
        protected byte slaCompliance;

        /**
         * Gets the value of the processInstanceId property.
         * 
         */
        public byte getProcessInstanceId() {
            return processInstanceId;
        }

        /**
         * Sets the value of the processInstanceId property.
         * 
         */
        public void setProcessInstanceId(byte value) {
            this.processInstanceId = value;
        }

        /**
         * Gets the value of the processId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessId() {
            return processId;
        }

        /**
         * Sets the value of the processId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessId(String value) {
            this.processId = value;
        }

        /**
         * Gets the value of the processName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessName() {
            return processName;
        }

        /**
         * Sets the value of the processName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessName(String value) {
            this.processName = value;
        }

        /**
         * Gets the value of the processVersion property.
         * 
         */
        public float getProcessVersion() {
            return processVersion;
        }

        /**
         * Sets the value of the processVersion property.
         * 
         */
        public void setProcessVersion(float value) {
            this.processVersion = value;
        }

        /**
         * Gets the value of the processInstanceState property.
         * 
         */
        public byte getProcessInstanceState() {
            return processInstanceState;
        }

        /**
         * Sets the value of the processInstanceState property.
         * 
         */
        public void setProcessInstanceState(byte value) {
            this.processInstanceState = value;
        }

        /**
         * Gets the value of the containerId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContainerId() {
            return containerId;
        }

        /**
         * Sets the value of the containerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContainerId(String value) {
            this.containerId = value;
        }

        /**
         * Gets the value of the initiator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitiator() {
            return initiator;
        }

        /**
         * Sets the value of the initiator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitiator(String value) {
            this.initiator = value;
        }

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the processInstanceDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessInstanceDesc() {
            return processInstanceDesc;
        }

        /**
         * Sets the value of the processInstanceDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessInstanceDesc(String value) {
            this.processInstanceDesc = value;
        }

        /**
         * Gets the value of the correlationKey property.
         * 
         */
        public byte getCorrelationKey() {
            return correlationKey;
        }

        /**
         * Sets the value of the correlationKey property.
         * 
         */
        public void setCorrelationKey(byte value) {
            this.correlationKey = value;
        }

        /**
         * Gets the value of the parentInstanceId property.
         * 
         */
        public byte getParentInstanceId() {
            return parentInstanceId;
        }

        /**
         * Sets the value of the parentInstanceId property.
         * 
         */
        public void setParentInstanceId(byte value) {
            this.parentInstanceId = value;
        }

        /**
         * Gets the value of the slaCompliance property.
         * 
         */
        public byte getSlaCompliance() {
            return slaCompliance;
        }

        /**
         * Sets the value of the slaCompliance property.
         * 
         */
        public void setSlaCompliance(byte value) {
            this.slaCompliance = value;
        }

    }

}