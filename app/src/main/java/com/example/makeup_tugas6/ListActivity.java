package com.example.makeup_tugas6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    RecyclerView rvData;
    private ArrayList<DataMakeup> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rvData = findViewById(R.id.id_makeup);
        rvData.setHasFixedSize(true);

        list.addAll(MakeupData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvData.setLayoutManager(new LinearLayoutManager(this));
        ListMakeupAdapter listMakeupAdapter = new ListMakeupAdapter(list) {
        };
        rvData.setAdapter(listMakeupAdapter);
    }
}
