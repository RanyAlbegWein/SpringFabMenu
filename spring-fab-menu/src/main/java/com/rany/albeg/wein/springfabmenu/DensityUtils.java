package com.rany.albeg.wein.springfabmenu;

import android.content.Context;

/**
 * There is no copyright on this work.
 * Use it as if you wrote it yourself.
 * Written by Rany Albeg Wein ( rany.albeg@gmail.com ) Oct 2017.
 */
final class DensityUtils {

    private DensityUtils() {
    }

    static int dp2px(Context context, float dp) {
        return Math.round(dp * context.getResources().getDisplayMetrics().density);
    }
}
