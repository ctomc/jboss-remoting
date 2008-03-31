package org.jboss.cx.remoting.metadata;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 */
@XmlType(namespace = "urn:jboss:remoting:3.0", name = "attribute")
public final class SessionMetaDataAttribute {
    private Class<?> claxx;
    private String name;
    private Object value;

    public Class<?> getClaxx() {
        return claxx;
    }

    @XmlAttribute(name = "class")
    public void setClaxx(final Class<?> claxx) {
        this.claxx = claxx;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name", required = true)
    public void setName(final String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    @XmlAnyElement
    public void setValue(final Object value) {
        this.value = value;
    }
}
