package com.nasduck.lib;

import android.support.v4.app.FragmentActivity;

import com.nasduck.lib.builder.impl.ToastBuilder;

public class LesserPandaToast {

    public static void dismiss() {
        ToastBuilder.dismiss();
    }

    public static void dismiss(long delay) {
        ToastBuilder.dismiss(delay);
    }

    public static void show(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setText(text)
                .show();
    }

    public static void showSuccess(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_success)
                .show();
    }

    public static void showSuccess(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_success)
                .setText(text)
                .show();
    }

    public static void showWarning(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_warning)
                .show();
    }

    public static void showWarning(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_warning)
                .setText(text)
                .show();
    }

    public static void showFailure(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_failure)
                .show();
    }

    public static void showFailure(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_failure)
                .setText(text)
                .show();
    }

    public static void showLoading(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_loading)
                .setAnimation(R.anim.anim_loading_rotate)
                .show();
    }

    public static void showLoading(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_loading)
                .setAnimation(R.anim.anim_loading_rotate)
                .setText(text)
                .show();
    }
}
