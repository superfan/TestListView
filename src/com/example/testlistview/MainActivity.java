package com.example.testlistview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.view.View;
import android.widget.AdapterView; 
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {
	private ListView mListView = null;
	private MyAdapter mMyAdapter = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		///////////////////////////////////////////////////
		// list 1
		// android.R.layout.simple_list_item_1   一行text
		// android.R.layout.simple_list_item_2   一行title，一行text
		// android.R.layout.simple_list_item_single_choice   单选按钮
		// android.R.layout.simple_list_item_multiple_choice   多选按钮
		// android.R.layout.simple_list_item_checked    checkbox
		/*listView = (ListView)findViewById(R.id.list); 
		listView.setAdapter(new ArrayAdapter<String>(
				                this, 
				                android.R.layout.simple_expandable_list_item_1,
				                getData1()));*/

		///////////////////////////////////////////////////
		// list 2
		/*SimpleAdapter adapter = new SimpleAdapter(this, getData2(), R.layout.vlist,
				new String[]{"title","info","img"},
				new int[]{R.id.title,R.id.info,R.id.img});
		listView = (ListView)findViewById(R.id.list);
		listView.setAdapter(adapter);*/
		
        ///////////////////////////////////////////////////
		// list 3
		mListView = (ListView)findViewById(R.id.list);  
        List<Map<String, Object>> list = getData3(); 
        mMyAdapter = new MyAdapter(this, list);
        mListView.setAdapter(mMyAdapter);
        mListView.setOnItemClickListener(new OnItemClickListener() {
        	@Override  
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {  
                // 设置适配器的选中项   
                mMyAdapter.setSelectedPosition(arg2);
            }  
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	///////////////////////////////////////////////////////
	// list 1
	private List<String> getData1() {
		List<String> data = new ArrayList<String>();
		data.add("测试数据1");
		data.add("测试数据2");
		data.add("测试数据3");
		data.add("测试数据4");             
		return data;
	}
	
	///////////////////////////////////////////////////////
	// list 2
	private List<Map<String, Object>> getData2() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "G1");
		map.put("info", "google 1");
		map.put("img", R.drawable.i1);
		list.add(map);
		     
		map = new HashMap<String, Object>();
		map.put("title", "G2");
		map.put("info", "google 2");
		map.put("img", R.drawable.i2);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.i3);
		list.add(map);

		return list;
	}
	
	private List<Map<String, Object>> getData3() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "G1");
		map.put("info", "google 1");
		map.put("img", R.drawable.i1);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G2");
		map.put("info", "google 2");
		map.put("img", R.drawable.i2);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.i3);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G4");
		map.put("info", "google 4");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G5");
		map.put("info", "google 5");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G6");
		map.put("info", "google 6");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G7");
		map.put("info", "google 7");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G8");
		map.put("info", "google 8");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G9");
		map.put("info", "google 9");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G10");
		map.put("info", "google 10");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G11");
		map.put("info", "google 11");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G12");
		map.put("info", "google 12");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "G13");
		map.put("info", "google 13");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		return list;
	}
}
