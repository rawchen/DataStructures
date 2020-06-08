package test;

import sequenceList.SequenceList;

public class SequenceListTest {
    public static void main(String[] args) {
        //创建顺序表对象
        SequenceList<String> sl = new SequenceList<>(10);
        //测试插入
        sl.insert("姚明");
        sl.insert("科比");
        sl.insert("麦迪");
        sl.insert(0,"詹姆斯");
        //测试获取
        System.out.println(sl);
        String getResult = sl.get(1);
        System.out.println("获取索引1处的结果为："+getResult);
        //测试删除
        String removeResult = sl.remove(0);
        System.out.println("删除的元素是："+removeResult);
        System.out.println(sl);
        //测试清空
        sl.clear();
        System.out.println("清空后线性表中元素个数为：" + sl.length());
    }
}
