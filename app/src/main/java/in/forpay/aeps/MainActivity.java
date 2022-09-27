package in.forpay.aeps;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import in.forpay.aepslibrary.AES;
import in.forpay.aepslibrary.aepsStart;

public class MainActivity extends AppCompatActivity {

    private Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        activity = MainActivity.this;
        String key="tHeApAcHe6410111";
        String text="TEeY+YukQgWzk5wbs5OBQA==";

        String encrypted= AES.getEncrypted("Arnab Cfgfv vvv",key);


        Intent intent = new Intent(activity, aepsStart.class);
        intent.putExtra("imei","12345");
        startActivity(intent);
    finish();






    }
}