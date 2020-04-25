package app;

import java.util.Scanner;

/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0" 

Constraints:

    The given address is a valid IPv4 address.

*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String ipAddress = scan.next();
        scan.close();
        String ipAddressModified = defangIPaddr(ipAddress);
        System.out.println("Original IP: " + ipAddress + " IP Modified: " + ipAddressModified);

    }

    private static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

