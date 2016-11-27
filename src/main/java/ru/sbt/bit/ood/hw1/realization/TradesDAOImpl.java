package ru.sbt.bit.ood.hw1.realization;

import ru.sbt.bit.ood.hw1.model.Trade;
import ru.sbt.bit.ood.hw1.model.TradesDAO;

import java.util.Collection;

public class TradesDAOImpl implements TradesDAO {

    @Override
    public Collection<Trade> findAll() {
        System.out.println("Try to find all in the database.\n");
        // read all records from database
        return null;
    }

    @Override
    public void deleteAll() {
        System.out.println("Try to remove all in the database.");
        // remove all records from database
    }

    @Override
    public void save(Trade trade) {
        System.out.println("Try to save all in the database.");
        // save Trade in database
    }
}
