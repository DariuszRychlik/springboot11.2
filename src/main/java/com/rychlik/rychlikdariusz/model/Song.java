package com.rychlik.rychlikdariusz.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String genre;
    private String ismn;
    private String year;


    @ManyToMany
    private Set<Artist> artists = new HashSet<>();

    public Song(String title, String genre, String ismn, String year) {
        this.title = title;
        this.genre = genre;
        this.ismn = ismn;
        this.year = year;
    }
}
