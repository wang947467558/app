package com.example.zhangjian.jyb_01.base;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.zhangjian.jyb_01.R;
import com.example.zhangjian.jyb_01.loadingview.LoadingView;


/**
 * Created by zhangjian on 2016/12/13.
 */

public class BaseFragment extends Fragment {

    private Dialog dialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void showToast(String text) {
        Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
    }

    public void showToast(int id) {
        showToast(id + "");
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    private View mDialogContentView;
    private LoadingView mLoadingView;

    public void showLoad(String text) {
        dialog = new Dialog(getActivity(), R.style.custom_dialog);
        mDialogContentView = LayoutInflater.from(getActivity()).inflate(R.layout.layout_loading_dialog, null);
        mLoadingView = (LoadingView) mDialogContentView.findViewById(R.id.loadView);
        mLoadingView.setLoadingText(text);
        Display d = getActivity().getWindowManager().getDefaultDisplay();
        dialog.show();
        dialog.setContentView(mDialogContentView, new ViewGroup.LayoutParams((int) (d.getWidth() * 0.5),
                (int) (d.getHeight() * 0.3)));
        dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        dialog.setCanceledOnTouchOutside(false);
    }

    public void dismiss() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
