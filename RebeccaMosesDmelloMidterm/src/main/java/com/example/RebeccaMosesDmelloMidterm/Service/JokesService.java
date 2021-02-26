package com.example.RebeccaMosesDmelloMidterm.Service;

import com.example.RebeccaMosesDmelloMidterm.RandomJokes;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class JokesService {

    private RandomJokes randomJokes;

    @GetMapping("")
    public List<String> getJokes(){
        return List.of(randomJokes.getRandomJokes());
    }

}
