package com.kodilla.patterns.strategy.social.publisher;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String showSocial() {

        System.out.println("Facebook");
        return "Facebook";
    }
}

  /*  W katalogu src/main/java utwórz pakiet com.kodilla.patterns.strategy.social.
        Utwórz klasę User, zawierającą nazwę użytkownika.
        Utwórz dziedziczące z niej klasy Millenials, YGeneration oraz ZGeneration.
        Stwórz interfejs SocialPublisher, zawierający metodę share().
        Stwórz implementujące go klasy FacebookPublisher, TwitterPublisher oraz SnapchatPublisher
        — niech wyświetlają nazwę medium społecznego, którego używają.
        Zastosuj wzorzec Strategy do klas User oraz klas dziedziczących z tej klasy:
        w konstruktorze ustaw dla danej kategorii użytkownika odpowiednie medium społecznościowe,
        a w klasie User dodaj metodę sharePost().
        W katalogu src/test/java stwórz pakiet com.kodilla.patterns.strategy.social.
        Utwórz zestaw testów UserTestSuite, a w nim dwa testy: testDefaultSharingStrategies()
        oraz testIndividualSharingStrategy() sprawdzające, czy domyślnie utworzone obiekty generujące wpisy
        w mediach społecznościowych są poprawne, a także, czy możliwa jest indywidualna zmiana upodobań użytkownika.*/