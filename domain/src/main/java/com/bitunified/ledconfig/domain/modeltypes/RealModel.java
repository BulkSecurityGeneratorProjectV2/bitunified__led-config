package com.bitunified.ledconfig.domain.modeltypes;


import com.bitunified.ledconfig.domain.Dimension;
import com.bitunified.ledconfig.domain.Margin;
import com.bitunified.ledconfig.domain.Model;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class RealModel extends Model {
    protected Dimension dimension=new Dimension(null,null);

    private Dimension maxDimension;
    private Margin margin=new Margin();

    public RealModel(){

    }
    public RealModel(Dimension dimension) {
        this.dimension=dimension;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Dimension getMaxDimension() {
        return maxDimension;
    }
    public void setDimension(Dimension dimension){
        this.dimension=dimension;
    }

    public void setMaxDimension(Dimension maxDimension) {
        this.maxDimension = maxDimension;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public void setLeftSpace(Integer leftSpace) {
        this.margin.setLeft(leftSpace);
    }

    public Integer getLeftSpace() {
        return margin.getLeft();
    }

    public Integer getRightSpace() {
        return margin.getRight();
    }

    public void setRightSpace(Integer rightSpace) {
        this.margin.setRight(rightSpace);
    }
}
