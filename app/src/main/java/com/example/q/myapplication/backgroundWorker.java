package com.example.q.myapplication;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Q on 13/03/18.
 */

public class backgroundWorker extends AsyncTask<String,Void,String>{
    private TextView name, id,email,DateOfbearth,PhoneNumber,code;
    private Context context;

    public backgroundWorker(String type, EditText name, EditText id,
                            EditText email, EditText dateOfbearth,
                            EditText phoneNumber, EditText code){

    }



    @Override
    protected String doInBackground(String... params) {
        String type = params[0];
        String login_url = "http://192.168.1.12/Lab/application1.php";
        if(type.equals("get")) {


        }
        return null;
    }

    protected void onPreExecute(){
    }

    public void execute(String type, EditText name, EditText id,
                        EditText email, EditText dateOfbearth,
                        EditText phoneNumber, EditText code) {
    }
}
