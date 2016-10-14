package ru.team2e.inputevents;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewStub;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initViewStub();
	}

	private void initViewStub() {
		((ViewStub) findViewById(R.id.view_stub)).inflate();
		findViewById(R.id.inflated_id).setBackgroundColor(Color.BLUE);
	}
}
