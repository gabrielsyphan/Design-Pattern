package com.syphan.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {

    private final HashMap<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... events) {
        for(String event : events) {
            this.listeners.put(event, new ArrayList<>());
        }
    }

    public void subscribe(String event, EventListener listener) {
        List<EventListener> listeners = this.listeners.get(event);
        listeners.add(listener);
    }

    public void unsubscribe(String event, EventListener listener) {
        List<EventListener> listeners = this.listeners.get(event);
        listeners.remove(listener);
    }

    public void notify(String event, String message) {
        List<EventListener> listeners = this.listeners.get(event);
        listeners.forEach(listener -> listener.onEvent(event, message));
    }
}
