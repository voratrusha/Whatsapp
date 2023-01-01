package Adapter

import ModelClass.chat_model
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.whatsapp.R
import de.hdodenhof.circleimageview.CircleImageView

class ChatAdapter(list: ArrayList<chat_model>) : RecyclerView.Adapter<ChatAdapter.ChatHolder>() {
    var list = list
    lateinit var context: Context
    class ChatHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var nameid = itemView.findViewById<TextView>(R.id.name)
         var msgid  = itemView.findViewById<TextView>(R.id.msg)
         var timeid = itemView.findViewById<TextView>(R.id.time)
         var imgid  = itemView.findViewById<CircleImageView>(R.id.profile_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {
        context = parent.context
        return ChatHolder(LayoutInflater.from(parent.context).inflate(R.layout.chat_view,parent,false))
    }

    override fun onBindViewHolder(holder: ChatHolder, position: Int) {
        holder.nameid.text = list.get(position).name
        holder.msgid.text = list.get(position).msg
        holder.timeid.text = list.get(position).time
        Glide.with(context).load(list.get(position).img).into(holder.imgid)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}