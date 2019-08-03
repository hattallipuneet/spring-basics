package spring.javaconfig.autoscan.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("musicRecommender")
public class MusicRecommender {

    @Autowired
    private MusicFinder musicFinder;

    public List<String> recommnedMusic() {
        return this.musicFinder.findMusic();
    }
}
