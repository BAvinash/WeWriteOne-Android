package badramoni.avinash.cratisspace.wewriteone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.avinashbadramoni.wewriteone.R;

public class SecondActivity extends AppCompatActivity {

    TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt1 =(TextView)findViewById(R.id.help);
        txt2 =(TextView)findViewById(R.id.record);
        txt3 =(TextView)findViewById(R.id.update);


        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this,helpActivity.class);
                startActivity(intent);

            }
        });


        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this,recordActivity.class);
                startActivity(intent);

            }
        });

        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this,updateActivity.class);
                startActivity(intent);

            }
        });






    }
}
