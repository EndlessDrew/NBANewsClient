package com.zhouqi.ncist.nbanewsclient.View.MFragment.LoginAndLoad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zhouqi.ncist.nbanewsclient.MainActivity;
import com.zhouqi.ncist.nbanewsclient.R;
import com.zhouqi.ncist.nbanewsclient.Utils.CheckUtils;
import com.zhouqi.ncist.nbanewsclient.model.dbmodel.DBLogin;

import java.util.List;

public class LoadActivity extends AppCompatActivity  implements View.OnClickListener{


    private TextView mLogin;
    private EditText mUsername;
    private EditText mPassword;
    private Button mLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        initView();

    }

    private void initView() {
        mLogin = (TextView) findViewById(R.id.tv_login);
        mLogin.setOnClickListener(this);
        mUsername = (EditText) findViewById(R.id.et_load_username);
        mUsername.addTextChangedListener(mTextWatcher);
        mPassword = (EditText) findViewById(R.id.et_load_password);
        mPassword.addTextChangedListener(mTextWatcher);
        mLoad = (Button) findViewById(R.id.bt_load);
        mLoad.setOnClickListener(this);
        mLoad.setEnabled(false);
    }


    private TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            if(TextUtils.isEmpty(mUsername.getText().toString().trim())|TextUtils.isEmpty(mPassword.getText().toString().trim())){
                mLoad.setEnabled(false);
            }else{
                mLoad.setEnabled(true);
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.tv_login:
                startActivity(new Intent(this,LoginActivity.class));
                break;
            case R.id.bt_load:
                List<DBLogin> logins = CheckUtils.checkDBdata(mUsername.getText().toString().trim());
                if(logins.size()>0){
                    if((mPassword.getText().toString().trim()).equals(logins.get(0).getPassword())){
                        Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoadActivity.this, MainActivity.class));
                        finish();

                    }else{
                        Toast.makeText(this, "密码错误", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(this, "用户名不存在", Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }
}
