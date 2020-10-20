package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView  = (ListView)findViewById(R.id.idlistview);

        RowObject _rowObject1 = new RowObject(R.drawable.facebook,"Facebook","This is the description of Facebook" );
        RowObject _rowObject2 = new RowObject(R.drawable.like,"Like","This is the description of LIke" );
        RowObject _rowObject3 = new RowObject(R.drawable.talk,"Talk","This is the description of Talk" );
        RowObject _rowObject4 = new RowObject(R.drawable.twitter,"Twitter","This is the description of Twitter" );

        ArrayList<RowObject> arrayList = new ArrayList<>();
        arrayList.add(_rowObject1);
        arrayList.add(_rowObject2);
        arrayList.add(_rowObject3);
        arrayList.add(_rowObject4);

        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row, arrayList);
        listView.setAdapter(customAdapter);

    }
}