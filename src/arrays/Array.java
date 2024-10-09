package arrays;

import java.util.Arrays;

public class Array<T> {

    private Object[] items;
    private int count;

    public Array(int capacity) {
        this.items = new Object[capacity];
    }

    public void insert(T item) {
        checkCapacity();
        this.items[this.count++] = item;
    }

    public void deleteAt(int index) {
        if (this.Empty())
            return;

        for (int i = index; i < this.count; i++) {
            this.items[i] = this.items[i + 1];
        }
        this.count--;
    }

    public int indexOf(T item) {
        for (int i = 0; i < this.count; i++) {
            if (this.items[i] == item)
                return i;
        }
        return -1;
    }

    // use two pointers
    public int indexOfWithTwoPointers(T item) {
        int start = 0;
        int end = this.count - 1;
        while (end >= start) {
            if (this.items[start] == item)
                return start;
            else if (this.items[end] == item)
                return end;

            start++;
            end--;

        }
        return -1;
    }

    private void checkCapacity() {
        if (this.count == this.items.length) {
            Object[] newItems = new Object[this.count * 2];
            for (int i = 0; i < this.count; i++) {
                newItems[i] = this.items[i];
            }
            this.items = newItems;
        }
    }

    private boolean Empty() {
        return this.count < 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }
}
