package badramoni.avinash.cratisspace.wewriteone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.avinashbadramoni.wewriteone.R;

public class recordActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(recordActivity.this, SubjectActivity.class);
                startActivity(i);

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(recordActivity.this, SubjectActivity.class);
                startActivity(i);


            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(recordActivity.this, SubjectActivity.class);
                startActivity(i);

            }
        });
    }
}
