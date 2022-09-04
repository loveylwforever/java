package com.example.java.basic.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String origin = "my name is jamie.gao.";
        String pattern = "my name is jamie gao";
        boolean isMatch = Pattern.matches(pattern, origin);
        System.out.println("字符串是否一致 ：" + isMatch);

        String patternContain = ".*gao*.";

        boolean isMatchContain = Pattern.matches(patternContain, origin);
        System.out.println("字符串是否包含 ：" + isMatchContain);

        //文本信息
        String content = "Linux，全称GNU/Linux，是一种免费使用和自由传播的类UNIX操作系统，" +
                "其内核由林纳斯·本纳第克特·托瓦兹于1991年10月5日首次发布，它主要受到Minix和Unix" +
                "思想的启发，是一个基于POSIX的多用户、多任务、支持多线程和多CPU的操作系统。它能运行" +
                "主要的Unix工具软件、应用程序和网络协议。它支持32位和64位硬件。Linux继承了Unix" +
                "以网络为核心的设计思想，是一个性能稳定的多用户网络操作系统。Linux有上百种不同的发行版，" +
                "如基于社区开发的debian、archlinux，和基于商业开发的" +
                "Red Hat Enterprise Linux、SUSE、Oracle Linux等。\n" +
                "2021年6月，根据Linux 5.14刚刚进入合并队列的char-misc-next提交，" +
                "Linux 5.14正式移除了RAW驱动";

        //找出其中的全部英语单词
        //找出百度热搜的标题：(///S*)
        //传统方法：使用遍历方式，代码量大，效率不高
        //正则表达式：
        /*
         * 1,先创建一个Pattern对象，模式对象，可以理解成一个正则表达式对象
         * 2,创建一个匹配器对象
         * 3,开始循环匹配
         */
        Pattern patter = Pattern.compile("([0-9]+)|([a-zA-Z]+)");
        //匹配数字时，[0-9]
        //数字+英文单词 ([0-9]+)|([a-zA-Z]+)
        //按照patter（模式/样式）。到content文本中匹配，找到true。否false
        Matcher matcher = patter.matcher(content);
        while (matcher.find()) {
            //匹配内容，文本放到matcher.group(); 中
            System.out.println("找到：" + matcher.group(0));
        }
    }
}
