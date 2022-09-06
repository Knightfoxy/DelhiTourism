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


class MuseumsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater ,
        container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.tour_list , container , false)
        val places: ArrayList<Place> = ArrayList<Place>()
        places.add(
            Place(
                "Air Force Museum" ,
                "Palam, Delhi Cantonment, New Delhi - 110010" ,
                "10.00 AM - 05:00 PM \nClosed : Monday, Tuesday and Public Holidays" ,
                "https://www.tourmyindia.com/museums/images/airforce-museum-delhi.jpg" ,
                "https://www.tourmyindia.com/museums/delhi.html"
            )
        )
        places.add(
            Place(
                "Red Fort Archaeological Museum" ,
                "Red Fort, Old Delhi" ,
                "09:00 AM - 05:00 PM Daily \nClosed : Public Holidays" ,
                "https://www.tourmyindia.com/museums/images/archaeological-museum-delhi.jpg" ,
                "https://www.tourmyindia.com/museums/delhi.html"
            )
        )
        places.add(
            Place(
                "National Handicrafts and Handlooms Museum" ,
                "Bhairon Road, Pragati Maidan, New Delhi - 110001" ,
                "09:30 AM - 05:00 PM (July to September) & 09:30 AM - 06:00 PM (October to June) \nClosed : Monday and Public Holidays" ,
                "https://www.tourmyindia.com/museums/images/handicrafts-museum-delhi.jpg" ,
                "https://www.tourmyindia.com/museums/delhi.html"
            )
        )
        places.add(
            Place(
                "Shankar's International Dolls Museum" ,
                "Nehru House, 4, Bahadur shah Zafar Marg, New Delhi" ,
                "10:00 AM - 05:30 PM \nClosed : Monday and Public Holidays" ,
                "https://www.tourmyindia.com/museums/images/shankar-dolls-museum-delhi.jpg" ,
                "https://www.tourmyindia.com/museums/delhi.html"
            )
        )
        places.add(
            Place(
                "National Police Museum" ,
                "Block No. 4, CGO complex, Lodi Road, New Delhi" ,
                "10:00 AM - 05:00 PM \nClosed : Saturday, Sunday and Public Holidays" ,
                "https://www.tourmyindia.com/museums/images/national-police-museum-delhi.jpg" ,
                "https://www.tourmyindia.com/museums/delhi.html"
            )
        )
        places.add(
            Place(
                "National Science Centre Museum" ,
                "Bhairon Marg, near Pragati Maidan Gate No. 1, New Delhi" ,
                "10:00 AM - 05:00 PM \nClosed : Holi and Diwali" ,
                "https://www.tourmyindia.com/museums/images/national-science-museum-delhi.jpg" ,
                "https://www.tourmyindia.com/museums/delhi.html"
            )
        )
        places.add(
            Place(
                "National Rail Museum" ,
                "Chanakyapuri, New Delhi" ,
                "09:30 AM - 05:30 PM \nClosed : Monday and Public Holidays" ,
                "https://www.tourmyindia.com/museums/images/national-rail-museum-delhi.jpg" ,
                "https://www.tourmyindia.com/museums/delhi.html"
            )
        )
        places.add(
            Place(
                "National Gandhi Museum" ,
                "Raj Ghat, New Delhi - 110002" ,
                "Tuesday to Sunday- 10:00 AM to 5:00 PM \nMonday Closed" ,
                "https://www.tourmyindia.com/states/delhi/images/gandhi-museum1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/gandhi-museum.html"
            )
        )
        places.add(
            Place(
                "Indira Gandhi Memorial Museum" ,
                "No. 1, Safdarjung Road, New Delhi- 110011" ,
                "Tuesday to Sunday- 9:30 AM to 5:00 PM" ,
                "https://www.tourmyindia.com/states/delhi/images/indira-gandhi-memorial-museum1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/indira-gandhi-memorial-museum.html"
            )
        )
        places.add(
            Place(
                "India War Memorial Museum" ,
                "Red Fort, New Delhi - 110006" ,
                "Tuesday to Sunday- 10:00 AM to 5:00 PM \nSunday Closed" ,
                "https://www.tourmyindia.com/states/delhi/images/india-war-memorial-museum1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/india-war-memorial-museum.html"
            )
        )
        val adapter = activity?.let { PlaceAdapter(it ,places) }
        val listView = rootView.findViewById<ListView>(R.id.list)
        listView.adapter = adapter
        listView.onItemClickListener =
            OnItemClickListener { adapterView , view , position , l ->
                val currentPlace: Place? = adapter?.getItem(position)
                val heritagePlaceUri = Uri.parse(currentPlace?.getPlaceUrl())
                val websiteIntent = Intent(Intent.ACTION_VIEW , heritagePlaceUri)
                startActivity(websiteIntent)
            }
        return rootView
    }
}