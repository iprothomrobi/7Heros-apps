package com.nstu.medelofhonour;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class spca extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spa);
		Thread th= new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					sleep(3000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally{
					Intent i=new Intent(spca.this,MainActivity.class);
					startActivity(i);
					
				}
			}
		};
		th.start();
		
		
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	

}
