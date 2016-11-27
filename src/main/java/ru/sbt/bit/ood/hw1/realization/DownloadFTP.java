package ru.sbt.bit.ood.hw1.realization;

import org.apache.commons.net.ftp.FTPClient;
import ru.sbt.bit.ood.hw1.model.Downloader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Devjiu on 13.10.2016.
 */
public class DownloadFTP implements Downloader {

    //returns path to downloaded file
    @Override
    public String download() {
        System.out.println("Downloading has started...");
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect("localhost", 8090);
            ftpClient.login("foo", "password");
            File tempFile = File.createTempFile("trades", "download");
            OutputStream out = new FileOutputStream(tempFile);
            ftpClient.retrieveFile("public/prod/trades.csv", out);
            out.close();
            System.out.println("Successful download.\n");
            return tempFile.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not download the file");
        }
    }

}
