class MilitaryExecutor 
{
    public static void main(String[] args) 
	{

        Military m = new Military();
        boolean added;

        added = m.addWeapon("Rifle"); 
		System.out.println(added);
        added = m.addWeapon("Pistol"); 
		System.out.println(added);
        added = m.addWeapon("Sniper"); 
		System.out.println(added);
        added = m.addWeapon("Machine Gun");
		System.out.println(added);
        added = m.addWeapon("Grenade"); 
		System.out.println(added);
        added = m.addWeapon("Rocket Launcher");
		System.out.println(added);
        added = m.addWeapon("Tank");
		System.out.println(added);
        added = m.addWeapon("Fighter Jet"); 
		System.out.println(added);
        added = m.addWeapon("Submarine"); 
		System.out.println(added);
        added = m.addWeapon("Missile");
		System.out.println(added);
        added = m.addWeapon("Drone"); 
		System.out.println(added);
        added = m.addWeapon("Warship"); 
		System.out.println(added);
        added = m.addWeapon("Cannon"); 
		System.out.println(added);
        added = m.addWeapon("Mortar"); 
		System.out.println(added);
        added = m.addWeapon("Helicopter"); 
		System.out.println(added);
        added = m.addWeapon("Radar System"); 
		System.out.println(added);
        added = m.addWeapon("Armored Vehicle"); 
		System.out.println(added);
        added = m.addWeapon("Shotgun");
		System.out.println(added);
        added = m.addWeapon("Laser Weapon"); 
		System.out.println(added);
        added = m.addWeapon("Ballistic Missile"); 
		System.out.println(added);
        added = m.addWeapon("Naval Gun"); 
		System.out.println(added);

        m.getWeapons();

        String weapon = m.getWeaponByName("Tank");
        System.out.println(weapon + " is available");

        boolean updated = m.updateWeapon("Drone", "Combat Drone");
        System.out.println(updated);

        m.getWeapons();

        boolean deleted = m.deleteWeapon("Grenade");
        System.out.println(deleted + " is deleted");

        m.getWeapons();
    }
}