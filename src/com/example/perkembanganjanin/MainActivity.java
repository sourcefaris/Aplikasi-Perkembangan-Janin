package com.example.perkembanganjanin;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ListView listBulan = (ListView)findViewById(R.id.listView1);
		String [] valuesBulan = new String[]{"Perhitungan","Bulan 1", "Bulan 2", "Bulan 3", "Bulan 4", "Bulan 5", "Bulan 6", "Bulan 7", "Bulan 8", "Bulan 9"};
		
		final ArrayList<String> list = new ArrayList<String>();
	    for (int i = 0; i < valuesBulan.length; ++i) {
	      list.add(valuesBulan[i]);
	    }
	    final StableArrayAdapter adapter = new StableArrayAdapter(this,
	        android.R.layout.simple_list_item_1, list);
	    listBulan.setAdapter(adapter);
	    
	    listBulan.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent i = new Intent(MainActivity.this, Subactivity.class);
				i.putExtra("position", position);
                startActivity(i);
			}
		});
	}

}
