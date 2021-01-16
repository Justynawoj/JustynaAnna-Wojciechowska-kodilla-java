package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {

    private String bun;
    private String sauce;
    private int burgers;
    private List<String> ingedients = new ArrayList<>();


    public Bigmac(String bun, String sauce, int burgers, List<String> ingedients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingedients = ingedients;
    }

    static class BigmacBuilder {
        private String bun;
        private String sauce;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();

        private List<String> availableIngredients = new ArrayList<>(Arrays.asList("sałata", "cebula", "bekon", "ogórek", "papryczki chilli", "pieczarki", "krewetki", "ser"));

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder burgers(int burgersQuantity) {
            this.burgers = burgersQuantity;
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {

            if (bun.length() == 0) {
                throw new IllegalStateException("There is no bun");
            }
            if (!(bun.equalsIgnoreCase("bun") || bun.equalsIgnoreCase("roll"))) {
                throw new IllegalStateException("Wrong type of bun");
            }

            if (sauce.length() == 0) {
                throw new IllegalStateException("There is no sauce");
            }
            if (!(sauce.equalsIgnoreCase("standard") || sauce.equalsIgnoreCase("1000 wysp") || sauce.equalsIgnoreCase("barbecue"))) {
                throw new IllegalStateException("Wrong type of sauce");
            }

            if (ingredients.size() == 0) {
                throw new IllegalStateException("No ingredient chosen");
            }
            for (String chosenIngedient : ingredients) {
                if (!availableIngredients.contains(chosenIngedient)) {
                    throw new IllegalStateException("No such ingredient: " + chosenIngedient);
                }
            }
            return new Bigmac(bun, sauce, burgers, ingredients);
        }
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngedients() {
        return ingedients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingedients=" + ingedients +
                '}';
    }

}
