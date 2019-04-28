package com.sengami.sample;

import android.view.View;

import com.sengami.tiles.TileDecorator;

public class SampleBinaryTileDecorator implements TileDecorator {

    @Override
    public void decoratePastCell(final View view, final int number) {
        if (number > 0) {
            view.setBackgroundResource(R.drawable.background_binary_tile_highlighted);
        } else {
            view.setBackgroundResource(R.drawable.background_binary_tile_past);
        }
    }

    @Override
    public void decorateTodayCell(final View view, final int number) {
        if (number > 0) {
            view.setBackgroundResource(R.drawable.background_binary_tile_highlighted);
        } else {
            view.setBackgroundResource(R.drawable.background_binary_tile_past);
        }
    }

    @Override
    public void decorateFutureCell(final View view, final int number) {
        if (number > 0) {
            view.setBackgroundResource(R.drawable.background_binary_tile_highlighted);
        } else {
            view.setBackgroundResource(R.drawable.background_binary_tile_future);
        }
    }
}
