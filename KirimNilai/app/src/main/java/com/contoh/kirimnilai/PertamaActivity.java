package com.contoh.kirimnilai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.contoh.kirimnilai.R.id.screen;

public class PertamaActivity extends Activity {
	// Initializing variables
	EditText inputName;
	EditText inputEmail;
	EditText inputHp;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pertama);		
		
		inputName = (EditText) findViewById(R.id.name);
		inputEmail = (EditText) findViewById(R.id.email);
		inputHp = (EditText) findViewById(R.id.hp);
		final Button btn1 = (Button) findViewById(R.id.btn1);
		final Button btn2 = (Button) findViewById(R.id.btn2);
		
		//Listening to button event
		btn1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				//Starting a new Intent
				Intent btn1 = new Intent(getApplicationContext(), KeduaActivity.class);
				
				//Sending data to another Activity
				btn1.putExtra("name", inputName.getText().toString());
				btn1.putExtra("email", inputEmail.getText().toString());
				
				// starting new activity
				startActivity(btn1);
				finish();
				
			}
		});
		btn2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				//Starting a new Intent
				Intent btn2 = new Intent(getApplicationContext(), KetigaActivity.class);
				btn2.putExtra("name", inputName.getText().toString());
				btn2.putExtra("email", inputEmail.getText().toString());
				btn2.putExtra("Hp", inputHp.getText().toString());

				startActivity(btn2);
				finish();

			}
		});

	}
}