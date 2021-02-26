package com.example.RebeccaMosesDmelloMidterm.Entity;

import com.example.RebeccaMosesDmelloMidterm.RandomJokes;
import com.example.RebeccaMosesDmelloMidterm.Service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Objects;

public class Model {

    private String joke;

    private RandomJokes randomJokes = new RandomJokes();

    public Model() {
        this.joke = randomJokes.getRandomJokes();
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public RandomJokes getRandomJokes() {
        return randomJokes;
    }

    public void setRandomJokes(RandomJokes randomJokes) {
        this.randomJokes = randomJokes;
    }

    @Override
    public String toString() {
        return joke;
    }

}