package com.bitunified.ledconfig.parts;


import com.bitunified.ledconfig.domain.Model;
import com.bitunified.ledconfig.domain.modeltypes.RealModel;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.Serializable;
import java.math.BigDecimal;

@XmlSeeAlso({NotExistingPart.class})
public class Part extends Relatable implements Serializable {


    private RealModel product;

    private Model configModel;

    private String priceStr;

    private BigDecimal price;

    private String description;

    private String id;

    private String type;

    public Part(Model configModel) {
        this.configModel = configModel;
    }

    public Part(RealModel product) {
        this.product = product;
    }

    public Part() {

    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public RealModel getProduct() {
        return product;
    }

    public void setProduct(RealModel product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Model getConfigModel() {
        return configModel;
    }

    public void setConfigModel(Model configModel) {
        this.configModel = configModel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part = (Part) o;

        return id != null ? id.equals(part.id) : part.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPriceStr() {
        return priceStr;
    }

    public void setPriceStr(String priceStr) {
        this.priceStr = priceStr;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
