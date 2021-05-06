package sg.edu.rp.c346.id20047223.p03_demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    TextView tvMsg;
    EditText etData;
    ToggleButton tbEnabler;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link java with UI
        btnDisplay = findViewById(R.id.displayBtn);
        etData = findViewById(R.id.msget);
        tvMsg = findViewById(R.id.textViewDisplay);
        tbEnabler = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.genderRg);

        //behavior
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = etData.getText().toString();
                String pronoun = "";
                int checkRadioId = rgGender.getCheckedRadioButtonId();
                if(checkRadioId == R.id.radioButtonMale){
                    //pronoun = "He says ";
                    text = "He says " + text;
                } else if(checkRadioId == R.id.radioButtonFemale) {
                    //pronoun = "She says ";
                    text = "She says " + text;
                }

                tvMsg.setText(text);

                /*Toast.makeText( MainActivity.this,
                        "My First Toast",
                        Toast.LENGTH_SHORT).show();

                 */
            }
        });

        tbEnabler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tbEnabler.isChecked() == true){
                    etData.setEnabled(true);
                    etData.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    etData.setEnabled(false);
                    etData.setBackgroundColor(Color.RED);
                }
            }

        });


    }
}