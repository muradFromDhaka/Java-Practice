/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class TenUniqueRandomNumber {

    public static void main(String[] args) {

        Set<Integer> arr = new HashSet<>();
        for (;;) {
            int ran = (int) (Math.random() * 100);
            arr.add(ran);
            if (arr.size() == 10) {
                break;
            }
        }
        System.out.println(arr);
    }

}
