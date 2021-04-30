package com.example.iot_irrigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText_username,editText_password;
    Button button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_username = findViewById(R.id.username);
        editText_password = findViewById(R.id.password);
        button_login = findViewById(R.id.login);

        button_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:
                String password = editText_password.getText().toString();
                String username = editText_username.getText().toString();

                if(!username.isEmpty() && !password.isEmpty()){
                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("https://m6b760b9.en.emqx.cloud:8443/api/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();

                    JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

                    Call<Init> call = jsonPlaceHolderApi.setInit(username);

                    call.enqueue(new Callback<Init>() {
                        @Override
                        public void onResponse(Call<Init> call, Response<Init> response) {
                            if(response.isSuccessful()){
                                Toast.makeText(getApplicationContext(),"Username created",Toast.LENGTH_SHORT).show();
                                Log.d("Auth message : ","username created successfully \n\n\n\n\n");
                                Init details = response.body();
                                Log.d("username : ",details.getClientId());
                                Log.d("\npassword : ",details.getPassword());
                            }
                            else Log.d("Auth message : ","username created unsuccessfully \n\n\n\n\n");
                        }

                        @Override
                        public void onFailure(Call<Init> call, Throwable t) {
                            Log.d("Auth message : ","username not created \n\n\n\n\n");
                        }
                    });
                }
                else
                    Toast.makeText(this,"Username and password fields cannot be left blank",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}