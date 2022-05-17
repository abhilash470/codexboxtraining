package javatraining.stringbufferex;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("StringBuffer is mutable.");
        StringBuffer str1 = new StringBuffer("");
        System.out.println(str);
        str.append("stringBuffer is rewritable.");
        int num = str.lastIndexOf("is",30);

        String[] s= str.toString().split(" ");
        System.out.println(" to string "+s[2]);
        int length =str.indexOf("is") ;

        System.out.println("index is: "+length);
        int length2= str.indexOf("s");

        str.replace(length,length2+1,"");
        System.out.println("after replacing:"+str);

        //capacity
        System.out.println("capacity is "+str.capacity());
        //append
        System.out.println(str.append(str1));
        //delete
        System.out.println("delete "+str.delete(1,3));
        //deleteCharAt
        System.out.println(str.deleteCharAt(1));
        //codePointAt will give ascii value of letter, what you give index.
        System.out.println(str.codePointAt(1));
        //charAt
        System.out.println(str.charAt(8));
        //
        //System.out.println(str.ensureCapacity());
        //insert
        System.out.println(str.insert(1,"tri"));
        //reverse
        System.out.println(str.reverse());
        System.out.println(str.lastIndexOf("m"));
        StringBuilder sb=new StringBuilder();
        System.out.println("String builder output is: "+" ");
        System.out.println(sb.append("I am Fullstack web developer"));
    }
}
