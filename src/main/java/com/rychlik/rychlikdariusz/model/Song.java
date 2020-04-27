package com.rychlik.rychlikdariusz.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String genere;
    private String ismn;
    private String year;

    private String publisher;

    @ManyToMany
    private Set<Artist> artists = new HashSet<>();



    public Song() { }


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }


    public Set<Artist> getArtists() { return artists; }

    public void setArtists(Set<Artist> artists) { this.artists = artists; }


    public Song(String genere) {
        this.genere = genere;
    }

    public Song(Set<Artist> artists) {
        this.artists = artists;
    }


    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }


    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }



    public String getIsmn() {
        return ismn;
    }

    public void setIsmn(String ismn) {
        this.ismn = ismn;
    }



    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }



    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genere='" + genere + '\'' +
                ", ismn='" + ismn + '\'' +
                ", year='" + year + '\'' +
                ", publisher='" + publisher + '\'' +
                ", artists=" + artists +
                '}';
    }

}
