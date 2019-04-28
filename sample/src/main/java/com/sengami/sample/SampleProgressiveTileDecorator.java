package com.sengami.sample;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.sengami.tiles.TileDecorator;

public class SampleProgressiveTileDecorator implements TileDecorator {

    private final Context context;

    public SampleProgressiveTileDecorator(final Context context) {
        this.context = context;
    }

    @Override
    public void decoratePastCell(final View view, final int number) {
        decorateCellAccordingOnlyToNumber(view, number);
    }

    @Override
    public void decorateTodayCell(final View view, final int number) {
        decorateCellAccordingOnlyToNumber(view, number);
    }

    @Override
    public void decorateFutureCell(final View view, final int number) {
        decorateCellAccordingOnlyToNumber(view, number);
    }

    private void decorateCellAccordingOnlyToNumber(final View view, final int number) {
        view.setBackgroundColor(ContextCompat.getColor(context, getColorForCellAccordingOnlyToNumber(number)));
    }

    private int getColorForCellAccordingOnlyToNumber(final int number) {
        switch (number) {
            case 0: return R.color.zero_entries;
            case 1: return R.color.one_entry;
            case 2: return R.color.two_entries;
            default: return R.color.three_or_more_entries;
        }
    }
}
