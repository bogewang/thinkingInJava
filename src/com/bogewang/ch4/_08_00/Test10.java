package com.bogewang.ch4._08_00;

import org.junit.Test;

/**
 * 找出所有的4位数的吸血鬼数字;
 */
public class Test10 {

    @Test
    public void test() {
        for (int i=10; i<100; i++){
          for (int j=10; j<100; j++){
              int result = i * j;
              if (result % 100 != 0 && result>1000) {
                  printNumber(result, i, j);
              }
          }
        }
    }


    /**
     * 判断是否为吸血鬼数;
     */
    public void printNumber(int result, int number1, int number2){
        String resultStr = result + "";
        String num1 = number1 + "";
        String num2 = number2 + "";
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();

        resultStr = replaceStr(resultStr, chars1);
        resultStr = replaceStr(resultStr, chars2);

        if ("".equals(resultStr)) {
            System.out.println(result + " = " + number1 + " * " + number2);
        }

    }

    /**
     * 从resultstr删除chars1的字符;
     * @param resultStr
     * @param chars1
     */
    private String replaceStr(String resultStr, char[] chars1) {
        for (int i=0; i<chars1.length; i++){
            if(resultStr.indexOf(chars1[i]) >= 0){
                resultStr = resultStr.replaceFirst(chars1[i] + "", "");
            }
        }
        return resultStr;
    }

}
