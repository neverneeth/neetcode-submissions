class TimeMap {
    private class store
    {
        public String value;
        public int timestamp;
        store(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }
    public HashMap<String, ArrayList<store>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
        {
            ArrayList<store> l = new ArrayList<>();
            l.add(new store(value, timestamp));
            this.map.put(key, l);
            return;
        }
        else
        {
            this.map.get(key).add(new store(value, timestamp));
        }
    }
    
    public String get(String key, int timestamp) {
        if(!this.map.containsKey(key))
        {
            return "";
        }
        List<store> list = map.get(key);
        int l = 0;
        int r = list.size()-1;
        String result = "";
        while(l<=r)
        {
            int mid = (l+r)/2;
            store s = list.get(mid);
            if(s.timestamp == timestamp)
            {
                return s.value;
            }
            else if(s.timestamp < timestamp)
            {
                result = s.value;
                l = mid+1;
            }
            else if(s.timestamp > timestamp)
            {
                r = mid-1;
            }
        }
        return result; 
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */