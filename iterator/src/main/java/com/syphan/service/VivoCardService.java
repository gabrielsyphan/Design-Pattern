package com.syphan.service;

import com.syphan.model.SimCard;

import java.util.List;

public class VivoCardService implements CardService {

    @Override
    public List<SimCard> getCards(String name) {
        return List.of(
            new SimCard(1, name, "87654321", "New york", "gabriel@racconbit.com", "Enabled"),
            new SimCard(2, name, "87123123", "California", "gabriel@racconbit.com", "Enabled"),
            new SimCard(3, name, "87456321", "Brith Columbia", "gabriel@racconbit.com", "Disabled"),
            new SimCard(4, name, "87987678", "Maceió", "gabriel@racconbit.com", "Enabled")
        );
    }
}
