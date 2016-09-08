package ssthouse.com.androidlearn;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnItemClick;
import ssthouse.com.androidlearn.ActivityTest.ActivityTestAty;
import ssthouse.com.androidlearn.Base.BaseActivity;
import ssthouse.com.androidlearn.ServiceTest.ServiceTestAty;

public class MainActivity extends BaseActivity {


    private Map<Integer, Class> mAtyMap;
    private Map<Integer, String> mLvMap;


    @BindView(R.id.id_lv)
    ListView mLv;

    @OnItemClick(R.id.id_lv)
    public void onLvSelected(int position) {
        //service test
        this.startActivity(new Intent(this, mAtyMap.get(position)));
    }

    @Override
    public void init() {
        mAtyMap = new HashMap<>();
        mLvMap = new HashMap<>();
        Class[] classArray = {ServiceTestAty.class, ActivityTestAty.class};
        for (int i = 0; i < classArray.length; i++) {
            mAtyMap.put(i, classArray[i]);
            mLvMap.put(i, classArray[i].getName());
        }

        mLv.setAdapter(mAdapter);
    }

    private BaseAdapter mAdapter = new BaseAdapter() {
        @Override
        public int getCount() {
            return mAtyMap.keySet().size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView tv = new TextView(MainActivity.this);
            tv.setText(mLvMap.get(position));
            return tv;
        }
    };

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


}
