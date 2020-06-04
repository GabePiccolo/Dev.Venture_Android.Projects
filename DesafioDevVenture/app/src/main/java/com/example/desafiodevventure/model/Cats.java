package com.example.desafiodevventure.model;

import java.util.ArrayList;

public class Cats {

    ArrayList< Object > data = new ArrayList < Object > ();
    private boolean success;
    private float status;


    // Getter Methods

    public boolean getSuccess() {
        return success;
    }

    public float getStatus() {
        return status;
    }

    // Setter Methods

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setStatus(float status) {
        this.status = status;
    }
}
