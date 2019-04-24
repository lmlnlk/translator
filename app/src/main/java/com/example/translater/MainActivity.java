package com.example.translater;

import android.os.Binder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;

    private final String KEY = "trnsl.1.1.20190422T195942Z.d24394819e8c054e.843bc8ffd11ed5f4f41ec942c8b7392e68c33a77";

    private final String URL = "https://translate.yandex.net/";

    private Gson gson = new GsonBuilder().create();
    private Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(URL)
            .build();

    private Api api = retrofit.create(Api.class);


    private void update() {
        retrofit.create(Api.class);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextField);
        textView = (TextView) findViewById(R.id.translateText);
        button = (Button) findViewById(R.id.traslateBtn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Map<String, String> map = new HashMap<>();
//                map.put("key",KEY);
//                map.put("text", editText.getText().toString());
//                map.put("lang", "en-ru");
//
//                Call<Object> call = api.translate(map);
//
//                try {
//                    Response<Object> response = call.execute();
//
//                    Map<String, String> mapResp = gson.fromJson(response.body().toString(), Map.class);
//                    for(Map.Entry e : mapResp.entrySet()){
//                        System.out.println(e.getKey()+" "+e.getValue());
//                    }
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }

            }
        });

    }

}
