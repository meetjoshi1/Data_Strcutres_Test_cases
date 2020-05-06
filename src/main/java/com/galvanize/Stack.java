package com.galvanize;

import java.util.ArrayList;

public class Stack {
    public boolean empty;
    private ArrayList items;

    public Stack() {
        this.empty = true;
        this.items = new ArrayList();
    }

    public int count() {
        return this.items.size();
    }

    public void push(Object item) {
        this.items.add(item);
        this.empty = false;
    }

    public Object pop() {
        int lastIndex = this.count() -1;
        Object lastItem = this.items.get(lastIndex);
        this.items.remove(lastIndex);
        return lastItem;
    }

    public Object peek() {
        int lastIndex = this.count() -1;
        return this.items.get(lastIndex);
    }
}
