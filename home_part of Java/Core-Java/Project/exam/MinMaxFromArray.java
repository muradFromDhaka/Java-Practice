/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author User
 */
public class MinMaxFromArray {
    public static void main(String[] args) {
                double[] myList = {1.9, 2.9, 3.4, 3.5};
        minVal(myList, "min");
        minVal(myList, "max");
    }
    
    
        public static double minVal(double[] myList, String val) {
        double output = myList[0]; //7.2    //2.9   //1.9  //0.2

        if (val.toUpperCase().equals("MIN")) {
            for (int i = 0; i < myList.length; i++) {
                if (myList[i] < output) {
                    output = myList[i];
                }
            }
            System.out.println("Min " + output);
            return output;
        } else if (val.toUpperCase().equals("MAX")) {
            for (int i = 0; i < myList.length; i++) {
                if (myList[i] > output) {
                    output = myList[i];
                }
            }
            System.out.println("MAX " + output);
            return output;
        } else {
            return output;
        }
    }

}
