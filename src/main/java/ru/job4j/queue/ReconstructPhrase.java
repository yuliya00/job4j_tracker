package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder elements = new StringBuilder();
        for (int i = 0; evenElements.size() > 0; i++) {
            elements.append(evenElements.poll());
            evenElements.poll();
        }
        return elements.toString();
    }

    private String getDescendingElements() {
        StringBuilder elements = new StringBuilder();
        for (int i = 0; descendingElements.size() > 0; i++) {
            elements.append(descendingElements.pollLast());
        }
        return elements.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
