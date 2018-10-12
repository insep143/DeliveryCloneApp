package kr.gdg.deliveryclone.flow.list

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import kr.gdg.deliveryclone.flow.list.fragment.ListFrag

class TabPageAdapter(val fm: FragmentManager, val tabCount: Int) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return ListFrag()
    }

    override fun getCount(): Int {
        return tabCount
    }
}