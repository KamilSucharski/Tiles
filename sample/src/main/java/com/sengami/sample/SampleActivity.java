package com.sengami.sample;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;

import com.sengami.tiles.TilesView;
import com.sengami.tiles.TilesViewConfiguration;

import org.joda.time.LocalDate;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        sampleTiles();
    }

    private void sampleTiles() {
        final TilesView tilesView = findViewById(R.id.tiles_view);
        final TilesViewConfiguration configuration = new TilesViewConfiguration.Builder()
            .year(2019) // required to calculate leap year
            .tileDecorator(new SampleBinaryTileDecorator()) // determines the style of tiles
            .daysPerColumn(11) // optional - will default to 11
            .columnsPerMonth(3) // optional - will default to 3
            .build();
        tilesView.configure(configuration);
        tilesView.displayCompat(sampleDataCompat());
//        tilesView.display(sampleData());
    }

    private Map<LocalDate, Integer> sampleDataCompat() {
        final Map<LocalDate, Integer> map = new HashMap<>();

        final Calendar calendar = Calendar.getInstance();
        calendar.set(2019, 2, 2);
        final LocalDate date1 = LocalDate.fromCalendarFields(calendar);

        calendar.set(2019, 2, 3);
        final LocalDate date2 = LocalDate.fromCalendarFields(calendar);

        calendar.set(2019, 3, 14);
        final LocalDate date3 = LocalDate.fromCalendarFields(calendar);

        map.put(date1, 1);
        map.put(date2, 3);
        map.put(date3, 2);

        return map;
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private Map<java.time.LocalDate, Integer> sampleData() {
        final Map<java.time.LocalDate, Integer> map = new HashMap<>();

        final java.time.LocalDate date1 = java.time.LocalDate.of(2019, 2, 2);
        final java.time.LocalDate date2 = java.time.LocalDate.of(2019, 2, 3);
        final java.time.LocalDate date3 = java.time.LocalDate.of(2019, 3, 14);

        map.put(date1, 1);
        map.put(date2, 3);
        map.put(date3, 2);

        return map;
    }
}
