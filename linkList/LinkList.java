package linkList;

public class LinkList<T> {
    //记录头结点
    private Node head;
    //记录链表的长度
    private int N;

    //节点类
    private class Node {
        //存储数据
        T item;
        //下一个节点
        Node next;

        public Node(T item,Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkList() {
        //初始化头结点
        this.head = new Node(null,null);
        //初始化元素个数
        this.N = 0;
    }

    //清空链表
    public void clear() {
        head.next = null;
        N = 0;
    }

    //获取链表的长度
    public int length() {
        return N;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return N == 0;
    }

    //获取指定位置i索引处的元素
    public T get(int i) {
        //通过循环从头结点开始往后找，依次找i次
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }

    //向链表中插入元素t
    public void insert(T t) {
        //找到当前最后一个节点
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        //创建新节点保存元素t
        Node newNode = new Node(t, null);
        //让当前最后一个节点指向新节点
        n.next = newNode;
        //元素个数+1
        N++;
    }


}
