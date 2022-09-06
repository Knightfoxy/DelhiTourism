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
import com.trainee.appinventiv.tour_guide_app.Navigate
import com.trainee.appinventiv.tour_guide_app.R

class EventsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater ,
        container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.tour_list , container , false)
        val places: ArrayList<Place> = ArrayList<Place>()
        places.add(
            Place(
                "India International Trade Fair" ,
                "Pragati Maidan, New Delhi, Delhi 110001" ,
                "14 Nov, 2021 – Sat, 27 Nov, 2021" ,
                "https://tradefairsinindia.com/wp-content/uploads/2019/12/800px-2008Overview1.jpg" ,
                "https://indiatradefair.com/iitf/"
            )
        )
        places.add(
            Place(
                "Delhi Auto Expo" ,
                "Pragati Maidan, New Delhi, Delhi 110001" ,
                "August 6 to 8, 2021" ,
                "https://resize.indiatvnews.com/en/resize/oldbucket/715_-/businessindia/Delhi-Auto-Expo9983.jpg" ,
                "http://www.autoexpo.in/"
            )
        )
        places.add(
            Place(
                "Delhi Book Fair" ,
                "Pragati Maidan, New Delhi, Delhi 110001" ,
                "September 3 to September 5, 2021" ,
                "https://www.dailypioneer.com/uploads/2018/story/images/big/232563_Untitled-9.jpg" ,
                "https://indiatradefair.com/micro-delhi-fair/"
            )
        )
        places.add(
            Place(
                "Udyanotsav" ,
                "Mughal Garden Rashtrapati Bhawan" ,
                "February 13, 2021 to March 21, 2021 (except on Mondays which are maintenance days)" ,
                "https://vajiramandravi.s3.us-east-1.amazonaws.com/media/2021/2/12/11/29/13/UDYAA.jpg" ,
                "rashtrapatisachivalaya.gov.in"
            )
        )
        places.add(
            Place(
                "Surajkund crafts mela" ,
                "Unnamed Road, Lakewood city, Surajkund, Faridabad, Haryana 121010" ,
                "1st to the 15th of February, 2021" ,
                "https://www.holidify.com/images/cmsuploads/compressed/LTD7K_5760_resize_20180221123800.JPG" ,
                "https://www.holidify.com/pages/surajkund-mela-364.html"
            )
        )
        places.add(
            Place(
                "Phoolwalon ki Sair" ,
                "Mehrauli Delhi" ,
                "October 10 to October 18, 2021" ,
                "https://janataweekly.org/wp-content/uploads/2019/12/f_1528455997e.jpg" ,
                "https://www.mapsofindia.com/events/delhi/phool-walon-ki-sair.html"
            )
        )
        places.add(
            Place(
                "Qutab festival of music and dance" ,
                "Qutub complex in Mehrauli, New Delhi, India" ,
                "November-December, 2021" ,
                "https://www.india-tours.com/images/festivals/qutub-festival/qutub-festival3.jpg" ,
                "https://www.india-tours.com/fairs-and-festivals/qutub-festival-delhi.html"
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
