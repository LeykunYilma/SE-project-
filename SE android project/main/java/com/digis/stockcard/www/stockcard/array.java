package com.digis.stockcard.www.stockcard;

import java.util.ArrayList;

/**
 * Created by john on 3/22/18.
 */

public class array {
    static ArrayList<String> itemNameArray = new ArrayList(

    );
    static ArrayList<String> itemAmountArray = new ArrayList();
 static String AddItemName(String itemName){
     itemNameArray.add(itemName);
     return itemName;
 }
 static String AddItemAmount(String itemAmount){
     itemAmountArray.add(itemAmount.toString());
     return itemAmount;
 }
 static ArrayList<String> ViewItemName(){
     return itemNameArray;
 }
 static ArrayList<String> ViewItemAmount(){
     return itemAmountArray;
 }
}
