package br.com.mw.androidexemplofragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.layout_frag_1, null);

		TextView textView = (TextView) view.findViewById(R.id.textView1);
		textView.setText("Fragment 1");
		
		return (view);
	}
	
	public void alteraTextView(String texto){
		TextView tv = (TextView) getView().findViewById(R.id.textView1);
		tv.setText(texto);
	}
}
