package com.bitunified.ledconfig.domain.product.cover.types;

import com.bitunified.ledconfig.domain.Dimension;
import com.bitunified.ledconfig.domain.product.cover.Covering;


public class Cover extends Covering {
    public Cover(){
        this(new Dimension());
    }
    public Cover(Dimension dimension) {
        super(dimension);
    }
}
