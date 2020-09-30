package com.lol.util;

import java.util.*;
/**
CMUtility tool：
 Encapsulate different methods for calling without thinking of the details
*/
public class CMUtility {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * @Description Use for menu selection
     * @return the number that user type in the range of 1 - 5 
     * @Author Luna Huang
     * @Date 9/28/20
     * @Time 10:24 PM
     **/
	public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' &&
                c != '3' && c != '4' && c != '5') {
                System.out.print("Wrong selection. Please enter again：");
            } else break;
        }
        return c;
    }

    /**
     * @Description get the char that user type in
     * @return the char that user type in
     * @Author Luna Huang
     * @Date 9/29/20
     * @Time 10:40 PM
     **/
    public static char readChar() {
        String str = readKeyBoard(1, false);
        return str.charAt(0);
    }

    /**
     * @Description get the char that user type in or a default value
     * @return the char that user type in or a default value
     * @Author Luna Huang
     * @Date 9/29/20
     * @Time 10:41 PM
     **/
    public static char readChar(char defaultValue) {
        String str = readKeyBoard(1, true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }

    /**
     * @Description get the int that user type in whose length is not more than 2
     * @return the int that user type in
     * @Author Luna Huang
     * @Date 9/29/20
     * @Time 10:42 PM
     **/
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Wrong number, please enter again：");
            }
        }
        return n;
    }

    /**
     * @Description get the char that user type in whose length is not more than 2 or a default value
     * @return the char that user type in whose length is not more than 2 or a default value
     * @Author Luna Huang
     * @Date 9/29/20
     * @Time 10:44 PM
     **/
    public static int readInt(int defaultValue) {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, true);
            if (str.equals("")) {
                return defaultValue;
            }

            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * @Description get a String that user type in whose length is limited like phone number
     * @return a String that user type in whose length is limited
     * @Author Luna Huang
     * @Date 9/29/20
     * @Time 10:45 PM
     **/
    public static String readString(int limit) {
        return readKeyBoard(limit, false);
    }

    /**
     * @Description get a String that user type in whose length is limited or a default value like phone number
     * @return a String that user type in whose length is limited or a default value
     * @Author Luna Huang
     * @Date 9/29/20
     * @Time 10:46 PM
     **/
    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("")? defaultValue : str;
    }

    /**
     * @Description let user to make a confirmation using char
     * @return char 'Y' or 'N'
     * @Author Luna Huang
     * @Date 9/29/20
     * @Time 10:47 PM
     **/
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("Wrong length(No longer than " + limit + "), Please enter again!");
                continue;
            }
            break;
        }

        return line;
    }
}
