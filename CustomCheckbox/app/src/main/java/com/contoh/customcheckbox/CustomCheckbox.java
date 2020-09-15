package com.contoh.customcheckbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;

public class CustomCheckbox extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        CheckBox checkb  = ( CheckBox ) findViewById( R.id.checkb );
        checkb.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		
		TextView output = (TextView)findViewById(R.id.textview1);
				
		if (((CheckBox)v).isChecked()) {
			output.setText("checked");
		} else {
			output.setText("unchecked");
		}
	}
}