package com.kodego.activity.app.schooladminandstudentapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kodego.activity.app.schooladminandstudentapp.databinding.ActivityHomeTwoBinding

class HomeTwoActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var subjectsList = mutableListOf<Subjects>()
            Subjects(R.drawable.biologyicon,"Biology","Study of living organisms","M-W-F","08:00 AM - 10:00 AM", "Prof. Aristotle")
            Subjects(R.drawable.chemistryicon,"Chemistry","Scientific study of the properties and behavior of matter.","M-W-F","10:00 AM - 12:00 NN", "Prof. Antoine-Laurent de Lavoisier")
            Subjects(R.drawable.designicon,"Art","Paintings, sculpture, and other pictures","M-W-F","01:PM PM - 03:00 PM", "Prof. Pablo Picasso")
            Subjects(R.drawable.englishicon,"English","Study of literature, media and language","M-W-F","03:00 PM - 05:00 PM", "Prof. Geoffrey Chaucer")
            Subjects(R.drawable.historyicon,"History"," Study of past events","T-TH-S","08:00 AM - 10:00 AM", "Prof. Herodotus")
            Subjects(R.drawable.infotechicon,"I.T.","Study cloud computing, cyber security, data management, networking, and more","T-TH-S","10:00 AM - 12:00 NN", "Prof. Claude Elwood Shannon")
            Subjects(R.drawable.mathicon,"Mathematics","Study of abstract science of number, quantity, and space","T-TH-S","01:00 PM - 03:00 PM", "Prof. Archimedes")
            Subjects(R.drawable.scienceicon,"Science","Study of  the structure and behaviour of the physical and natural world through observation and experiment","T-TH-S","03:00 PM - 05:00 PM", "Prof. Galileo Galilei")

    // pass data source to adapter
        val adapter = SubjectAdapter(subjectsList)

        binding.recyclerSubjects.adapter = adapter
        binding.recyclerSubjects.layoutManager = LinearLayoutManager(this)

    }
}
