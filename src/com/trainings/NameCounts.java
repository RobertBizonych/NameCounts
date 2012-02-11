package com.trainings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: Tigra
 * Date: 11.02.12
 * Time: 19:35
 * To change this template use File | Settings | File Templates.
 */
public class NameCounts {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                System.out.print("Enter name: ");
                String line = bufferedReader.readLine();
                Integer nameCounter = hashMap.get(line);
                if (line.equals("")) {
                    break;
                }
                if (nameCounter == null) {
                    nameCounter = new Integer(1);
                } else {
                    nameCounter = new Integer(nameCounter + 1);
                }
                hashMap.put(line, nameCounter);
            }
           Iterator<String> iterator = hashMap.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                int count = hashMap.get(key);
                System.out.println("Entry [" + key + "] has count " + count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
