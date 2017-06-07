package br.com.spw.pontoe.controller;

import android.app.Activity;

/**
 * Created by ferrari on 07/06/2017.
 */

public abstract class BaseActivityController<T extends Activity> {

    protected T activity;


    protected BaseActivityController(T activity){
        this.activity = activity;
    }
}

