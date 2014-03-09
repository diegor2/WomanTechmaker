package hackaton.womantechmaker;

import java.security.acl.NotOwnerException;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {


    private final String[] nomes = new String[]{
	           "Viviane",
	           "Isabela",
	           "Marcela"};
    
    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Notification not = new Notification.Builder(this)
        		.setContentText("Você tem reuniões para avaliar")
        		.setContentTitle("Hi")
        		.setSmallIcon(android.R.drawable.ic_menu_my_calendar)
        		.build();
        NotificationManager notificationManager = (NotificationManager) 
        		  getSystemService(NOTIFICATION_SERVICE); 
        notificationManager.notify(0, not); 
        
		           
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(new  ArrayAdapter<String>(this, 
        		android.R.layout.simple_list_item_1, 
        		nomes));
        list.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
				Intent i = new Intent(MainActivity.this, RankActivity.class);
				i.putExtra("name", nomes[arg2]);
				startActivity(i);			
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
