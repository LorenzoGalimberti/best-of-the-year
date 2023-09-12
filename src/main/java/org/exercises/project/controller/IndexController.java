package org.exercises.project.controller;

import java.util.ArrayList;
import java.util.List;
import org.exercises.project.model.Movie;
import org.exercises.project.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(Model model){
        String myName = "Lorenzo Galimberti";
        model.addAttribute("subtitle", myName);

        return "homepage";
    }

    @GetMapping("/movies")
    public String movies(Model model){
        List<Movie> movieList = getMovieList();
        model.addAttribute("movies", movieList);

        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model){
        List<Song> songList = getSongList();
        model.addAttribute("songs", songList);

        return "songs";
    }

    // metodo private lista film
    private List<Movie> getMovieList(){
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1, "The Shawshank Redemption"));
        movies.add(new Movie(2, "The Godfather"));
        movies.add(new Movie(3, "Pulp Fiction"));
        movies.add(new Movie(4, "The Dark Knight"));
        movies.add(new Movie(5, "Schindler's List"));
        movies.add(new Movie(6, "Forrest Gump"));
        movies.add(new Movie(7, "The Matrix"));
        movies.add(new Movie(8, "Inception"));
        movies.add(new Movie(9, "The Lord of the Rings: The Fellowship of the Ring"));
        movies.add(new Movie(10, "Star Wars: Episode IV - A New Hope"));
        movies.add(new Movie(11,"Once Upon a Time in America"));


        return movies;
    }


    // metodo private lista film
    private List<Song> getSongList(){
        List<Song> songs = new ArrayList<>();

        songs.add(new Song(1, "Wish You Were Here"));
        songs.add(new Song(2, "Bohemian Rhapsody"));
        songs.add(new Song(3, "Hotel California"));
        songs.add(new Song(4, "Imagine"));
        songs.add(new Song(5, "Stairway to Heaven"));
        songs.add(new Song(6, "Smells Like Teen Spirit"));
        songs.add(new Song(7, "Yesterday"));
        songs.add(new Song(8, "Billie Jean"));
        songs.add(new Song(9, "Rolling in the Deep"));
        songs.add(new Song(10, "Purple Haze"));


        return songs;
    }
}


