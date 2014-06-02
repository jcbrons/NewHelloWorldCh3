package com.example.helloworld;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        initDisplayButton();
        initClearButton();
        
    }

    private void initDisplayButton() {
    	Button displayButton = (Button) findViewById(R.id.buttonDisplay);
    	displayButton.setOnClickListener(new OnClickListener () {
    		
    		@Override
    		public void onClick(View arg0) {
    			EditText editName = (EditText) findViewById(R.id.editTextName);
    			EditText editName2 = (EditText) findViewById(R.id.editTextLastName);
    			TextView textDisplay = (TextView) findViewById(R.id.textView2);
    			
    			String nameToDisplay = editName.getText().toString();
    			String nameToDisplay2= editName2.getText().toString();
    			textDisplay.setText("Hello " + nameToDisplay2 + " " + nameToDisplay +"!");
    		}
    	});
    }

    private void initClearButton() {
    	Button clearButton = (Button) findViewById(R.id.buttonClear);
    	clearButton.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0){
    			TextView textDisplay = (TextView) findViewById(R.id.textView2);
    			textDisplay.setText("Hello World!");
    		}
    	});
    }
}
