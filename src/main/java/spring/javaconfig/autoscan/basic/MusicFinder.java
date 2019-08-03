package spring.javaconfig.autoscan.basic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("musicFinder")
public class MusicFinder {

    public List<String> findMusic() {
        return Arrays.asList("Pop", "Rock", "Jazz");
    }
}
