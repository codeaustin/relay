package com.relay.codeaustin.relay

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.maps.MapView

class HomeActivity : AppCompatActivity() {

    private var mapView: MapView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Mapbox.getInstance(this, "pk.eyJ1IjoibWFsZWs3MTM5NyIsImEiOiJjajRoemdoOXEwM3k1MzNvamcwazU2djRnIn0.jnxfaDjKdKAGJdWTy2kthg")
        setContentView(R.layout.activity_home)
        mapView = findViewById(R.id.mapView) as MapView
        mapView!!.onCreate(savedInstanceState)
    }
}
