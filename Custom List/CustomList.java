package com.pam.listviewpam;

import android.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity{
	TextView listView;
	String[] pilihan = {
			"Obsesi","Pengurus MOS Harus Mati", "Permainan Maut",
			"Teror", "Omen","Tujuh Lukisan Horor","Misteri Organisasi Rahasia The Judges",
			"Malam Karnaval Berdarah","Kutukan Hantu Opera","Sang Pengkhianat","Target Terakhir",
			"Rahasia Tergelap","Pemburuan Dalam Kegelapan", "Malaikat Berhati Gelap","Dibalik Sosok Gelap",
			"Buku Harian Pangeran Kegelapan"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.setListAdapter(new ArrayAdapter<String>(
				this, R.layout.mylist,
				R.id.listView, pilihan));
	}
	
}
