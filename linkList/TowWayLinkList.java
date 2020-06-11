package linkList;

public class TowWayLinkList<T> {
    //首节点
    private Node head;
    //最后一个节点
    private Node last;
    //链表长度
    private int N;

    private class Node {
        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }

        //存储数据
        public T item;
        //指向上一个节点
        public Node pre;
        //指向下一个节点
        public Node next;
    }

    public TowWayLinkList() {
        //初始化头结点和尾节点
        this.head = new Node(null, null, null);
        this.last = null;
        //初始化元素个数
        this.N = 0;
    }

    //清空链表
    public void clear() {

    }

    //获取链表的长度
    public int length() {
        return -1;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return false;
    }

    //获取第一个元素
    public T getFirst() {
        return null;
    }

    //获取最后一个元素
    public T getLast() {
        return null;
    }

    //插入元素t
    public void insert(T t) {

    }

    //向指定位置处插入元素t
    public void insert(int i, T t) {

    }

    //获取指定位置i处的元素
    public T get(int i) {
        return null;
    }

    //找到元素t在链表中第一次出现的位置
    public int indexOf(T t) {
        return -1;
    }


}
