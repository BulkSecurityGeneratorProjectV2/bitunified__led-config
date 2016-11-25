package com.bitunified.ledconfig.composedproduct;

import com.bitunified.ledconfig.domain.Dimension;
import com.bitunified.ledconfig.domain.Model;
import com.bitunified.ledconfig.domain.modeltypes.RealModel;
import com.bitunified.ledconfig.parts.Part;

import java.util.HashSet;
import java.util.Set;


public class ComposedProduct extends RealModel {

    private Set<Part> products=new HashSet<Part>();

    public ComposedProduct(Integer totalWidth, Integer totalHeight) {
        this.getDimension().width=totalWidth;
                this.getDimension().height=totalHeight;
    }

    public void addProducts(Part model) {
        products.add(model);
    }
}
