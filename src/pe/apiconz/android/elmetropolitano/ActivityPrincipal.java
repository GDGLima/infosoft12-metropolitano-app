package pe.apiconz.android.elmetropolitano;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ActivityPrincipal extends ListActivity {

	SimpleCursorAdapter simpleCursorAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_principal);

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Tramo Norte");
		arrayList.add("Tramo Centro");
		arrayList.add("Tramo Sur");

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, android.R.id.text1,
				arrayList);

		setListAdapter(adapter);

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		Intent intent = null;
		
		switch (position) {
		case 0:
			intent = new Intent(this, TramoNorteActivity.class);
			startActivity(intent);
			break;
		case 1:
			intent = new Intent(this, TramoCentroActivity.class);
			startActivity(intent);
			break;

		case 2:
			intent = new Intent(this, TramoSurActivity.class);
			startActivity(intent);
			break;
		default:
			intent = new Intent(this, TramoCentroActivity.class);
			startActivity(intent);
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_activity_principal, menu);
		return true;
	}

	public void sobreNosotros(View view){
		
	}
	
}
