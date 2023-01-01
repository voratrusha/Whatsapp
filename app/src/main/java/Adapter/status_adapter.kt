package Adapter

import Adapter.status_adapter.*
import ModelClass.status_model
import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.whatsapp.R
import de.hdodenhof.circleimageview.CircleImageView

class status_adapter(st_list: ArrayList<status_model>) : RecyclerView.Adapter<status_adapter.StatusHolder>(){
   var st_list = st_list
   lateinit var context:Context
    class StatusHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var st_nameid = itemView.findViewById<TextView>(R.id.stname)
        var st_timeid = itemView.findViewById<TextView>(R.id.sttime)
        var st_dayid = itemView.findViewById<TextView>(R.id.stday)
        var st_imgid = itemView.findViewById<CircleImageView>(R.id.stprofile_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        context = parent.context
        return StatusHolder(LayoutInflater.from(parent.context).inflate(R.layout.status_view,parent,false))
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {
        holder.st_nameid.text = st_list.get(position).stname
        holder.st_timeid.text = st_list.get(position).sttime
        holder.st_dayid.text = st_list.get(position).stday
        Glide.with(context).load(st_list.get(position).stimg).into(holder.st_imgid)
    }

    override fun getItemCount(): Int {
        return st_list.size
    }

}