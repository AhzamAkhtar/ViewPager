import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.android.whatsapp_pager.CHATS
import com.example.android.whatsapp_pager.Calls
import com.example.android.whatsapp_pager.Status

class viewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return CHATS()
            }
            1 -> {
                return Status()
            }
            2 -> {
                return Calls()
            }
            else -> {
                return CHATS()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "CHATS"
            }
            1 -> {
                return "STATUS"
            }
            2 -> {
                return "CALLS"
            }
        }
        return super.getPageTitle(position)
    }

}
