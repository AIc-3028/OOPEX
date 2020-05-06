package com.company;

public class Runner {

    public static void main(String[] args) {

        Guitar myGuitar = new Guitar(6, "classic");
        Guitar otherGuitar = new Guitar(6, "electric");
        SmartSpeaker googleHome = new SmartSpeaker(true, 3, "Google");
        MusicInstrument yetAnotherGuitar = new Guitar(6, "classic");
        MusicInstrument myFlute = new Flute();


        System.out.println(myGuitar.getType());
        System.out.println(otherGuitar.getType());
        System.out.println(googleHome.isSmart());


    }

}
