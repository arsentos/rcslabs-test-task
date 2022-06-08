package com.example.rcslabstesttask.service;

import com.example.rcslabstesttask.entity.Song;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Service
public class StatsService {
    public List<Song> getInt() throws FileNotFoundException {
        Reader reader = new BufferedReader(new FileReader("D:\\programming\\rcslabs-test-task\\src\\main\\resources\\static\\songs_normalize.csv"));
        CsvToBean<Song> csvReader = new CsvToBeanBuilder(reader)
                .withType(Song.class)
                .withSeparator(',')
                .withIgnoreLeadingWhiteSpace(true)
                .withIgnoreEmptyLine(true)
                .build();
        List<Integer> list = new ArrayList<>();
        List<Song> songList = csvReader.parse();

        return songList;
    }

    public static int percentile(List<Integer> latencies) {
        int index = (int) Math.ceil(10.0 * latencies.size());
        return latencies.get(index-1);
    }

}
