package Adapter

import Fragments.CallFragment
import Fragments.ChatFragment
import Fragments.StatusFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    var fraglist = arrayOf(ChatFragment(), StatusFragment(), CallFragment())
    var titles = arrayOf("Chats", "Status", "Calls")
    override fun getCount(): Int {
       return fraglist.size
    }

    override fun getItem(position: Int): Fragment {
        return  fraglist.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles.get(position)
    }
}