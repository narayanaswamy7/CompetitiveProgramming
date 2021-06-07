package com.ns.cp.leetcode;

import java.awt.*;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        System.out.println(defandIPaddr1("1.1.1.1"));
    }

    public static String defandIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static String defandIPaddr1(String address) {
        StringBuilder builder = new StringBuilder();
        for (char c : address.toCharArray()) {
            builder.append(c == '.' ? "[.]" : c);
        }
        return builder.toString();
    }
}
