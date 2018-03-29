package com.huangmb.nestedscrolldemo

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.FloatingActionButton
import android.support.v4.view.ViewCompat
import android.util.AttributeSet
import android.view.View

/**
 * Created by bob.huang on 2018/3/27.
 */
class HideOnScrollBehavior(context: Context?, attrs: AttributeSet?) : FloatingActionButton.Behavior(context, attrs) {
    override fun onStartNestedScroll(coordinatorLayout: CoordinatorLayout, child: FloatingActionButton, directTargetChild: View, target: View, axes: Int, type: Int): Boolean {
        if (type == ViewCompat.TYPE_TOUCH && (axes and ViewCompat.SCROLL_AXIS_VERTICAL) != 0 ) {
            return true
        }
        return super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, axes, type)
    }
    
    override fun onNestedPreScroll(coordinatorLayout: CoordinatorLayout, child: FloatingActionButton, target: View, dx: Int, dy: Int, consumed: IntArray, type: Int) {
        child.hide()
    }
    override fun onNestedScroll(coordinatorLayout: CoordinatorLayout, child: FloatingActionButton, target: View, dxConsumed: Int, dyConsumed: Int, dxUnconsumed: Int, dyUnconsumed: Int, type: Int) {
//        child.hide()
    }
    
    
    override fun onStopNestedScroll(coordinatorLayout: CoordinatorLayout, child: FloatingActionButton, target: View, type: Int) {
        child.show()
    }
}