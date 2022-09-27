package in.forpay.aepslibrary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class aepsStart extends AppCompatActivity {

    private Activity activity;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = aepsStart.this;
        textView = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        String imei= intent.getStringExtra("imei");
        //textView.setText("");
        Log.d("imeiisis","fsfd"+imei);
        Toast.makeText(activity,"imei is "+imei,Toast.LENGTH_LONG).show();




    }
}
