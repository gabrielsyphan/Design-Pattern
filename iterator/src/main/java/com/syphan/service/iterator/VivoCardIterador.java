package com.syphan.service.iterator;

import com.syphan.model.SimCard;
import com.syphan.service.CardService;
import com.syphan.service.VivoCardService;

import java.util.ArrayList;
import java.util.List;

public class VivoCardIterador implements SimCardIterator {

    private int index = 0;
    private final List<SimCard> simCards = new ArrayList<>();
    private final CardService cardService = new VivoCardService();
    private final String userName;

    public VivoCardIterador(String name) {
        this.userName = name;
    }

    private void loadCards(String name) {
        if(this.simCards.isEmpty()) {
            this.simCards.addAll(this.cardService.getCards(name));
        }
    }

    @Override
    public boolean hasNext() {
        this.loadCards(this.userName);
        return this.simCards.size() > index;
    }

    @Override
    public SimCard next() {
        if(!this.hasNext()) {
            return null;
        }

        SimCard simCard = this.simCards.get(index);
        this.index++;
        return simCard;
    }

    @Override
    public void reset() {
        this.index = 0;
    }
}
