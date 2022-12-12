package com.syphan.service;

import com.syphan.model.SimCard;

import java.util.List;

public interface CardService {

    List<SimCard> getCards(String name);
}
