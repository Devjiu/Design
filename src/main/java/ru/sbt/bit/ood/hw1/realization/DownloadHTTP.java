package ru.sbt.bit.ood.hw1.realization;

import ru.sbt.bit.ood.hw1.model.Downloader;

import java.io.File;
import java.io.IOException;

/**
 * Created by Devjiu on 27.11.2016.
 */
public class DownloadHTTP implements Downloader{

    @Override
    public String download() {
        System.out.println("Downloading has started...");
        File tempFile = null;
        try {
            tempFile = File.createTempFile("trades", "download");
        } catch (IOException e) {
            System.out.println("IO exception during HTTP download");
            e.printStackTrace();
        }
        System.out.println("Successful downloading.\n");
        return tempFile.getAbsolutePath();
    }
}
