package com.nstu.medelofhonour;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class birc extends Activity{
	
String gamelist[]={"Captain Mohiuddin Jahangir","Artificer Md Ruhul Amin","Flight Lt. Motiur Rahman","Sipahi Mostafakamal","Lance Nayek Nurmohammad Shekh","Sipahi Hamidur Rahman","Nayek Munshi Abdur Rouf"};
	
	ListView listview;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.bira);
	listview=(ListView)findViewById(R.id.listView1);
	
	listview.setAdapter(new ArrayAdapter<String>(birc.this,android.R.layout.simple_list_item_1,gamelist));
listview.setOnItemClickListener(new OnItemClickListener() {
    
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		if(arg2==0)
		{
			Intent i=new Intent(birc.this,mohiuddinc.class);
			startActivity(i);
			
		}
		else if(arg2==1)
		{
			Intent j=new Intent(birc.this,ruhuc.class);
			startActivity(j);
			
		}
		else if(arg2==2)
		{
			Intent k=new Intent(birc.this,motiurc.class);
			startActivity(k);
			
		}
		else if(arg2==3)
		{
			Intent m=new Intent(birc.this,kamalc.class);
			startActivity(m);
			
		}
		else if(arg2==4)
		{
			Intent n=new Intent(birc.this,nurc.class);
			startActivity(n);
			
		}
		else if(arg2==5)
		{
			Intent o=new Intent(birc.this,hamidurc.class);
			startActivity(o);
			
		}
		else if(arg2==6)
		{
			Intent p=new Intent(birc.this,munshic.class);
			startActivity(p);
			
		}
		
		
	}
});
	
}
}
