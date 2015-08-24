package com.vimeo.networking;

/**
 * Abstract callback class for @param <T> type of model.
 * <p/>
 * Created by hanssena on 4/27/15.
 */
public abstract class ModelCallback<T> extends VimeoCallback<T> {

    private Class objectType;

    public ModelCallback(Class objectType) {
        this.objectType = objectType;
    }

    public Class getObjectType() {
        return this.objectType;
    }
}