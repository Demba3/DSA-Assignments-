class MyHashMap {
    private int[] map;
    private final int size = 100000;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        map = new int[size];
        for (int i = 0; i < size; i++)
            map[i] = -1;
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        map[key % size] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        if (map[key % size] != -1)
            return map[key % size];

        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        map[key % size] = -1;
    }
}
