package com.example.dong.swipemaker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.xenione.libs.swipemaker.AbsCoordinatorLayout;
import com.xenione.libs.swipemaker.SwipeLayout;

/**
 * Created by DONG on 25-Jul-17.
 */

public class HalfRightCoordinatorLayout  extends AbsCoordinatorLayout {
    private View mBackgroundView;
    private SwipeLayout mForegroundView;
    public HalfRightCoordinatorLayout(Context context) {
        super(context);
    }

    public HalfRightCoordinatorLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HalfRightCoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public HalfRightCoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void doInitialViewsLocation() {
        mForegroundView = (SwipeLayout) findViewById(R.id.foregroundView);
        mBackgroundView = findViewById(R.id.backgroundView);
        mForegroundView.anchor(mBackgroundView.getRight(), mBackgroundView.getLeft());
    }

    @Override
    public void onTranslateChange(float globalPercent, int index, float relativePercent) {

    }
}
