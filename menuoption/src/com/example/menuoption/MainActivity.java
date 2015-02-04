package com.example.menuoption;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//initialize the local variable actionBar
		ActionBar actionBar = getActionBar();
		
		//how to change the title of the ActionBar
		actionBar.setTitle("Hello");
		
		
		
		//how to hide the title of the ActionBar
		//actionBar.setTitle("");
				
		//how to change the logo of the ActionBar
		//actionBar.setLogo(R.drawable.logo);
		
		//how to hide the logo on the ActionBar
		//actionBar.setLogo(
		//        new ColorDrawable(getResources().getColor(android.R.color.transparent)));
		
		
		//how to hide your ActionBar entirely
		//actionBar.hide();
		
		//how to add a subtitle to the ActionBar
		//actionBar.setSubtitle("Good Morning");
		
	}

	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	} 
	*/
	
	/*
	// This method maps the action that is to be taken when user selects any of the Menu Items.
	// For each item in menu, you need to add a case in the switch statement
	// In this example, we have 3 options, hence we have added 3 cases. It basically triggers
	// another activity. 
	
	@Override
	public boolean onOptionsItemSelected (MenuItem item) 
	{
	    // Handle item selection
	   try
	   {
		
	    switch (item.getItemId()) 
	    {
	    	
	    	case R.id.register:
	    		startActivity(new Intent(MainActivity.this, New.class));
	    		break;
	    	case R.id.settings:
	    		startActivity(new Intent(MainActivity.this, New1.class));
	    		break;
	    	case R.id.login:
	    		startActivity(new Intent(MainActivity.this, New2.class));
	    		break;
	    	default:
	    		return super.onOptionsItemSelected(item);
	    }
	  }catch(Exception e)
	  {
	      Log.d("menuoption",""+(e)+"");
	   }
	return true;
	} 
	*/
}
