package com.example.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Playlist playlist = new Playlist();
        Play playing = new Play();
        Song song;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String newsong = input.nextLine();

            playing.addSong(newsong);
        }


        playing.listSongs(playing.head);
    }
}
