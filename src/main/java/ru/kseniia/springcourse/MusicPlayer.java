package ru.kseniia.springcourse;
// зависит от нащей музыки  применим инверсию управления
public class MusicPlayer {
    private Music music; // в качестве зависимости интерфейс

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public MusicPlayer(){} // созд конструктор без аргументов

    public void setMusic(Music music){ // созд сеттер. spring видит не setMusic а music
        this.music = music;
    }
    // получим песню
    public  void playMusic(){
        System.out.println("Playing " + music.getSong());
    }
}
