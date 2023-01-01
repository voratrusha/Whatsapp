package Adapter

import ModelClass.call_model
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

class call_adapter(cl_list: ArrayList<call_model>) : RecyclerView.Adapter<call_adapter.CallHolder>() {
    var cl_list = cl_list
    lateinit var context: Context
    class CallHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var cl_nameid = itemView.findViewById<TextView>(R.id.callname)
        var cl_timeid = itemView.findViewById<TextView>(R.id.calltime)
        var cl_dayid = itemView.findViewById<TextView>(R.id.callday)
        var cl_imgid = itemView.findViewById<CircleImageView>(R.id.callprofile_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallHolder {
        context = parent.context
        return CallHolder(LayoutInflater.from(parent.context).inflate(R.layout.call_view,parent,false))
    }

    override fun onBindViewHolder(holder: CallHolder, position: Int) {
        holder.cl_nameid.text = cl_list.get(position).clname
        holder.cl_timeid.text = cl_list.get(position).cltime
        holder.cl_dayid.text = cl_list.get(position).clday
        Glide.with(context).load(cl_list.get(position).climgs).into(holder.cl_imgid)
    }

    override fun getItemCount(): Int {
        return cl_list.size
    }
}