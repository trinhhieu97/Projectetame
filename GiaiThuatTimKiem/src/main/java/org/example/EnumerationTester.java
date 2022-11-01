package org.example;

import java.util.BitSet;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {
        public static void main(String args[]) {
        BitSet bitSet = new BitSet();
        bitSet.set(10);
        bitSet.set(11);
        bitSet.set(12);
        System.out.println(bitSet);
            bitSet.set(10);
            bitSet.set(12);
            bitSet.clear(11);

            System.out.println(bitSet.toLongArray());
        }
    }