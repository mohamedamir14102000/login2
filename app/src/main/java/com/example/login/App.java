package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("xKWR4kF8GRsbzm1m24oKqJ6lOVz4DA9ZJw2hG6zh")
                .clientKey("gmH6FMY0mkSl991neyAclSDN6bludhU1R5OZ03re")
                .server("https://parseapi.back4app.com/")
                .build()
        );


    }
}
