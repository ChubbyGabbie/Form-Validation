package com.gabbie.formvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText etUsername, etPassword, etFullname, etConfirmPassword;
    String Username, Password, Fullname, ConfirmPassword;
    int formsuccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        etFullname = findViewById(R.id.etFullname);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.save_cancel, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btnSave:
                formsuccess = 4;

                Username = etUsername.getText().toString();
                Password = etPassword.getText().toString();
                ConfirmPassword = etConfirmPassword.getText().toString();
                Fullname = etFullname.getText().toString();

                if (Username.equals("")){
                    etUsername.setError("This field is required");
                    formsuccess--;
                }

                if (Password.equals("")){
                    etPassword.setError("This field is required");
                    formsuccess--;
                }

                if (ConfirmPassword.equals("")){
                    etConfirmPassword.setError("This field is required");
                    formsuccess--;
                }

                if (Fullname.equals("")){
                    etFullname.setError("This field is required");
                    formsuccess--;
                }


                break;
            case R.id.btnCancel:
                this.finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
