package com.trainee.appinventiv.tour_guide_app.ui.fragments


class Place {
    var placeName: String
        private set
    var placeDescription = NO_DESCRIPTION_PROVIDED
        private set
    var placeLocation: String
        private set
    var placeVisitingTime: String
        private set
    var placeUrl: String
        private set
    var placeImageResourceId: String
        private set

    constructor(
        name: String ,
        description: String? ,
        location: String ,
        visitingTime: String ,
        imageResourceId: String ,
        url: String
    ) {
        placeName = name
        placeDescription = description
        placeLocation = location
        placeVisitingTime = visitingTime
        placeImageResourceId = imageResourceId
        placeUrl = url
    }

    constructor(
        name: String ,
        location: String ,
        visitingTime: String ,
        imageResourceId: String ,
        url: String
    ) {
        placeName = name
        placeLocation = location
        placeVisitingTime = visitingTime
        placeImageResourceId = imageResourceId
        placeUrl = url
    }

    fun hasDescription(): Boolean {
        return placeDescription !== NO_DESCRIPTION_PROVIDED
    }

    @JvmName("getPlaceImageResourceId1")
    fun getPlaceImageResourceId(): String? {
        return placeImageResourceId
    }


    companion object {
        private val NO_DESCRIPTION_PROVIDED: String? = null
    }


    @JvmName("getPlaceName1")
    fun getPlaceName(): String? {
        return placeName
    }

    @JvmName("getPlaceDescription1")
    fun getPlaceDescription(): String? {
        return placeDescription
    }

    @JvmName("getPlaceLocation1")
    fun getPlaceLocation(): String? {
        return placeLocation
    }

    @JvmName("getPlaceVisitingTime1")
    fun getPlaceVisitingTime(): String? {
        return placeVisitingTime
    }

    @JvmName("getPlaceUrl1")
    fun getPlaceUrl(): String? {
        return placeUrl
    }


}
