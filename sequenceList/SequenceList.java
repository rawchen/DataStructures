package sequenceList;

import java.util.Arrays;
import java.util.Iterator;

public class SequenceList<T> implements Iterable<T> {
    //存储元素的数组
    private T[] eles;
    //记录当前顺序表中的元素个数
    private int N;

    //构造方法
    public SequenceList(int capacity){
        //初始化数组
        this.eles=(T[])new Object[capacity];
        //初始化长度
        this.N=0;
    }

    //将一个线性表置为空表
    public void clear(){
        this.N=0;
    }

    //判断当前线性表是否为空表
    public boolean isEmpty(){
        return N==0;
    }

    //获取线性表的长度
    public int length(){
        return N;
    }

    //获取指定位置的元素
    public T get(int i){
        return eles[i];
    }

    //根据参数newSize，重置eles的大小
    public void resize(int newSize){
        //定义一个临时数组，指向原数组
        T[] temp=eles;
        //创建新数组
        eles=(T[])new Object[newSize];
        //把原数组的数据拷贝到新数组即可
        for(int i=0;i<N;i++){
            eles[i]=temp[i];
        }
    }

    //向线型表中添加元素t
    public void insert(T t){
        //判断是否会超出，会超出则开辟新的空间为原来2倍
        if (N==eles.length){
            resize(2*eles.length);
        }
        eles[N]=t;
        N++;
    }

    //在i元素处插入元素T
    public void insert(int i, T t) {
        //先把i索引处的元素及其后面的元素依次向后移动一位
        for (int index = N; index > i; index--) {
            eles[index] = eles[index-1];
        }
        //再把t元素放到i索引处即可
        eles[i] = t;
        //元素个数+1
        N++;
    }

    //删除指定索引的i处的元素，并返回该元素
    public T remove(int i) {
        //记录索引i的值
        T current = eles[i];
        //索引i后面的元素依次向前移动一位即可
        for (int index = i; index < N-1; index++) {
            eles[index] = eles[index+1];
        }
        //元素个数-1
        N--;
        return current;
    }

    //查找t元素第一次出现的位置
    public int indexOf(T t) {
        for (int i = 0; i < N; i++) {
            if (eles[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "SequenceList{" +
                "eles=" + Arrays.toString(eles) +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
