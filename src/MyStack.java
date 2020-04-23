public class MyStack {
    private int[] arr;
    private int size = 0;
    private int index = -1;

    public MyStack(int size){
        this.size = size;
        arr = new int[this.size];
    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Ngăn xếp đầy, không thể thêm phần tử: " + element);
        }else {
            index++;
            arr[index] = element;
        }
    }
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Ngắn xếp rỗng");
        }
        return arr[index--];
    }
    public int size(){
        return this.index;
    }
    public boolean isEmpty(){
        if (this.index == -1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if (this.index == size - 1) {
            return true;
        }
        return false;
    }
}
