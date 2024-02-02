package com.bjpowernode.javase.string;

public class StringTest05 {
    public static void main(String[] args) {
        //String类当中常用方法。
        //1、（掌握）char charAt(int index)
        char c = "中国人".charAt(1);//“中国人”是一个字符串String对象。只要是对象就能“点.”
        System.out.println(c); //国

        //2、(了解)int compareTo(String anotherString)
        System.out.println("abc".compareTo("abc"));//0(等于0)前后一致
        System.out.println("abcd".compareTo("abce")); //-1（小于0）前小后大
        System.out.println("abce".compareTo("abcd")); //1（大于0）前大后小
        System.out.println("xyz".compareTo("yxz"));//-1

        //3、（掌握）boolean contains(CharSequence s)
        //判断前面的字符串中是否包含后面的子字符串。
        System.out.println("helloWorld.java".contains(".java")); //true
        System.out.println("http://www.baidu.com".contains("https://")); //false


        //4、(掌握)boolean endsWith(String suffix)
        //判断当前字符串是否以某个字符串结尾
        System.out.println("test.txt".endsWith(".txt"));//true
        System.out.println("fsafsafsafdssad".endsWith("ad"));//true

        //5、(掌握) boolean equals(Object anObject)
        //比较两个字符串必须使用equals方法，不能使用“==”
        //equals方法有没有调用compareTo方法？老版本可以看一下。JDK13中并没有调用compareTo()方法。
        System.out.println("abc".equals("abc"));//true

        //6、(掌握)boolean equalsIgnoreCase(String anotherString)
        //判断两个字符串是否相等，并且同时忽略大小写。
        System.out.println("ABC".equalsIgnoreCase("abC"));//true

        //7、(掌握)byte[] getBytes()
        //将字符串对象转换成字节数组
        byte[] bytes ="abcdef".getBytes();
        for (int i=0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }
        
        //8、(掌握)int indexof(String str)
        //判断某个子字符串在当前字符串中第一次出现处的索引(下标)。
        System.out.println("oraclejavac++.netc#phppython".indexOf("java"));//6

        //9、(掌握)boolean isEmpty()
        //判断某个字符串是否为空字符串。
        String s = "";
        System.out.println(s.isEmpty()); //true
        String s1 = "a";
        System.out.println(s1.isEmpty());//false

        //10、（掌握）int length()
        //面试题：判断数组长度和判断字符串长度不一样
        //判断数组长度是length属性，判断字符串长度是length()方法。
        System.out.println("abc".length());//3

        //11、(掌握)int lastIndexOf(String str)
        //判断某个字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("orraclejavaC++javapythonjava".lastIndexOf("java")); //24

        //12、(掌握)String replace(charSequence target,CharSequence replacement)
        //替换。
        //String的父接口就是：charSequence
       String newStr =  "http://www.baidu.com".replace("http://", "https://");
        System.out.println(newStr);
        String newStr2 = "name=zhangsan&password=123&age=20".replace("=", ":");
        System.out.println(newStr2);

        //13、(掌握)String[] split(String regax)
        //拆分字符串
        String[] newStr3 = "1980-10-11".split("-");
        for (int i =0 ; i<newStr3.length;i++){
            System.out.print(newStr3[i]+"   ");
        }
        System.out.println();
        String param  = "name=zhangsan&password=123&age=20";
        String[] params=param.split("&");
        for (int i=0;i<params.length;i++){
            System.out.println(params[i]);
        }

        //14、(掌握)boolean startWith(String prefix)
        //判断某个字符串是否以某个子字符串开始
        System.out.println("http://www.baidu.com".startsWith("http"));//true
        System.out.println("http://www.baidu.com".startsWith("https"));//false

        //15、(掌握)String substring(int beginIndex)
        //截取字符串
        System.out.println("http://www.baidu.com".substring(7));//www.baidu.com

        //16、（掌握）String substring(int beginIndex,int endIndex)
        //beginIndex是起始位置（包括）
        //endIndex是结束位置（不包括）
        System.out.println("http://www.baidu.com".substring(7,10));//www

        //17、（掌握）char[] toCharArray()
        //将字符串转换成char数组
        char[] chars = "我是中国人".toCharArray();
        for (int i =0;i<chars.length;i++){
            System.out.println(chars[i]);
        }

        //18、(掌握)String toLowerCase()
        //转换为小写。
        System.out.println("ABxxdADSFsd".toLowerCase());

        //19、(掌握)String toUpperCase()
        System.out.println("AASFxvxcvsdfA".toUpperCase());

        //20、(掌握)String trim();
        //去除字符串前后空白
        System.out.println("    hello   world   ".trim());//hello   world

        //21、(掌握)String中只有一个方法是静态的，不需要new对象。
        //这个方法叫做valueOf
        //作用：将“非字符串”转换成字符串
        String string= String.valueOf(new Customer());
        System.out.println(string);//我是一个Vip客户！！！！
    }
}

class Customer{
  //重写toString()方法

    @Override
    public String toString() {
        return "我是一个Vip客户！！！！";
    }
}
