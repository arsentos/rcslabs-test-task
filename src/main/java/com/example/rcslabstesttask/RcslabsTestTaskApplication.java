package com.example.rcslabstesttask;

import com.example.rcslabstesttask.entity.Song;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

@SpringBootApplication
public class RcslabsTestTaskApplication {

    public static void main(String[] args) {

        SpringApplication.run(RcslabsTestTaskApplication.class, args);
    }

}
