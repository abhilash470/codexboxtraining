package javatraining.stringexamples;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class Methods {
    public static void main(String[] args) {
        String str="welcome to java world.";
        String str2 = "welcome to oops";
        String str3=str.concat(str2);
        System.out.println(str3);
        System.out.println(str.charAt(3));
    }
}
