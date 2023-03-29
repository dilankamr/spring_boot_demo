package com.lellzapps.interview_spring_boot.service;

import com.lellzapps.interview_spring_boot.model.Continent;
import com.lellzapps.interview_spring_boot.model.Character;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class CommonService {

    @Value("${app.character.endpoint}")
    String urlGetCharacter;

    @Value("${app.continents.endpoint}")
    String urlGetContinent;

    List<Character> characterList = new LinkedList<>();
    Map<Integer, Continent> continentMap = new HashMap<>();


    @PostConstruct
    private void initAllCharacterContinent()
    {
        getAllCharacters();
        getAllContinent();
    }

    private void getAllCharacters()
    {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Character[]> response = restTemplate.getForEntity(urlGetCharacter, Character[].class);
        Character[] characters = response.getBody();

        this.characterList = Arrays.asList(characters);
    }

    private void getAllContinent()
    {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Continent[]> response = restTemplate.getForEntity(urlGetContinent, Continent[].class);
        Continent[] continents = response.getBody();

        for(Continent continent: continents)
        {
            this.continentMap.put(continent.getId(), continent);
        }
    }
}
