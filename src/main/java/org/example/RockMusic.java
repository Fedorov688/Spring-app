package org.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

//@Component
public class RockMusic implements Music {
    private List<String> listSong = Arrays.asList("RockSong1", "RockSong2", "RockSong3");
    @Override
    public String getSong() {
        Random random = new Random();
        return listSong.get(random.nextInt(listSong.size()));
    }
}
