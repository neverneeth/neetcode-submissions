class MyHashSet {
    private LinkedList<Integer>[] buckets;
    private int SIZE = 10000; 
    public MyHashSet() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    private int getIndex(int key) {
        return key % SIZE;
    }
    
    public void add(int key) {
        int index = getIndex(key);
        LinkedList<Integer> bucket = buckets[index];
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int index = getIndex(key);
        LinkedList<Integer> bucket = buckets[index];
        bucket.remove(Integer.valueOf(key)); 
    }
    
    public boolean contains(int key) {
        int index = getIndex(key);
        return buckets[index].contains(key);
    }
}