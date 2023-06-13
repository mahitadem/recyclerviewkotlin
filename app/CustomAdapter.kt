import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.jiad.recyclerview.R

class CustomAdapter(parent: Any) (private val mList:List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
//    override fun onCreateViewHolder (parent: ViewGroup,viewType: Int:ViewHolder) {}

    val view=LayoutInflater.from(parent.context)
        .inflate(R.layout.card_view_design,parent)
    return ViewHolder(view)

    override onBindViewHolder(holder:ViewHolder,position:Int){
        val ItemsViewModel=mList[position]
        holder.imageView.setImageResource(ItemsViewModel.image)
        holder.textView.text=ItemsViewModel.text
    }
        override fun getItemCount():Int{
        return mList.size
        }
            class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
                val imageView:ImageView=
            }



    }
