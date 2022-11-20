package com.sda.bogdanoloeriu.advance.coding.collection.ex8;

import java.util.LinkedList;

/**
 * Ex 8
 *         Create a class imitating a weapon magazine.
 *         The class should be able to define the size of the magazine using the constructor.
 *         Implement the methods:
 *         loadBullet(String bullet) → adding a cartridge to the magazine, does not allow loading more cartridges than
 *         the capacity of the magazine
 *         isLoaded() → returns information about whether the weapon is loaded (at least one cartridge) or not
 *         shot() → each call shots one bullet (prints string value in console) - the last loaded cartridge - and prepares the next one,
 *         loaded before the last one, if there are no more cartridges, it prints "empty magazine" in the console
 */


public class WeaponMagazine {

    private final int maxSize; //il initializam in constructor
    private final LinkedList<String> bullets = new LinkedList<>();

    public WeaponMagazine(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void loadBullet(String bullet){
        if(bullets.size() < maxSize){
            bullets.addLast(bullet);
        }else{
            System.out.println("Max size" + maxSize + " reached!");
        }
    }

    public Boolean isLoaded(){
//        if(bullets.isEmpty()){
//            return false;
//        }
//        return true;
         return !bullets.isEmpty();  //este echivalent cu toata metoda
    }

    public void shot(){
        if( isLoaded()){
            System.out.println("Empty magazine!");
        }else{
            System.out.println(bullets.removeFirst());  //daca pun get, o sa ramana primul mereu in cartus, cu remove il returneaza, dar il si scoate
        }
    }
}
