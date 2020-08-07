package com.example.simpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private List<Map<String,Object>> lists;
    private SimpleAdapter adapter;
    private ListView listView;
    //定义数据
    private String[] theme = {"张三","李四","王五"};
    private String[] content ={"我是张三，你好","我是李四，你好","我是王五，你好"};
    private int[] imageViews = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list_view);
        //准备数据源
        lists=new ArrayList<>();
        for(int i=0;i<theme.length;i++){
            Map<String,Object> map=new HashMap<>();
            map.put("theme",theme[i]);
            map.put("content",content[i]);
            map.put("imageViews",imageViews[i]);
            lists.add(map);
        }
        adapter=new SimpleAdapter(MainActivity.this,lists,R.layout.item,
                new String[]{"theme","content","imageViews"},
                new int[]{R.id.text1,R.id.text2,R.id.image1});
        listView.setAdapter(adapter);
    }
}
