package fetel.hcmus.earpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

		// kiểm tra có database chưa?

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
		MediaPlayer mp;
		int[] notesMap = { R.raw._4c2, R.raw._4cs2, R.raw._4d2,
				R.raw._4ds2, R.raw._4e2, R.raw._4f2, R.raw._4fs2, R.raw._4g2,
				R.raw._4gs2, R.raw._4a2, R.raw._4as2, R.raw._4b2 };
		// notesMap[1] = R.raw._4c2;

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
			mp = MediaPlayer.create(this,
					notesMap[Integer.parseInt(b.getText().toString()) - 1]);
			mp.start();
			Toast.makeText(
					this,
					"mediaPlayer.start()"
							+ Integer.toHexString(notesMap[Integer.parseInt(b.getText().toString()) - 1]),
					Toast.LENGTH_LONG).show();
			mp.release();
			checkAnswer(result, b);
			break;
		case R.id.start:
			newMockQuestion();
			break;
		}
	}

	private void checkAnswer(TextView result, Button b) {

		if (Integer.parseInt(b.getText().toString()) == mockquestion) {
			result.setText(getResources().getString(R.string.correct));
			newMockQuestion();
		} else {
			result.setText(getResources().getString(R.string.notcorrect));
		}
	}

	private void newMockQuestion() {
		// generate random answer:
		mockquestion = rand.nextInt(11 + 1);
		mockhint.setText(mockquestion.toString());
	}
}
