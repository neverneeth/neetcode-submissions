class MyHashMap {
    private class store{
        int key;
        int value;
        store(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }

    int size = 500;

    LinkedList<store>[] map;

    public MyHashMap() {
        map = new LinkedList[size];
    }
    
    public void put(int key, int value) {
        int ind = key %size;
        if(map[ind] == null)
        {
            map[ind] = new LinkedList<>();
            store data = new store(key, value);
            map[ind].add(data);  
        }
        else
        {
            int found= 0;
            for(store dats: map[ind])
            {
                if(dats.key == key)
                {
                    dats.value = value;
                    found = 1;
                    break;
                }
            }
            if(found == 0)
            {
                store data = new store(key, value);
                map[ind].add(data);
            }
        }
    }
    
    public int get(int key) {
        int ind = key % size;
        if(map[ind] != null)
        {
            for(store dats: map[ind])
            {
                if(dats.key == key)
                {
                    return dats.value;
                }
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int ind = key % size;
        if(map[ind] != null)
        {
            for(store dats: map[ind])
            {
                if(dats.key == key)
                {
                    map[ind].remove(dats);
                    return;
                }
            }
        }        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */