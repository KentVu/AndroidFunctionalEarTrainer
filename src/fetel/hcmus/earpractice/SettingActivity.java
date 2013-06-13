package fetel.hcmus.earpractice;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.os.Build;

public class SettingActivity extends Activity {
	String candence1[] = {"C-F-G-C(I-IV-V-I)", "Dm7-G7-CMaj7(ii-V-I)", "C(I)", "C(root only)", "no candence"};
	String candence2[] = {"G-C-D-G(I-IV-V-I)", "Am7-D7-GMaj(ii-V-I)", "G(I)", "G(root only)", "no candence"};
	String candence3[] = {"D-G-A-D(I-IV-V-I)", "Em7-A7-DMaj(ii-V-I)", "D(I)", "D(root only)", "no candence"};
	String candence4[] = {"A-D-E-A(I-IV-V-I)", "Bm7-E7-AMaj(ii-V-I)", "A(I)", "A(root only)", "no candence"};
	String candence5[] = {"E-A-B-E(I-IV-V-I)", "F#m7-B7-EMaj(ii-V-I)", "E(I)", "E(root only)", "no candence"};
	String candence6[] = {"B-E-F#-B(I-IV-V-I)", "C#m7-F#7-BMaj(ii-V-I)", "B(I)", "B(root only)", "no candence"};
	String candence7[] = {"F#-B-C#-F#(I-IV-V-I)", "G#m7-C#7-F#Maj(ii-V-I)", "F#(I)", "F#(root only)", "no candence"};
	String candence8[] = {"F-Bb-C-F(I-IV-V-I)", "Gm7-C7-FMaj(ii-V-I)", "F(I)", "F(root only)", "no candence"};
	String candence9[] = {"Bb-Eb-F-Bb(I-IV-V-I)", "Cm7-F7-BbMaj(ii-V-I)", "Bb(I)", "Bb(root only)", "no candence"};
	String candence10[] = {"Eb-Ab-Bb-Eb(I-IV-V-I)", "Fm7-Bb7-EbMaj(ii-V-I)", "Eb(I)", "Eb(root only)", "no candence"};
	String candence11[] = {"Ab-Db-Eb-Ab(I-IV-V-I)", "Bbm7-Eb7-AbMaj(ii-V-I)", "Ab(I)", "Ab(root only)", "no candence"};
	String candence12[] = {"Db-Gb-Ab-Db(I-IV-V-I)", "Ebm7-Ab7-DbMaj(ii-V-I)", "Db(I)", "Db(root only)", "no candence"};
	String candence13[] = {"Gb-Cb-Db-Gb(I-IV-V-I)", "Abm7-Db7-GbMaj(ii-V-I)", "Gb(I)", "Gb(root only)", "no candence"};
	Spinner spinner;
	Spinner spinner1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		// Show the Up button in the action bar.
		final ArrayAdapter<String> adap= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence1);
		final ArrayAdapter<String> adap2= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence2);
		final ArrayAdapter<String> adap3= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence3);
		final ArrayAdapter<String> adap4= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence4);
		final ArrayAdapter<String> adap5= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence5);
		final ArrayAdapter<String> adap6= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence6);
		final ArrayAdapter<String> adap7= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence7);				
		final ArrayAdapter<String> adap8= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence8);
		final ArrayAdapter<String> adap9= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence9);
		final ArrayAdapter<String> adap10= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence10);
		final ArrayAdapter<String> adap11= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence11);
		final ArrayAdapter<String> adap12= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence12);
		final ArrayAdapter<String> adap13= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, candence13);
		spinner = (Spinner) findViewById(R.id.chords);
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
			//@Override
		    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
		        // Coding
		    	switch(position)
		    	{
		    	case 0:
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap);
		    		//spinner.setAdapter(adapter);
		    		break;
		    	case 1:
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap2);
		    		break;
		    	case 2:
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap3);
		    		break;
		    	case 3:
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap4);
		    		break;
		    	case 4: 
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap5);
		    		break; 
		    	case 5: 
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap6);
		    		break;
		    	case 6:
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap7);
		    		break;
		    	case 7:
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap8);
		    		break;
		    	case 8:
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap9);
		    		break;
		    	case 9: 
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap10);
		    		break;
		    	case 10:
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap11);
		    		break;
		    	case 11: 
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap12);
		    		break;
		    	case 12:
		    		spinner1 = (Spinner) findViewById(R.id.series);
		    		spinner1.setAdapter(adap13);
		    		break;
		    	}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}

		});
	}

	//	setupActionBar();
	//}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.setting, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
