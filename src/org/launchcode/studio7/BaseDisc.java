package org.launchcode.studio7;

import java.util.Calendar;

public abstract class BaseDisc implements OpticalDisc{
    protected String name;
    protected int storageCapacity;
    protected int runtime;
    private String mediaType;
    private int copyrightYear;

    public BaseDisc(String name, int storageCapacity, int runtime, String mediaType, int copyrightYear) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.runtime = runtime;
        this.mediaType = mediaType;
        this.copyrightYear = copyrightYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public int getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(int copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    public int age(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - this.copyrightYear;
    }
}
