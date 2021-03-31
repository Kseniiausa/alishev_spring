package ru.kseniia.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //благоларя спринг контекст есть класс  считывает все бины из xml. имя такое же и  именно в папке ресорсес с метрой
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        //убираем  больше не нужно создавать в ручную

       // Music music =  context.getBean("musicBean", Music.class ); создаем объект - реализует интерфейс
       // MusicPlayer musicPlayer = new MusicPlayer(music); внедрение зависимостей вручную в конструктор

        //теперь обращаемся к контексту для получения
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        // System.out.println(music.getSong());

        //получаем зависимости
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        // обязательно закрываем
        context.close();
    }
}
