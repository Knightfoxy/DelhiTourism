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


class MarketsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater ,
        container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.tour_list , container , false)
        val places: ArrayList<Place> = ArrayList<Place>()
        places.add(
            Place(
                "Old Delhi Shopping Market" ,
                "Chandni Chowk Delhi 110006" ,
                "The market usually open around 11 am and closes around 8 pm in the evening" ,
                "https://www.tourmyindia.com/states/delhi/images/old-delhi-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/old-delhi-shopping-market.html"
            )
        )
        places.add(
            Place(
                "Connaught Place Shopping Market" ,
                "Connaught Place New Delhi 110001" ,
                "The market usually opens around 11 am in the morning and goes on until 11 in the night" ,
                "https://www.tourmyindia.com/states/delhi/images/connaught-place-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/connaught-place-shopping-market.html"
            )
        )
        places.add(
            Place(
                "Palika Bazaar Shopping Market" ,
                "Palika BazarConnaught Place, New Delhi 110001" ,
                "Closed on Sunday and Monday, Palika opens up around 10 am and closes around 8 pm" ,
                "https://www.tourmyindia.com/states/delhi/images/palika-bazaar-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/palika-bazaar-shopping-market.html"
            )
        )
        places.add(
            Place(
                "Janpath Shopping Market" ,
                "Janpath Rd, Janpath, Connaught Place, New Delhi 110001" ,
                "The market opens up around 11 am and goes on until 10 in the night" ,
                "https://www.tourmyindia.com/states/delhi/images/janpath-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/janpath-shopping-market.html"
            )
        )
        places.add(
            Place(
                "Paharganj Shopping Market" ,
                "Paharganj, New Delhi 110055" ,
                "The market remains closed on Monday and opens on the rest of the days from 11 am to 9 pm" ,
                "https://www.tourmyindia.com/states/delhi/images/paharganj-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/paharganj-shopping-market.html"
            )
        )
        places.add(
            Place(
                "Dilli Haat Shopping Market" ,
                "INA Market, Dilli Haat, Kidwai Nagar West Delhi, 110023" ,
                "The Dilli Haat markets open up around 11 am and close by 9 pm" ,
                "https://www.tourmyindia.com/states/delhi/images/dilli-haat-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/dilli-haat-shopping-market.html"
            )
        )
        places.add(
            Place(
                "Sarojini Nagar Shopping Market " ,
                "Sarojini Nagar Market Sarojini Nagar, New Delhi 110023" ,
                "The market usually open around 10 am and closes around 9 pm The market is open from Tuesday to Sunday" ,
                "https://www.tourmyindia.com/states/delhi/images/sarojini-nagar-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/sarojini-nagar-shopping-market.html"
            )
        )
        places.add(
            Place(
                "Khan Market" ,
                "61A, Khan Market, Rabindra Nagar, New Delhi 110003" ,
                "The Khan market opens up around 10 am and closes around 11 pm The market remains open on all days except Sunday" ,
                "https://www.tourmyindia.com/states/delhi/images/khan-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/khan-shopping-market.html"
            )
        )
        places.add(
            Place(
                "Lajpat Nagar Shopping Market" ,
                "Lajpat Nagar New Delhi 110024" ,
                "The Lajpat Nagar market opens up at 10 am and closes around 9 pm The market remains open on all days except Monday" ,
                "https://www.tourmyindia.com/states/delhi/images/lajpat-nagar-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/lajpat-nagar-shopping-market.html"
            )
        )
        places.add(
            Place(
                "Nehru Place Shopping Market" ,
                "Nehru Pl Market Rd Nehru Place, New Delhi 110019" ,
                "The Nehru Place market opens around 10 and closes by 7 pm The tech market is closed on Sunday" ,
                "https://www.tourmyindia.com/states/delhi/images/nehru-place-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/nehru-place-shopping-market.html"
            )
        )
        places.add(
            Place(
                "INA Shopping Market" ,
                "Sri Aurobindo Marg, Aviation Colony, INA Colony, New Delhi 110023" ,
                "The Khan market opens up around 10 am and closes around 8:30 pm The market remains open on all days except Monday" ,
                "https://www.tourmyindia.com/states/delhi/images/ina-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/ina-shopping-market.html"
            )
        )
        places.add(
            Place(
                "Hauz Khas Shopping Market" ,
                "Hauz Khas Village, New Delhi 110002 India" ,
                "The Hauz Khas opens up around 10 am and closes around 11 pm The market remains open on all days" ,
                "https://www.tourmyindia.com/states/delhi/images/hauz-khas-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/hauz-khas-shopping-market.html"
            )
        )
        places.add(
            Place(
                "Karol Bagh Shopping Market" ,
                "Block 1, WEA, Karol Bagh, New Delhi 110060" ,
                "The market usually opens around 11 am in the morning and stays alive till 11 in the night" ,
                "https://www.tourmyindia.com/states/delhi/images/karol-bagh-shopping-market1-1.jpg" ,
                "https://www.tourmyindia.com/states/delhi/karol-bagh-shopping-market.html"
            )
        )
        val adapter = activity?.let { PlaceAdapter(it , places) }
        val listView = rootView.findViewById<ListView>(R.id.list)
        listView.adapter = adapter
        listView.onItemClickListener =
            OnItemClickListener { adapterView , view , position , l ->
                val currentPlace: Place? = adapter?.getItem(position)
                val heritagePlaceUri = Uri.parse(currentPlace?.placeUrl)
                val websiteIntent = Intent(Intent.ACTION_VIEW , heritagePlaceUri)
                startActivity(websiteIntent)
            }
        return rootView
    }
}
