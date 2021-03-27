package ru.kseniia.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //благоларя спринг контекст есть класс  считывает все бины из xml. имя такое же и  именно в папке ресорсес с метрой
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

       // создаем объект - реализует интерфейс
       Music music =  context.getBean("musicBean", Music.class );

       // внедрение зависимостей вречную в конструктор
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        // System.out.println(music.getSong());

        // обязательно закрываем
        context.close();
    }
}
