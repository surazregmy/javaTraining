package com.javaclass.inheritance;

public class Animal {
    String sound;
    String habitat;

    public  Animal(){}

    public void playSound(){
        System.out.println("Play Sound in Animal");
    }

    public Animal(String sound, String habitat) {
        this.sound = sound;
        this.habitat = habitat;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
