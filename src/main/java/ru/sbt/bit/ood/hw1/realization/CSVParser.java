package ru.sbt.bit.ood.hw1.realization;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import ru.sbt.bit.ood.hw1.model.Parser;
import ru.sbt.bit.ood.hw1.model.Trade;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Devjiu on 13.10.2016.
 */
public class CSVParser implements Parser {

    @Override
    public List<Trade>  parse(String filename) {
        System.out.println("Parsing has started...");
        try {
            Reader in = new FileReader(filename);
            List<Trade> records = new ArrayList<>();

            for (CSVRecord tradeRecord:  CSVFormat.EXCEL.parse(in)) {
                records.add(new Trade(tradeRecord.toMap()));
            }
            System.out.println("Successful parsing.\n");
            return records;

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("There was an error while parsing CSV file");
        }
    }
}
