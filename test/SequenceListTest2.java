package test;

import sequenceList.SequenceList;

public class SequenceListTest2 {
    public static void main(String[] args) {
        SequenceList<String> sl = new SequenceList<>(3);
        sl.insert("1");
        sl.insert("2");
        sl.insert("3");
        sl.insert("4");
        System.out.println(sl);
    }
}
