package com.example.java.condition;

/*
switch(expression){
    case value :
       //语句
       break; //可选
    case value :
       //语句
       break; //可选
    //你可以有任意数量的case语句
    default : //可选
       //语句
}
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        // switch 语句中的变量类型可以是： byte、short、int 或者 char。
        // 从 Java SE 7 开始，switch 支持字符串 String 类型了，同时 case 标签必须为字符串常量或字面量。
        char grade = 'C';

        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("良好");
                break;
            case 'D' :
                System.out.println("及格");
                break;
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);

        /*
        如果 case 语句块中没有 break 语句时，JVM 会依次匹配项，全都匹配不成功则返回默认 default
        如果 case 语句块中没有 break 语句时，匹配成功后，从当前 case 开始，后续所有 case 都会执行
        如果后续的 case 语句块有 break 语句则会直接跳出
         */
        int i = 1;
        switch(i){
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3"); break;
            case 4:
                System.out.println("4");
            default:
                System.out.println("default");
        }
    }
}
