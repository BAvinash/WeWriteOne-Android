package badramoni.avinash.cratisspace.wewriteone;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.avinashbadramoni.wewriteone.R;

public class LoadActivity extends AppCompatActivity {


    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);


        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(LoadActivity.this, FinishActivity.class);
                startActivity(i);
                finish();
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
