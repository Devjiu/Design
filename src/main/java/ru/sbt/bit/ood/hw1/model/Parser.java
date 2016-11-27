package ru.sbt.bit.ood.hw1.model;
import java.util.*;

/**
 * Created by Devjiu on 27.11.2016.
 */
public interface Parser {
    //parse downloaded file into trades
    List<Trade>  parse(String pathToFile);
}
