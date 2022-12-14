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


class GardensFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater ,
        container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.tour_list , container , false)
        val places: ArrayList<Place> = ArrayList<Place>()
        places.add(
            Place(
                "Lodhi Garden" ,
                "Lodhi Rd, Lodhi Gardens, Lodhi Estate, New Delhi, Delhi 110003" ,
                "5:00 am to 8:00 pm (April to September)\n6:00 am to 8:00 pm (October to March)" ,
                "https://www.tourmyindia.com/states/delhi/images/lodhi-garden1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/lodhi-garden.html"
            )
        )
        places.add(
            Place(
                "Mughal Garden" ,
                "Gate No. 35, Rashtrapati Bhawan, Rashtrapati Bhavan, New Delhi, Delhi 110004" ,
                "Mughal Gardens are open for public from August till March" ,
                "https://www.tourmyindia.com/states/delhi/images/mughal-garden1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/mughal-garden.html"
            )
        )
        places.add(
            Place(
                "Buddha Jayanti Park" ,
                "Vandemataram Marg, New Delhi, Delhi 110021" ,
                "Buddha Jayanti Park is open from 5:00 AM to 7:00 PM" ,
                "https://www.tourmyindia.com/states/delhi/images/buddha-jayanti-park1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/buddha-jayanti-park.html"
            )
        )
        places.add(
            Place(
                "Central Park" ,
                "Connaught Place, Rajiv Chowk, New Delhi, Delhi 110001" ,
                "Central Park is open for the public from 6:00 AM to 6:30 PM" ,
                "https://www.tourmyindia.com/states/delhi/images/central-park1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/central-park.html"
            )
        )
        places.add(
            Place(
                "Deer Park" ,
                "Hauz Khas, New Delhi" ,
                "Summer: 5:00 AM to 8:00 PM\nWinter: 5:30 AM to 7:00 PM" ,
                "https://www.tourmyindia.com/states/delhi/images/deer-park1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/deer-park.html"
            )
        )
        places.add(
            Place(
                "Garden of Five Senses" ,
                "Western Marg, Said-ul-Ajaib Village, New Delhi, Delhi 110030" ,
                "Garden of Five Senses is open from 9:00 AM to 7:00 PM" ,
                "https://www.tourmyindia.com/states/delhi/images/garden-of-five-senses1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/garden-of-five-senses.html"
            )
        )
        places.add(
            Place(
                "Nehru Park " ,
                "Ashoka Hotel in the Chanakyapuri diplomatic area, Ramnagar, Chanakyapuri, New Delhi 110023" ,
                "Nehru Park is open from 5:00 AM to 9:00 PM and throughout on Monday" ,
                "https://www.tourmyindia.com/states/delhi/images/nehru-park1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/nehru-park.html"
            )
        )
        places.add(
            Place(
                "Japanese Park Rohini" ,
                "Swarn Jayanti Park, Sector 10, Rohini, Delhi, 110085" ,
                "The park is open from 5:00 AM to 11:00 PM" ,
                "https://www.tourmyindia.com/states/delhi/images/japanese-park1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/japanese-park.html"
            )
        )
        places.add(
            Place(
                "Millennium Park" ,
                "Ring Rd, Block A, Ganga Vihar, Sarai Kale Khan, New Delhi 110013" ,
                "The park is open from 6:00 AM to 7:15 PM" ,
                "https://www.tourmyindia.com/states/delhi/images/millennium-park1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/millennium-park.html"
            )
        )
        places.add(
            Place(
                "Roshanara Bagh" ,
                "Roshanara Rd, Roshanara Garden, Old Delhi, New Delhi 110007" ,
                "Throughout the year 06:00 AM - 11:00 PM, Last Entry: 10:00 PM" ,
                "https://media.tripinvites.com/places/new-delhi/roshanara-bagh/roshanara-bagh-img6-featured-750x500.webp" ,
                "https://www.tourmyindia.com/states/delhi/roshanara-bagh.html"
            )
        )
        places.add(
            Place(
                "National Zoological Park " ,
                "Mathura Road, New Delhi 110003" ,
                "The park is open from 9:00 AM to 5:00 PM and is closed on Friday" ,
                "https://www.tourmyindia.com/states/delhi/images/national-zoological-park1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/national-zoological-park.html"
            )
        )
        val adapter = activity?.let { PlaceAdapter(it , places) }
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