package hackaton.womantechmaker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RankActivity extends Activity {
	
	private TextView text ;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_rank);
		String name = getIntent().getExtras().getString("name");
		text = (TextView) findViewById(R.id.name);
		text.setText(name);
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
	}
	
}
