package com.trainee.appinventiv.tour_guide_app.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.trainee.appinventiv.tour_guide_app.R

class TemplesFragment : Fragment() {

    var places = ArrayList<Place>()
    override fun onCreateView(
        inflater: LayoutInflater ,
        container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.tour_list , container , false)

        places.add(
            Place(
                "Akshardham Temple" ,
                "Noida Mor, Pandav Nagar, New Delhi 110092" ,
                "Tuesday To Sunday- 9:30 AM to 7:30 PM" ,
                "https://www.tourmyindia.com/states/delhi/images/akshardham-temple-pilgrimage1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/akshardham-temple.html"
            )
        )
        places.add(
            Place(
                "Sai Baba Mandir" ,
                "17, Institutional Area, Lodhi Road, New Delhi, Delhi" ,
                "Many Timings Check Website for more info" ,
                "https://www.tourmyindia.com/states/delhi/images/sai-baba-temple1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/sai-baba-temple.html"
            )
        )
        places.add(
            Place(
                "ISKCON Temple" ,
                "Hare Krishna Hills, East of Kailash area of New Delhi" ,
                "Many Timings Check Website for more info" ,
                "https://www.tourmyindia.com/states/delhi/images/iskcon-temple1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/iskcon-temple.html"
            )
        )
        places.add(
            Place(
                "Chhatarpur Temple " ,
                "Chhatarpur,Main Road, Near Chhatarpur Metro Station,New Delhi" ,
                "Monday To Sunday- 6:00 AM to 10:00 PM" ,
                "https://www.tourmyindia.com/states/delhi/images/chhatarpur-temple1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/chhatarpur-temple.html"
            )
        )
        places.add(
            Place(
                "Lakshmi Narayan Temple" ,
                "Mandir Marg, Near Gole market, New Delhi" ,
                "The temple opens at 4:30 AM to 1:30 PM and 2:30 PM - 9:00 PM (All days of the week)" ,
                "https://www.tourmyindia.com/states/delhi/images/laxminarayan-temple1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/laxminarayan-temple.html"
            )
        )
        places.add(
            Place(
                "Malai Mandir" ,
                "Sector -7, Ramakrishnapuram, New Delhi, Delhi" ,
                "Monday to Thursday- 6:30 AM to 11:00 AM and 5:00 PM to 9:00 PM\nFriday- 6:30 AM to 12:00 Noon and 5:30 PM to 9:00 PM\nSaturday and Sunday- 6:30 AM to 12:00 Noon and 5:00 PM to 9:00 PM" ,
                "https://www.tourmyindia.com/states/delhi/images/malai-mandir1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/malai-mandir.html"
            )
        )
        places.add(
            Place(
                "Jhandewalan Temple" ,
                "Desh Bandhu Gupta Marg, Block E, Jhandewalan Extension, Jhandewalan, New Delhi" ,
                "Many Timings Check Website for more info" ,
                "https://www.tourmyindia.com/states/delhi/images/jhandewalan-temple1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/jhandewalan-temple.html"
            )
        )
        places.add(
            Place(
                "Hanuman Temple Connaught Place" ,
                "Hanuman Mandir (Temple), Connaught Place, Delhi - 110001" ,
                "Many Timings Check Website for more info" ,
                "https://www.tourmyindia.com/states/delhi/images/hanuman-temple-connaught-place1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/hanuman-temple-connaught-place.html"
            )
        )
        places.add(
            Place(
                "Lotus Temple" ,
                "Shri Jagannath Marg,Tyagraj Stadium, Near Safdarjung Bus Terminal, New Delhi - 110003" ,
                "Tuesday to Sunday between 9:30 AM to 5:00 PM during the winter season and 9:30 AM to 7:00 PM during the summer season" ,
                "https://www.tourmyindia.com/states/delhi/images/lotus-temple.jpg" ,
                "https://www.tourmyindia.com/states/delhi/lotus-temple.html"
            )
        )
        places.add(
            Place(
                "Jhandewalan Hanuman" ,
                "Jhandewalan Extension, Near Jhandewalan Metro Station" ,
                "The temple remains open from 6:00 AM to 10:00 PM" ,
                "https://www.tourmyindia.com/states/delhi/images/jhandewalan-hanuman-temple1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/jhandewalan-hanuman-temple.html"
            )
        )
        val adapter = PlaceAdapter(requireActivity() , places)
        val listView = rootView.findViewById<ListView>(R.id.list)
        listView.adapter = adapter
        listView.onItemClickListener =
            OnItemClickListener { adapterView , view , position , l ->
                val currentPlace = adapter.getItem(position)
                val heritagePlaceUri = Uri.parse(currentPlace?.getPlaceUrl())
                val websiteIntent = Intent(Intent.ACTION_VIEW , heritagePlaceUri)
                startActivity(websiteIntent)
            }
        return rootView
    }
}
