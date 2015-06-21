package br.com.mw.androidexemplofragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends FragmentActivity {
	FragmentManager fm = getSupportFragmentManager();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			Fragment1 frag1 = new Fragment1();
			Fragment2 frag2 = new Fragment2();
			Fragment3 frag3 = new Fragment3();

			FragmentTransaction ft = fm.beginTransaction();
			ft.add(R.id.layout_direito, frag1, "frag1");
			ft.commit();
		}

		String[] lista = new String[] { "Fragment 1",
				"Altera Texto fragment 1", "Fragment 2", "Fragment 3" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, lista);
		ListView lv = (ListView) findViewById(R.id.listView1);
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> lv, View view, int posicao,
					long id) {
				if (posicao == 0) {
					Fragment1 frag1 = new Fragment1();
					FragmentTransaction ft = fm.beginTransaction();
					ft.replace(R.id.layout_direito, frag1, "frag1");
					ft.addToBackStack("pilha");
					ft.commit();
				} else if (posicao == 1) {
					Fragment1 frag1 = (Fragment1) fm.findFragmentByTag("frag1");
					if (frag1 != null) {
						frag1.alteraTextView("Fragment 1 - TextView Alterado");
					}
				} else if (posicao == 2) {
					Fragment2 frag2 = new Fragment2();
					FragmentTransaction ft = fm.beginTransaction();
					ft.replace(R.id.layout_direito, frag2, "frag2");
					ft.addToBackStack("pilha");
					ft.commit();
				} else if (posicao == 3) {
					Fragment3 frag3 = new Fragment3();
					FragmentTransaction ft = fm.beginTransaction();
					ft.replace(R.id.layout_direito, frag3, "frag3");
					ft.addToBackStack("pilha");
					ft.commit();
				}
			}
		});
	}
}
