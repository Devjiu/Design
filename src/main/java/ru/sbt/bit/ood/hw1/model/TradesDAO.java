package ru.sbt.bit.ood.hw1.model;

import java.util.Collection;

/**
 * Created by Devjiu on 27.11.2016.
 */
public interface TradesDAO {
    Collection<Trade> findAll  ();
    void              deleteAll();
    void              save     (Trade trade);
}
