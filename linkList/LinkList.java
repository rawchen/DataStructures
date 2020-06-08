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

    }

}
