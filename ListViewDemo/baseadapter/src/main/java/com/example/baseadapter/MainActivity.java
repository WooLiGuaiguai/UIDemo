package com.example.baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Message> lists;
    private MyAdapter adapter;
    private ListView listView;
    private String[] theme = {"张三","李四","王五"};
    private String[] content ={"我是张三，你好","我是李四，你好","我是王五，你好"};
    private int[] imageViews = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list_view);
        lists=new ArrayList<>();
        lists.add(new Message(R.mipmap.ic_launcher,"张三","你好，我是张三"));
        lists.add(new Message(R.mipmap.ic_launcher,"李四","你好，我是李四"));
        lists.add(new Message(R.mipmap.ic_launcher,"王五","你好，我是王五"));
        adapter = new MyAdapter(lists,MainActivity.this);
        listView.setAdapter(adapter);
    }
}
