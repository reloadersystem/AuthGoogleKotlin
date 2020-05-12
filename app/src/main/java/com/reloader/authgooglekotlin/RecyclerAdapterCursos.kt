package com.reloader.classroomdeveloper.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reloader.authgooglekotlin.MCursos
import com.reloader.authgooglekotlin.R

class RecyclerAdapterCursos :
    RecyclerView.Adapter<RecyclerAdapterCursos.MyViewHolder>() {

    private lateinit var context: Context
    private lateinit var mCursosList: List<MCursos>

//    private var onCursosListener: OnCursosListener? = null
//
//    fun setOnCursosListener(onCursosListener: OnCursosListener) {
//        this.onCursosListener = onCursosListener
//    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view: View
        val mInflater = LayoutInflater.from(context)
        view = mInflater.inflate(R.layout.item_cursos, parent, false)
        return MyViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.txtTitulo.setText(mCursosList[position].name)
        holder.txtDescripcion.setText(mCursosList[position].section)
    }

    override fun getItemCount(): Int {
        return mCursosList.size
    }

    inner class MyViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        internal var txtTitulo: TextView
        internal var txtDescripcion: TextView
        internal var txtTema: TextView
        internal var lnhead: LinearLayout

        init {

            txtTitulo = itemView.findViewById(R.id.txt_titulo)
            txtDescripcion = itemView.findViewById(R.id.txt_descripcion)
            txtTema = itemView.findViewById(R.id.txt_tema)
            lnhead = itemView.findViewById(R.id.ln_head)

//            lnhead.setOnClickListener {
//                val posicion = adapterPosition
//                onCursosListener.onCursosTitleClicked(posicion)
//            }


        }
    }

}
