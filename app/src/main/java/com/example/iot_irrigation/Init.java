package com.example.iot_irrigation;

import com.google.gson.annotations.SerializedName;

public class Init {
        @SerializedName("password")
        String password;

        @SerializedName("clientId")
        String clientId;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}




