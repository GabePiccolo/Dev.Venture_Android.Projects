package com.example.desafiodevventure.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.desafiodevventure.model.Cats;
import com.example.desafiodevventure.retrofit.RetrofitConfig;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class CatsViewModel extends ViewModel {

    RetrofitConfig retrofitConfig;

    public MutableLiveData<String> photoURL = new MutableLiveData<>();

    public void getCatPics(){


        retrofitConfig.getCatsAPI().getCatsPhoto()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Cats>() {
                    @Override
                    public void accept(Cats cats) throws Throwable {
                        String receivePhotoUrl = cats.getSuccess();
                        photoURL.setValue(receivePhotoUrl);
                    }
                });

    }

}
