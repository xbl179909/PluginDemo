package com.xbl.plugin;

class PersonExt {
    String name
    int age
    boolean boy

    public String toString() {
        return "I am $name,$age years old," + (boy ? "I am a boy" : "I am a girl")
    }
}
