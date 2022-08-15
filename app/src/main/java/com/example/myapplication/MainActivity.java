package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToHome( View View ) {
        setContentView(R.layout.home);
    }

    public void goToSignup( View View ) {
        setContentView(R.layout.signup);
    }

    public void goToSignIn( View View ) {
        setContentView(R.layout.signin);
    }

    public void goToMaps(View view) {
        setContentView(R.layout.google_maps);
    }

    public void goToProfile(View view) {
        setContentView(R.layout.profile);
    }

    public void goToHistory(View view) {

    }

    public void goToPassCodeGeneration(View view) {
        setContentView(R.layout.generated_payment);
    }

    public void goToDuePayments(View view) {
        setContentView(R.layout.payments);
    }
}
