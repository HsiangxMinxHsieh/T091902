package com.example.student.t091902;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView)findViewById(R.id.textView);
        tv2= (TextView)findViewById(R.id.textView2);
        registerForContextMenu(tv2);
     }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("設定");
        menu.add("關於");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getTitle().equals("設定")){
            tv.setText("你剛剛按了設定");
        }
        if(item.getTitle().equals("關於")){
            tv.setText("你剛剛按了關於");
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add("第一選擇項");
        menu.add("第二選擇項");
        menu.add("第三選擇項");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle().equals("第一選擇項")) {
            tv.setText("你剛剛選擇了第一個");
        }
        if(item.getTitle().equals("第二選擇項")) {
            tv.setText("你剛剛選擇了第二個");
        }
        if(item.getTitle().equals("第三選擇項")) {
            tv.setText("你剛剛選擇了第三個");
        }

        return super.onContextItemSelected(item);
    }
}
