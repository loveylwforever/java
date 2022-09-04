package com.example.java.loop;

// 循环结构
public class LoopStructure {
    public static void main(String[] args) {
        int x = 10;
        // while 循环
        while( x < 20 ) {
            System.out.print("value of x : " + x + "\n");
            x++;
        }

        // do…while 循环
        do{
            System.out.print("do while value of x : " + x + "\n");
            x++;
        }while( x == 20 );

        /*for循环
            for(初始化; 布尔表达式; 更新) {
                //代码语句
            }
         */
        for(int y = 10; x < 20; x = x+1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }

        /*Java 增强 for 循环 java5+
            for(声明语句 : 表达式)
            {
               //代码句子
            }
         */
        int [] numbers = {10, 20, 30, 40, 50};
        for(int z : numbers ){
            System.out.print( z );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
    }
}
