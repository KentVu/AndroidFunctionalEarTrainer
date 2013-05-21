package fetel.hcmus.earpractice;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Random rand;
	Integer mockquestion = 0;
	TextView mockhint;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		rand = new Random();
		mockhint = (TextView) findViewById(R.id.mockhint);
		// mockhint.setText("1");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClickedButtonSetting(View v) {
		Intent intent1 = new Intent(MainActivity.this, SettingActivity.class);
		startActivity(intent1);
	}

	public void onBtnsClick(View v) {
		// mockhint = (TextView) findViewById(R.id.mockhint);
		TextView result = (TextView) findViewById(R.id.result);
		Button b = (Button) v;

		switch (v.getId()) {
		case R.id.btn1:
		case R.id.btn2:
		case R.id.btn3:
		case R.id.btn4:
		case R.id.btn5:
		case R.id.btn6:
		case R.id.btn7:
		case R.id.btn8:
		case R.id.btn9:
		case R.id.btn10:
		case R.id.btn11:
		case R.id.btn12:
			if (Integer.parseInt(b.getText().toString()) == mockquestion) {
				result.setText(getResources().getString(R.string.correct));
				newMockQuestion();
			} else {
				result.setText(getResources().getString(R.string.notcorrect));
			}
			break;
		case R.id.start:
			newMockQuestion();
			break;
		}
	}

	private void newMockQuestion() {
		// generate random answer:
		mockquestion = rand.nextInt(11);
		mockhint.setText(mockquestion.toString());
	}
}
