/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2013-2016 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.map;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;

import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@Kroll.module(name = "Map", id = "ti.map")
public class MapModule extends KrollModule
{
	public static final String EVENT_MAP_CLICK = "mapclick";
	public static final String EVENT_POI_CLICK = "poiclick";
	public static final String EVENT_PIN_CHANGE_DRAG_STATE = "pinchangedragstate";
	public static final String EVENT_ON_SNAPSHOT_READY = "onsnapshotready";
	public static final String EVENT_REGION_WILL_CHANGE = "regionwillchange";
	public static final String EVENT_USER_LOCATION = "userLocation";

	public static final String PROPERTY_DRAGGABLE = "draggable";
	public static final String PROPERTY_POINTS = "points";
	public static final String PROPERTY_TRAFFIC = "traffic";
	public static final String PROPERTY_MAP = "map";
	public static final String PROPERTY_SHAPE = "shape";
	public static final String PROPERTY_SHAPE_TYPE = "shapeType";
	public static final String PROPERTY_NEWSTATE = "newState";
	public static final String PROPERTY_CUSTOM_VIEW = "customView";
	public static final String PROPERTY_PIN = "pin";
	public static final String PROPERTY_INFO_WINDOW = "infoWindow";
	public static final String PROPERTY_LEFT_PANE = "leftPane";
	public static final String PROPERTY_RIGHT_PANE = "rightPane";
	public static final String PROPERTY_SHOW_INFO_WINDOW = "showInfoWindow";
	public static final String PROPERTY_USER_LOCATION_BUTTON = "userLocationButton";
	public static final String PROPERTY_COMPASS_ENABLED = "compassEnabled";
	public static final String PROPERTY_SCROLL_ENABLED = "scrollEnabled";
	public static final String PROPERTY_ZOOM_ENABLED = "zoomEnabled";
	public static final String PROPERTY_MAP_TOOLBAR_ENABLED = "mapToolbarEnabled";
	public static final String PROPERTY_PADDING = "padding";
	public static final String PROPERTY_TILT = "tilt";
	public static final String PROPERTY_BEARING = "bearing";
	public static final String PROPERTY_ZOOM = "zoom";
	public static final String PROPERTY_ZORDER_ON_TOP = "zOrderOnTop";
	public static final String PROPERTY_CENTER_OFFSET = "centerOffset";
	public static final String PROPERTY_PANNING = "panning";
	public static final String PROPERTY_STREET_NAMES = "streetNames";
	public static final String PROPERTY_USER_NAVIGATION = "userNavigation";
	public static final String PROPERTY_HIDDEN = "hidden";
	public static final String PROPERTY_CLUSTER_IDENTIFIER = "clusterIdentifier";
	public static final String PROPERTY_STROKE_COLOR = "strokeColor";
	public static final String PROPERTY_STROKE_WIDTH = "strokeWidth";
	public static final String PROPERTY_FILL_COLOR = "fillColor";
	public static final String PROPERTY_ZINDEX = "zIndex";
	public static final String PROPERTY_POLYGON = "polygon";
	public static final String PROPERTY_POLYGONS = "polygons";
	public static final String PROPERTY_POLYLINE = "polyline";
	public static final String PROPERTY_POLYLINES = "polylines";
	public static final String PROPERTY_CIRCLE = "circle";
	public static final String PROPERTY_CIRCLES = "circles";
	public static final String PROPERTY_CENTER = "center";
	public static final String PROPERTY_RADIUS = "radius";
	public static final String PROPERTY_INDOOR_ENABLED = "indoorEnabled";
	public static final String PROPERTY_PLACE_ID = "placeID";

	@Kroll.constant
	public static final int NORMAL_TYPE = GoogleMap.MAP_TYPE_NORMAL;
	@Kroll.constant
	public static final int TERRAIN_TYPE = GoogleMap.MAP_TYPE_TERRAIN;
	@Kroll.constant
	public static final int SATELLITE_TYPE = GoogleMap.MAP_TYPE_SATELLITE;
	@Kroll.constant
	public static final int HYBRID_TYPE = GoogleMap.MAP_TYPE_HYBRID;
	@Kroll.constant
	public static final int MUTED_STANDARD_TYPE = GoogleMap.MAP_TYPE_NORMAL;
	@Kroll.constant
	public static final int ANNOTATION_DRAG_STATE_START = 0;
	@Kroll.constant
	public static final int ANNOTATION_DRAG_STATE_END = 1;

	@Kroll.constant
	public static final int SUCCESS = 0;
	@Kroll.constant
	public static final int SERVICE_MISSING = 1;
	@Kroll.constant
	public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
	@Kroll.constant
	public static final int SERVICE_DISABLED = 3;
	@Kroll.constant
	public static final int SERVICE_INVALID = 9;

	@Kroll.constant
	public static final float ANNOTATION_AZURE = BitmapDescriptorFactory.HUE_AZURE;
	@Kroll.constant
	public static final float ANNOTATION_BLUE = BitmapDescriptorFactory.HUE_BLUE;
	@Kroll.constant
	public static final float ANNOTATION_CYAN = BitmapDescriptorFactory.HUE_CYAN;
	@Kroll.constant
	public static final float ANNOTATION_GREEN = BitmapDescriptorFactory.HUE_GREEN;
	@Kroll.constant
	public static final float ANNOTATION_MAGENTA = BitmapDescriptorFactory.HUE_MAGENTA;
	@Kroll.constant
	public static final float ANNOTATION_ORANGE = BitmapDescriptorFactory.HUE_ORANGE;
	@Kroll.constant
	public static final float ANNOTATION_RED = BitmapDescriptorFactory.HUE_RED;
	@Kroll.constant
	public static final float ANNOTATION_ROSE = BitmapDescriptorFactory.HUE_ROSE;
	@Kroll.constant
	public static final float ANNOTATION_VIOLET = BitmapDescriptorFactory.HUE_VIOLET;
	@Kroll.constant
	public static final float ANNOTATION_YELLOW = BitmapDescriptorFactory.HUE_YELLOW;
	@Kroll.constant
	public static final float ANNOTATION_PURPLE = 276.92f; // Based on the HUI color scheme

	@Kroll.constant
	public static final int REASON_API_ANIMATION = GoogleMap.OnCameraMoveStartedListener.REASON_API_ANIMATION;
	@Kroll.constant
	public static final int REASON_DEVELOPER_ANIMATION =
		GoogleMap.OnCameraMoveStartedListener.REASON_DEVELOPER_ANIMATION;
	@Kroll.constant
	public static final int REASON_GESTURE = GoogleMap.OnCameraMoveStartedListener.REASON_GESTURE;

	@Kroll.constant
	public static final int POLYLINE_PATTERN_DASHED = 0;
	@Kroll.constant
	public static final int POLYLINE_PATTERN_DOTTED = 1;

	public MapModule()
	{
		super();
		MapsInitializer.initialize(TiApplication.getInstance().getApplicationContext());
	}

	@Kroll.method
	public int isGooglePlayServicesAvailable()
	{
		return GooglePlayServicesUtil.isGooglePlayServicesAvailable(TiApplication.getAppRootOrCurrentActivity());
	}
}
