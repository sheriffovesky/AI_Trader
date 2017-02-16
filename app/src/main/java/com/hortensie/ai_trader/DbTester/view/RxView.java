package com.hortensie.ai_trader.DbTester.view;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.hortensie.ai_trader.DbTester.presenter.RxPresenter;
import com.hortensie.ai_trader.DbTester.presenter.RxPresenterInterface;
import com.hortensie.ai_trader.R;

/**
 * Created by Piotr on 2017-01-30.
 * s a layer that displays data and reacts to user actions. On Android, this could be an Activity, a Fragment, an android.view.View or a Dialog.
 */

public class RxView extends Activity implements RxViewInterface{

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rxjava);
        textView = (TextView) findViewById(R.id.rxJava);
        RxPresenterInterface rxPresenterInterface2 = new RxPresenter(this);
        rxPresenterInterface2.showData();
    }

    @Override
    public void updateUi(String s) {
        textView.setText(s); // Change a View
    }

}