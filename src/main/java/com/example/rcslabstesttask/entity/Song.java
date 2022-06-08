package com.example.rcslabstesttask.entity;


import com.opencsv.bean.CsvBindByName;

public class Song {
    @CsvBindByName(column = "artist")
    private String artist;

    @CsvBindByName(column = "song")
    private String song;

    @CsvBindByName(column = "duration_ms")
    private int duration_ms;

    @CsvBindByName(column = "explicit")
    private boolean explicit;

    @CsvBindByName(column = "year")
    private int year;

    @CsvBindByName(column = "popularity")
    private int popularity;

    @CsvBindByName(column = "danceability")
    private double danceability;

    @CsvBindByName(column = "energy")
    private double energy;

    @CsvBindByName(column = "key")
    private int key;

    @CsvBindByName(column = "loudness")
    private double loudness;

    @CsvBindByName(column = "mode")
    private int mode;

    @CsvBindByName(column = "speechiness")
    private double speechiness;

    @CsvBindByName(column = "acousticness")
    private double acousticness;

    @CsvBindByName(column = "instrumentalness")
    private double instrumentalness;

    @CsvBindByName(column = "liveness")
    private double liveness;

    @CsvBindByName(column = "valence")
    private double valence;

    @CsvBindByName(column = "tempo")
    private double tempo;

    @CsvBindByName(column = "genre")
    private String genre;

    public Song() {
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public int getDuration_ms() {
        return duration_ms;
    }

    public void setDuration_ms(int duration_ms) {
        this.duration_ms = duration_ms;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public double getDanceability() {
        return danceability;
    }

    public void setDanceability(double danceability) {
        this.danceability = danceability;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public double getLoudness() {
        return loudness;
    }

    public void setLoudness(double loudness) {
        this.loudness = loudness;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public double getSpeechiness() {
        return speechiness;
    }

    public void setSpeechiness(double speechiness) {
        this.speechiness = speechiness;
    }

    public double getAcousticness() {
        return acousticness;
    }

    public void setAcousticness(double acousticness) {
        this.acousticness = acousticness;
    }

    public double getInstrumentalness() {
        return instrumentalness;
    }

    public void setInstrumentalness(double instrumentalness) {
        this.instrumentalness = instrumentalness;
    }

    public double getLiveness() {
        return liveness;
    }

    public void setLiveness(double liveness) {
        this.liveness = liveness;
    }

    public double getValence() {
        return valence;
    }

    public void setValence(double valence) {
        this.valence = valence;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", song='" + song + '\'' +
                ", duration_ms=" + duration_ms +
                ", explicit=" + explicit +
                ", year=" + year +
                ", popularity=" + popularity +
                ", danceability=" + danceability +
                ", energy=" + energy +
                ", key=" + key +
                ", loudness=" + loudness +
                ", mode=" + mode +
                ", speechiness=" + speechiness +
                ", acousticness=" + acousticness +
                ", instrumentalness=" + instrumentalness +
                ", liveness=" + liveness +
                ", valence=" + valence +
                ", tempo=" + tempo +
                ", genre='" + genre + '\'' +
                '}';
    }
}
