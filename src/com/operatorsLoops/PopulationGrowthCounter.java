package com.operatorsLoops;

public class PopulationGrowthCounter {

    public static void main(String[] args) {

        int population = 10000000;
        int born = 14;
        int death = 8;
        int growthLevel = born - death;
        for(int i = 1; i <= 10; i++){
            population += population * growthLevel / 1000;
        }
        System.out.println(population);
    }
}
