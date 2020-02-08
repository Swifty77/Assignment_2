package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

Button save;
EditText name;
EditText email;
EditText password;
EditText confirmation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        save = (Button)findViewById(R.id.button);
        name = (EditText)findViewById(R.id.NameEdit);
        email = (EditText)findViewById(R.id.EmailEdit);
        password = (EditText)findViewById(R.id.PasswordEdit);
        confirmation = (EditText)findViewById(R.id.ConfirmationEdit);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().matches("") || email.getText().toString().matches("") || password.getText().toString().matches("") || confirmation.getText().toString().matches("")) {

                    Toast.makeText(getApplicationContext(),"Please fill in all fields", Toast.LENGTH_SHORT).show();
                }

                else if ((password.getText().toString().matches(confirmation.getText().toString())) == false){
                    Toast.makeText(getApplicationContext(),"Password does not match", Toast.LENGTH_SHORT).show();
                }

                else {
                    String text = ("Welcome, " + name.getText().toString() + ", to the SignUpForm App");
                    Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
