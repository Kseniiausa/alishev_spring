package ru.kseniia.springcourse;
// зависит от нащей музыки  применим инверсию управления
public class MusicPlayer {
    private Music music; // в качестве зависимости интерфейс

    // IoC
    public MusicPlayer(Music music) { //передаем зависимости
        this.music = music;
    }
    // получим песню
    public  void playMusic(){
        System.out.println("Playing " + music.getSong());
    }
}
