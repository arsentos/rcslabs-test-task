package com.example.rcslabstesttask.controller;

import com.example.rcslabstesttask.entity.Song;
import com.example.rcslabstesttask.entity.SongField;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class StatisticsController {
    @GetMapping("/get")
    public List<Integer> getSong(@RequestParam SongField colname) throws FileNotFoundException {
        Reader reader = new BufferedReader(new FileReader("D:\\programming\\rcslabs-test-task\\src\\main\\resources\\static\\songs_normalize.csv"));
        CsvToBean<Song> csvReader = new CsvToBeanBuilder(reader)
                .withType(Song.class)
                .withSeparator(',')
                .withIgnoreLeadingWhiteSpace(true)
                .withIgnoreEmptyLine(true)
                .build();
        List<Integer> list = new ArrayList<>();
        List<Song> songList = csvReader.parse();
        switch (colname) {
            case duration_ms:
                for (Song song:
                        songList) {
                    list.add(song.getDuration_ms());
                }
                return list;
            case popularity:
                for (Song song:
                        songList) {
                    list.add(song.getPopularity());
                }
                return list;
            case year:
                for (Song song:
                        songList) {
                    list.add(song.getYear());
                }
                return list;
            case key:
                for (Song song:
                        songList) {
                    list.add(song.getKey());
                }
                return list;
        }




        for (Song song:
             songList) {
           list.add(song.getDuration_ms());
        }
        return list;
    }
}
