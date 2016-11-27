package ru.sbt.bit.ood.hw1.model;
import java.util.List;

public class TradesJob {
    private final TradesDAO  tradesDAO;
    private final Parser     parser;
    private final Downloader downloader;

    public TradesJob(TradesDAO tradesDAO, Parser parser, Downloader downloader) {
        this.tradesDAO  = tradesDAO;
        this.parser     = parser;
        this.downloader = downloader;
    }

    private void updateTrades(List<Trade> trades) {
        System.out.println("Updating trades dao.");
        tradesDAO.deleteAll();
        trades.forEach(tradesDAO::save);
    }

    public void run() {
        try {
            String pathToFile = downloader.download();
            List<Trade> tradeRecords = parser.parse(pathToFile);
            updateTrades(tradeRecords);
        }catch (Exception e){
            e.getMessage();
            System.out.println("Something happened.");
        }
    }

}
