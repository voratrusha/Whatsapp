package Fragments

import Adapter.status_adapter
import ModelClass.status_model
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.whatsapp.R.drawable.*
import com.example.whatsapp.databinding.FragmentStatusBinding

class StatusFragment : Fragment() {
    var st_list = ArrayList<status_model>()
    var st_name = arrayOf("Your Status","Shivani", "Raj","Priya","Fenil","Shreya","Krishna","Aashi","Ayaan","Kevin","Janvi")
    var st_img = arrayOf(back1, back6, back8, back7, back10, proffpic, back5, proffpic2, back11, back9, back5)
    var st_time = arrayOf("2 minutes ago","Just now","10 minutes ago","12:00pm","10:23am","7:00am","Yesterday","Yesterday","Yesterday","24/12/22","24/12/22")
    var st_day = arrayOf("Today,","Today,","Today,","Yesterday,","Yesterday,","Yesterday,","Yesterday,","Saturday,","Saturday,","Friday,","Friday,")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentStatusBinding.inflate(layoutInflater)
        for (i in 0..st_img.size-1){
            var stdata = status_model(st_name.get(i),st_day.get(i),st_time.get(i),st_img.get(i))
            st_list.add(stdata)
        }
        binding.statusrecycle.layoutManager = LinearLayoutManager(context)
        binding.statusrecycle.adapter = status_adapter(st_list)
        return  binding.root
    }

    companion object {
       
        fun newInstance(param1: String, param2: String) =
            StatusFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}