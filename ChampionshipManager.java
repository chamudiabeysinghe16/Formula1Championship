package com.company;

import java.io.IOException;
import java.util.LinkedList;

public interface ChampionshipManager {
    void addNewDriver(String nameOfDriver,String carManufacturer,int carNumber,String location);
    boolean deleteDriver();
    void changeDriver();
    void showStatistics();
    void displayFormula1DriverTable();
    void addRaceCompleted(LinkedList<Integer> positionArrayList);
    void saveInformation() throws IOException;


}






