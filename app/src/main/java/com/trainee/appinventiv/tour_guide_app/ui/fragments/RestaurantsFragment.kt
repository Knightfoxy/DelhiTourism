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

class RestaurantsFragment : Fragment() {
    var places = ArrayList<Place>()
    override fun onCreateView(
        inflater: LayoutInflater ,
        container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.tour_list , container , false)

        places.add(
            Place(
                "Le Cirque, The Leela Palace" ,
                "Diplomatic Enclave,Chanakyapuri" ,
                "7:00 PM - 12:00 AM" ,
                "https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/le-cirque-table.jpg" ,
                "https://so.city/delhi/article/looking-for-a-posh-dining-experience-these-are-delhi-s-most-expensive-restaurants"
            )
        )
        places.add(
            Place(
                "Orient Express, Taj Palace Hotel" ,
                "Taj Palace, 2, Sardar Patel Marg, Diplomatic Enclave" ,
                "6:30 PM - 11:30 PM" ,
                "https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/orient-express1574317649910.jpg" ,
                "https://so.city/delhi/article/looking-for-a-posh-dining-experience-these-are-delhi-s-most-expensive-restaurants"
            )
        )
        places.add(
            Place(
                "Ottimo At West View, ITC Maurya" ,
                "ITC Maurya Diplomatic Enclave, Sardar Patel Marg" ,
                "7:00 PM - 11:45 PM" ,
                "https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/ottimo1574317649908.jpg" ,
                "https://so.city/delhi/article/looking-for-a-posh-dining-experience-these-are-delhi-s-most-expensive-restaurants"
            )
        )
        places.add(
            Place(
                "MEGU, The Leela Palace" ,
                "The Leela Palace, Diplomatic Enclave, Chanakyapuri" ,
                "12:30 - 2:30 PM & 7:00 PM - 12 Midnight" ,
                "https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/megu.jpg" ,
                "https://so.city/delhi/article/looking-for-a-posh-dining-experience-these-are-delhi-s-most-expensive-restaurants"
            )
        )
        places.add(
            Place(
                "Bukhara, ITC Maurya" ,
                "ITC Maurya, Sardar Patel Marg, Akhaura Block, Diplomatic Enclave, Chanakyapuri" ,
                "12:30 - 2:45 PM & 7:00 PM - 11:45 PM" ,
                "https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/bukhara1574317623090.jpg" ,
                "https://so.city/delhi/article/looking-for-a-posh-dining-experience-these-are-delhi-s-most-expensive-restaurants"
            )
        )
        places.add(
            Place(
                "Indian Accent" ,
                "The Lodhi, Lodhi Road" ,
                "12 Noon - 2:30 PM & 7:00 PM - 10:30 PM" ,
                "https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/indian-accent1574405266875.jpg" ,
                "https://so.city/delhi/article/looking-for-a-posh-dining-experience-these-are-delhi-s-most-expensive-restaurants"
            )
        )
        places.add(
            Place(
                "Kheer, Roseate House" ,
                "Kheer - Roseate House, Asset 10, Hospitality District, Aerocity" ,
                "7:00 PM - 11:30 PM" ,
                "https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/kheer.jpg" ,
                "https://so.city/delhi/article/looking-for-a-posh-dining-experience-these-are-delhi-s-most-expensive-restaurants"
            )
        )
        places.add(
            Place(
                "Sevilla - The Claridges" ,
                "The Claridges,12, Dr A.P.J. Abdul Kalam Road, Aurangzeb Road" ,
                "7:00 PM - 11:45 PM " ,
                "https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/81609317683440.jpg" ,
                "https://so.city/delhi/article/looking-for-a-posh-dining-experience-these-are-delhi-s-most-expensive-restaurants"
            )
        )
        places.add(
            Place(
                "Tian - Asian Cuisine Studio, ITC Maurya" ,
                "Asian Cuisine Studio - ITC Maurya, Chanakyapuri" ,
                "7:00 PM - 11:30 PM" ,
                "https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/91609317683619.jpg" ,
                "https://so.city/delhi/article/looking-for-a-posh-dining-experience-these-are-delhi-s-most-expensive-restaurants"
            )
        )
        places.add(
            Place(
                "Varq - The Taj Mahal Hotel" ,
                "The Taj Mahal Hotel, Mansingh Road" ,
                "12:30 PM - 2:45 PM & 7:00 - 11:30 PM" ,
                "https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/101609317683666.jpg" ,
                "https://so.city/delhi/article/looking-for-a-posh-dining-experience-these-are-delhi-s-most-expensive-restaurants"
            )
        )
        places.add(
            Place(
                "Olive Qutub" ,
                "6-8, Kalka Das Marg, Mehrauli" ,
                "1 PM - 12 Midnight" ,
                "https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/121609317683661.jpg" ,
                "https://so.city/delhi/article/looking-for-a-posh-dining-experience-these-are-delhi-s-most-expensive-restaurants"
            )
        )
        val adapter = PlaceAdapter(requireActivity() , places )
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
