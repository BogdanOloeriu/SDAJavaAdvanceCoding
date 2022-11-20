package com.sda.bogdanoloeriu.advance.coding.collection.ex8;

public class Main {

    public static void main(String[] args) {


        WeaponMagazine weaponMagazine = new WeaponMagazine(8);
        weaponMagazine.loadBullet("Bullet1");
        weaponMagazine.loadBullet("Bullet1");
        weaponMagazine.loadBullet("Bullet1");
        weaponMagazine.loadBullet("Bullet1");
        weaponMagazine.loadBullet("Bullet1");
        weaponMagazine.loadBullet("Bullet1");
        weaponMagazine.loadBullet("Bullet1");
        weaponMagazine.loadBullet("Bullet1");
        weaponMagazine.loadBullet("Bullet1");
        System.out.println(weaponMagazine.isLoaded());
        weaponMagazine.shot();

    }
}
