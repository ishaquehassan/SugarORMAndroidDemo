package com.demo.sugardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.demo.sugardemo.models.Card;
import com.demo.sugardemo.models.Contacts;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Contacts.deleteAll(Contacts.class);

        Card bs = new Card("http://google.com","45656@abc.com","T1");
        bs.save();

        Contacts contacts = new Contacts("Ishaq","923452993669",bs);
        contacts.save();


        for(Contacts contact : Contacts.listAll(Contacts.class)){
            Log.e("Contact ",contact.toString());
        }

    }
}
