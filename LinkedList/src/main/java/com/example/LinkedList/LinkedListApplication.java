package com.example.LinkedList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class LinkedListApplication {

	Play playingtest = new Play();

	@RequestMapping("/addSong")
	public void addSong(){
		playingtest.addSong("Name1");
		playingtest.listSongs(playingtest.head);
	}

	@RequestMapping("/playNow")
	public void playNow(){
		playingtest.addSong("Name2");
		playingtest.addSong("Name3");
		playingtest.playNow(playingtest.head);
		//playingtest.listSongs(playingtest.head);
	}

	@RequestMapping("/playNext")
	public void playNext(){
		playingtest.addSong("Name4");
		playingtest.addSong("Name5");
		playingtest.addSong("Name6");
		playingtest.playNext(1);

	}

	@RequestMapping("playPrevious")
	public void playPrevious(){
		playingtest.addSong("Name7");
		playingtest.addSong("Name8");
		playingtest.addSong("Name9");
		playingtest.playPrevious(playingtest.head);
		//playingtest.listSongs(playingtest.head);
	}

	@RequestMapping("/listSongs")
	public void listSongs(){
		playingtest.addSong("Name10");
		playingtest.addSong("Name11");
		playingtest.addSong("Name12");
		playingtest.listSongs(playingtest.head);

	}

	public static void main(String[] args) {
		SpringApplication.run(LinkedListApplication.class, args);
	}

}
