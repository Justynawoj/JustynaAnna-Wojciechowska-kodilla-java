package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {
    BigDecimal getCost();
    String getDescription();

}

/*

    Twoim zadaniem jest zastosowanie wzorca Dekorator do stworzenia pizzy.
    Podstawowa pizza (ciasto i sos pomidorowy z serem) będzie kosztowała 15 złotych.

    Możliwe jest udekorowanie pizzy dodatkowymi składnikami i dodatkowym serem.

    Stwórz w katalogu src/main/java w pakiecie com.kodilla.patterns2.decorator.pizza
     interfejs do zamawiania pizzy oraz zestaw klas - delegat oraz dekoratory.
     Użyj swojej fantazji i apetytu podczas wybierania dostępnych dekoracji pizzy.

        Następnie w katalogu src/test/java utwórz pakiet com.kodilla.patterns2.decorator.pizza,
        a w nim zestaw testów PizzaOrderTestSuite.
        Stwórz kilka testów pokazujących kaskadowe łączenie dekoratorów.
        Testy mają prezentować cenę zamówionej pizzy oraz wyświetlać jej opis.

*/
