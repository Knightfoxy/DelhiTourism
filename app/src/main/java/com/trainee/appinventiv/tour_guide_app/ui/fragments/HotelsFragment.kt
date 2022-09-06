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


class HotelsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater ,
        container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.tour_list , container , false)
        val places: ArrayList<Place> = ArrayList<Place>()
        places.add(
            Place(
                "Hyatt Regency" ,
                "Bhikaji Cama Place, Ring Road New Delhi, India, 110066" ,
                "" ,
                "https://www.tourmyindia.com/states/delhi/images/hyatt-regency-delhi.jpg" ,
                "https://www.tourmyindia.com/luxury-hotels/hyatt-regency-delhi.html"
            )
        )
        places.add(
            Place(
                "The Oberoi Hotel" ,
                "Dr Zakir Hussein Marg, New Delhi Delhi, 110003" ,
                "" ,
                "https://www.tourmyindia.com/states/delhi/images/the-oberoi-new-delhi.jpg" ,
                "https://www.tourmyindia.com/luxury-hotels/hotel-oberoi-delhi.html"
            )
        )
        places.add(
            Place(
                "The Taj Mahal Hotel" ,
                "No.1, Mansingh Road,New Delhi, Dl 110001, India" ,
                "" ,
                "https://www.tourmyindia.com/states/delhi/images/hotel-taj-mahal-delhi.jpg" ,
                "https://www.tourmyindia.com/luxury-hotels/hotel-taj-mahal-delhi.html"
            )
        )
        places.add(
            Place(
                "The Leela Palace" ,
                "Diplomatic Enclave,Chankyapuri, New Delhi, 110023" ,
                "" ,
                "https://www.tourmyindia.com/states/delhi/images/the-leela-palace.jpg" ,
                "https://www.tourmyindia.com/luxury-hotels/leela-palace-delhi.html"
            )
        )
        places.add(
            Place(
                "Taj Palace" ,
                "2, Sardar Patel Marg,Diplomatic Enclave,New Delhi, Delhi, 110021" ,
                "" ,
                "https://www.tourmyindia.com/states/delhi/images/taj-palace-delhi.jpg" ,
                "https://www.tourmyindia.com/luxury-hotels/taj-palace-delhi.html"
            )
        )
        places.add(
            Place(
                "The Imperial Hotel" ,
                "Janpath Lane, Connaught Place,New Delhi, Delhi, 110001" ,
                "" ,
                "https://www.tourmyindia.com/states/delhi/images/hotel-imperial-delhi.jpg" ,
                "https://www.tourmyindia.com/luxury-hotels/hotel-imperial-delhi.html"
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