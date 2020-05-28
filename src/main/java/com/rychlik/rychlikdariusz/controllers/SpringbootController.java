package com.rychlik.rychlikdariusz.controllers;


import com.rychlik.rychlikdariusz.commands.ArtistCommand;
import com.rychlik.rychlikdariusz.converters.ArtistCommandToArtist;
import com.rychlik.rychlikdariusz.model.Artist;
import com.rychlik.rychlikdariusz.repositories.ArtistRepository;
import com.rychlik.rychlikdariusz.repositories.SongRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class SpringbootController {

    @RequestMapping(value = {"/"})
    public String getArtists() {
        return "index";
    }

}