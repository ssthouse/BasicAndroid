package ssthouse.com.androidlearn.ServiceTest;

import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;
import ssthouse.com.androidlearn.Base.BaseActivity;
import ssthouse.com.androidlearn.R;

/**
 * Created by ssthouse on 16/9/8.
 */
public class ServiceTestAty extends BaseActivity {


    @BindView(R.id.id_btn_start_service)
    Button btnStartService;

    @BindView(R.id.id_btn_bind_service)
    Button btnBindService;

    @OnClick(R.id.id_btn_start_service)
    public void onStartService(){

    }

    @OnClick(R.id.id_btn_bind_service)
    public void onBindService(){

    }


    @Override
    public void init() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_service_test;
    }
}
