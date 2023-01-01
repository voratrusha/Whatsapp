package Fragments

import Adapter.call_adapter
import ModelClass.call_model
import ModelClass.status_model
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.whatsapp.R.drawable.*
import com.example.whatsapp.databinding.FragmentCallBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class CallFragment : Fragment() {
    var cl_list = ArrayList<call_model>()
    var cl_name = arrayOf("Family","Shivani","Shreya","Krishna","Aashi","Ayaan","Kevin","Janvi")
    var cl_imgs = arrayOf(prof1,proffpic,back5,proffpic2,back4,proffpic3,profile3, profile2)
    var cl_time = arrayOf("5:15 PM","4:30 PM","12:00 PM","7:48 PM","10:15 AM","2:30 PM","11:04 AM","7:48 PM")
    var cl_day = arrayOf("Today,","Today,","December24,","December23,","(3)December17,","December17,","December 2,","November30,")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentCallBinding.inflate(layoutInflater)
        for (i in 0..cl_imgs.size-1){
            var cl_data = call_model(cl_name.get(i),cl_day.get(i),cl_time.get(i),cl_imgs.get(i))
            cl_list.add(cl_data)
        }
        binding.callrecycle.layoutManager = LinearLayoutManager(context)
        binding.callrecycle.adapter = call_adapter(cl_list)
        return  binding.root
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            CallFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}