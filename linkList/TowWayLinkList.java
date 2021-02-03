package linkList;

import java.util.Iterator;

public class TowWayLinkList<T> implements Iterable<T> {
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
		this.head.next = null;
		this.head.pre = null;
		this.head.item = null;
		this.last = null;
		this.N = 0;
	}

	//获取链表的长度
	public int length() {
		return N;
	}

	//判断链表是否为空
	public boolean isEmpty() {
		return N == 0;
	}

	//获取第一个元素
	public T getFirst() {
		if (isEmpty()) {
			return null;
		}
		return head.next.item;
	}

	//获取最后一个元素
	public T getLast() {
		if (isEmpty()) {
			return null;
		}
		return last.item;
	}

	//插入元素t
	public void insert(T t) {
		//如果链表为空
		if (isEmpty()) {
			//创建新节点
			Node newNode = new Node(t, head, null);
			//让新节点成为尾节点
			last = newNode;
			//让头结点指向尾节点
			head.next = last;
		} else {
			//如果链表不为空
			Node oldNode = last;
			//创建新节点
			Node newNode = new Node(t, oldNode, null);
			//让当前尾节点指向新节点
			oldNode.next = newNode;
			//让新节点成为尾节点
			last = newNode;
		}
		//元素个数+1
		N++;
	}

	//向指定位置处插入元素t
	public void insert(int i, T t) {
		//找到i位置的前一个节点
		Node pre = head;
		for (int index = 0; index < i; index++) {
			pre = pre.next;
		}
		//找到i位置的节点
		Node curr = pre.next;
		//创建新节点
		Node newNode = new Node(t, pre, curr);
		//让i位置的前一个节点的下一个节点变为新节点
		pre.next = newNode;
		//让i位置的前一个节点变为新节点
		curr.pre = newNode;
		//元素个数+1
		N++;
	}

	//获取指定位置i处的元素
	public T get(int i) {
		Node n = head.next;
		for (int index = 0; index < i; index++) {
			n = n.next;
		}
		return n.item;
	}

	//找到元素t在链表中第一次出现的位置
	public int indexOf(T t) {
		Node n = head;
		for (int i = 0; n.next != null; i++) {
			n = n.next;
			if (n.next.equals(t)) {
				return i;
			}
		}
		return -1;
	}

	//删除位置i处的元素，并返回该元素
	public T remove(int i) {
		//找到i位置前一个节点
		Node pre = head;
		for (int index = 0; index < i; index++) {
			pre = pre.next;
		}
		//找到i位置节点
		Node curr = pre.next;
		//找到i位置下一个节点
		Node nextNode = curr.next;
		//让i位置的一个节点的下一个节点变为i位置的下一个节点
		pre.next = nextNode;
		//让i位置的下一个的上一个节点变为i位置的前一个节点
		nextNode.pre = pre;
		//元素个数-1
		N--;
		return curr.item;
	}

	@Override
	public Iterator iterator() {
		return new TItertor();
	}

	private class TItertor implements Iterator {
		private Node n;

		public TItertor() {
			this.n = head;
		}

		@Override
		public boolean hasNext() {
			return n.next != null;
		}

		@Override
		public Object next() {
			n = n.next;
			return n.item;
		}
	}
}
