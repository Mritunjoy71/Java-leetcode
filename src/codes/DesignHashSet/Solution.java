package codes.DesignHashSet;

class MyHashSet {
    private int[] nums;

    public MyHashSet() {
        nums = new int[31251];

    }

    public void add(int key) {
        this.nums[getIndex(key)] |= getMask(key);
    }

    public void remove(int key) {
        this.nums[getIndex(key)] &= (~getMask(key));
    }

    public boolean contains(int key) {
        return (this.nums[getIndex(key)] & getMask(key)) != 0;
    }

    public int getIndex(int key) {
        return key / 32;
    }

    public int getMask(int key) {
        key %= 32;
        return 1 << key;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */