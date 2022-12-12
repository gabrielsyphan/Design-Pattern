package com.syphan.service.iterator;

import com.syphan.model.SimCard;

public interface SimCardIterator {

    boolean hasNext();

    SimCard next();

    void reset();
}
