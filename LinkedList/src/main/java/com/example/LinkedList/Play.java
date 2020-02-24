package com.example.LinkedList;

public class Play {
    //Node = pointer
    int posicion;
    Song head;



    void addSong(String nombre){
        Song nuevo = new Song(nombre, posicion);

        Song last = head;
        nuevo.next = null;
        posicion++;
        if(head == null){
            head.previous = null;
            head = nuevo;
        }
        head = nuevo;

        while(last.next != null){
            last = last.next;
        }

        last.next = nuevo;

        nuevo.previous = last;
    }

    void playNow(Song nsong){
        head = nsong;
        System.out.println("Playing now "+ nsong);
    }

    void playNext(int actsong){
        Song nsong;
        nsong = head;
        Song nnsong = null;
        while(nsong != null){
            if(nsong.posicion == actsong+1){
                nsong= nnsong;
                break;
            }
            nsong = nsong.next;
        }
    }
    /*
    void playNext(Song nsong){
    nsong = nsong.next;
    head=nsong;
    }
    */

    void playPrevious(Song nsong){
        nsong = nsong.previous;
        head = nsong;
    }

    void listSongs(Song lsong){
        lsong = head;

        while(lsong != null) {
            System.out.println(lsong.nombre +"/n");
            lsong = lsong.next;
        }


    }
}
