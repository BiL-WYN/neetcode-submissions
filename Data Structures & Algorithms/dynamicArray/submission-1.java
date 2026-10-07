class DynamicArray {
    int [] arr;
    int size;
    int capacity;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int get(int i) {
        return this.arr[i];

    }

    public void set(int i, int n) {
        this.arr[i] = n;
        
    }
    public void pushback(int n) {
        if (this.size == capacity){
            resize();
        }

        this.arr[this.size] = n;
        this.size++;
    }
    public int popback() {
        int lastElement = this.arr[this.size-1];
        this.arr[this.size-1] = 0;
        this.size--;
        return lastElement;
    }

    public void resize() {
        this.capacity = 2 * this.capacity;
        int[] newarr = new int[capacity];
        int index = 0;
        for (int i = 0; i < this.size; i++){
            newarr[index] = this.arr[i];
            index++;
        }
        this.arr = newarr;

    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;

    }
}
