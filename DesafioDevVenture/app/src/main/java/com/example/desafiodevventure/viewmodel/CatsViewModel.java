package com.example.desafiodevventure.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.desafiodevventure.model.Cats;
import com.example.desafiodevventure.retrofit.RetrofitConfig;

import java.util.Random;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class CatsViewModel extends ViewModel {

    RetrofitConfig retrofitConfig;

    public MutableLiveData<String> photoURL = new MutableLiveData<>();

    public void getCatPics() {

        String cats;
        cats = "cats";

        retrofitConfig.getCatsAPI().getCatsPhoto(cats)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Cats>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull Cats cats) {

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
