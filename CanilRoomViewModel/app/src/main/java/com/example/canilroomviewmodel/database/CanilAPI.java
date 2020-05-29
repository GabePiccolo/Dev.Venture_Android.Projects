package com.example.canilroomviewmodel.database;

import com.example.canilroomviewmodel.model.Canil;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CanilAPI {

    @GET("{id}")
    Call<Canil> getCanilId(@Path("id") int id);
}
