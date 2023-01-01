package Fragments

import ModelClass.chat_model
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.whatsapp.R.drawable.*
import com.example.whatsapp.databinding.FragmentChatBinding
import Adapter.ChatAdapter as chat_adapter1


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ChatFragment : Fragment() {
    var list = ArrayList<chat_model>()
    var name = arrayOf("Me","Sachi", "Ravi","Priya","Fenil","Shreya","Krishna","Aashi","Ayaan","Kevin","Janvi","Monali","Fenil")
    var img = arrayOf(prof1, proffpic3, back6, profile1, proffpic2, back7, profile2, proffpic,
               back8, profile3, back9, back5, back4)
    var time = arrayOf("Today","5:15pm","3:30pm","12:00pm","10:23am","7:00am","Yesterday","Yesterday","Yesterday","24/12/22","24/12/22","23/12/22","22/12/22")
    var msg = arrayOf("Good morning","how are you?","lets meet soon","hii","send me files","heyy","send photos","call me asap","talk to you tomorrow","good night","heyy","good noon","hii")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentChatBinding.inflate(layoutInflater)
        for (i in 0..img.size-1){
            var data = chat_model(name.get(i),msg.get(i),time.get(i),img.get(i))
            list.add(data)
        }
        binding.chatrecycle.layoutManager = LinearLayoutManager(context)
        binding.chatrecycle.adapter = Adapter.ChatAdapter(list)
        return  binding.root
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            ChatFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}