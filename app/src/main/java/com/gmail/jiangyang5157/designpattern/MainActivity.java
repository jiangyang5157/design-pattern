package com.gmail.jiangyang5157.designpattern;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.gmail.jiangyang5157.designpattern.adapter.AdapterMode;
import com.gmail.jiangyang5157.designpattern.command.CommandMode;
import com.gmail.jiangyang5157.designpattern.decorator.DecoratorMode;
import com.gmail.jiangyang5157.designpattern.factory.FactoryMode;
import com.gmail.jiangyang5157.designpattern.iterator.IteratorMode;
import com.gmail.jiangyang5157.designpattern.observer.ObserverMode;
import com.gmail.jiangyang5157.designpattern.single.SingleMode;
import com.gmail.jiangyang5157.designpattern.state.StateMode;
import com.gmail.jiangyang5157.designpattern.strategy.StrategyMode;
import com.gmail.jiangyang5157.designpattern.template.TemplateMode;

public class MainActivity extends AppCompatActivity {

    private ListView list = null;
    private ListAdapter listAdapter = null;

    private ArrayList<Class<?>> classes = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        initialization();
    }

    private void setupViews() {
        list = (ListView) findViewById(R.id.list);
    }

    private void initialization() {
        classes = new ArrayList<>();

        classes.add(StrategyMode.class);
        classes.add(ObserverMode.class);
        classes.add(DecoratorMode.class);
        classes.add(FactoryMode.class);
        classes.add(SingleMode.class);
        classes.add(CommandMode.class);
        classes.add(AdapterMode.class);
        classes.add(TemplateMode.class);
        classes.add(IteratorMode.class);
        classes.add(StateMode.class);

        listAdapter = new ListAdapter();
        list.setAdapter(listAdapter);
        list.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(getApplicationContext(), classes.get(position));
                getApplicationContext().startActivity(intent);
            }
        });
    }

    class ListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return classes.size();
        }

        @Override
        public Object getItem(int position) {
            return classes.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView tv = (TextView) convertView;

            if (tv == null) {
                tv = new TextView(getApplicationContext());
            }

            tv.setText(classes.get(position).getSimpleName());
            return tv;
        }
    }
}