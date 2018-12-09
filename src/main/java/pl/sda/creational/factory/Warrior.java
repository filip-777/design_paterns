package pl.sda.creational.factory;

import pl.sda.creational.singleton.SingletonLogger;

public class Warrior {
    private final String nickname;
    private int lvl;
    private Profession profession;
    private Weapon weapon;
    private final WeaponFactory weaponFactory;

    public Warrior(String nickname, int lvl, Profession profession) {
        this.nickname = nickname;
        this.lvl = lvl;

        weaponFactory = new WeaponFactory();
        changeProfession(profession);
    }

    public void changeProfession(Profession newProfession) {
        profession = newProfession;
        weaponFactory.makeWeapon(newProfession, 20);
        SingletonLogger.getInstance().log("Changing profession to: " + newProfession);
    }


}
