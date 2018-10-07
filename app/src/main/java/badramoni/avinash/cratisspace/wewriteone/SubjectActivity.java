package badramoni.avinash.cratisspace.wewriteone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.avinashbadramoni.wewriteone.R;

public class SubjectActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);


        btn1 = (Button)findViewById(R.id.sub);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(SubjectActivity.this, LoadActivity.class);
                startActivity(i);
                finish();

            }
        });


    }
}
