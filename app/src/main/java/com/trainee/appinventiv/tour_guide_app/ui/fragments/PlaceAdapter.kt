package com.trainee.appinventiv.tour_guide_app.ui.fragments

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.FragmentActivity
import com.bumptech.glide.Glide
import com.trainee.appinventiv.tour_guide_app.MapsFragment
import com.trainee.appinventiv.tour_guide_app.Navigate
import com.trainee.appinventiv.tour_guide_app.R


class PlaceAdapter(context: Context , places: ArrayList<Place>) :
    ArrayAdapter<Place?>(context , 0 , places!! as List<Place?>) {
    @SuppressLint("ResourceType")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Check if an existing view is being reused, otherwise inflate the view
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                R.layout.list_item , parent , false
            )
        }

        // Get the {@link Place} object located at this position in the list
        val currentPlace = getItem(position)
        val placeNameTextView = listItemView!!.findViewById<TextView>(R.id.name)
        placeNameTextView.setText(currentPlace?.getPlaceName())
        val placeDescriptionTextView = listItemView.findViewById<TextView>(R.id.description)
        var frag =MapsFragment()

        var location = listItemView!!.findViewById<ImageView>(R.id.iv_location)
       location.setOnClickListener {
            Toast.makeText(context, "${currentPlace?.getPlaceName()}", Toast.LENGTH_SHORT).show()

           val intent = Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=${currentPlace?.getPlaceName()}&mode=l"))
           intent.setPackage("com.google.android.apps.maps")
           if(intent.resolveActivity(context.packageManager) != null)
              context.startActivity(intent)

       }
        if (currentPlace!!.hasDescription()) {
            placeDescriptionTextView.setText(currentPlace.getPlaceDescription())
            placeDescriptionTextView.visibility = View.VISIBLE
        } else {
            placeDescriptionTextView.visibility = View.GONE
        }
        val placeLocationTextView = listItemView.findViewById<TextView>(R.id.location)
        placeLocationTextView.setText(currentPlace.getPlaceLocation())
        val placeVisitingTime = listItemView.findViewById<TextView>(R.id.time)
        placeVisitingTime.setText(currentPlace.getPlaceVisitingTime())
        val placeImageView = listItemView.findViewById<ImageView>(R.id.imageView)
        if (!currentPlace.getPlaceImageResourceId().equals("null")) {
            Glide.with(context).load(currentPlace.getPlaceImageResourceId()).into(placeImageView)
        } else {
            Glide.with(context).load("https://kare.ee/images/no-image.jpg").into(placeImageView)
        }
        return listItemView
    }
}

private fun TextView.setText(placeDescription: Any) {

}
