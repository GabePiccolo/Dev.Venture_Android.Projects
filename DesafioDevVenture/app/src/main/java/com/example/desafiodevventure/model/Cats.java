package com.example.desafiodevventure.model;

import java.util.ArrayList;
import java.util.List;


public class Cats {

    List<Object> data = new ArrayList<> ();

    public Cats() {}

    public Cats(List<Object> data) {
        this.data = data;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }

    public class Object{

        private String link;

        public Object () {}

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }
    }
}
