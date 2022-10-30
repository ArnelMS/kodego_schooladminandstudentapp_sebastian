package com.kodego.activity.app.schooladminandstudentapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kodego.activity.app.schooladminandstudentapp.databinding.RowItemRecylcerBinding

class SubjectAdapter (private val subjects: List<Subjects>):RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder>(){

    inner class SubjectViewHolder(val binding: RowItemRecylcerBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RowItemRecylcerBinding.inflate(layoutInflater,parent,false)
        return SubjectViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        holder.binding.apply {
            imgStudentPhoto.setImageResource(subjects[position].imageStudent)
            txtSubject.text = subjects[position].itemSubject
            txtDescription.text = subjects[position].itemDescription
            txtDays.text = subjects[position].itemDays
            txtTime.text = subjects[position].itemTime
            txtProfessor.text = subjects[position].itemProfessor
        }
    }
    override fun getItemCount():Int {
        return subjects.size

    }
}
