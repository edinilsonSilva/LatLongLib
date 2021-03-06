package org.gps.utils.test;

import org.gps.utils.LatLonPoint;
import org.gps.utils.ReferenceEllipsoids;
import org.gps.utils.UTMPoint;
import org.gps.utils.UTMUtils;


public class TestUTMUtils {
	public static void main(String[] args) {
		testUTMConversions();
	}

	private static void testUTMConversions() {
		
		System.out.println();
		System.out.println("========================");
		System.out.println("Start Testing UTM Conversions");
		UTMPoint utmPoint = UTMUtils.LLtoUTM(ReferenceEllipsoids.SOUTH_AMERICAN_1969, -2.031746, -65.854067);
		System.out.println(utmPoint.getZoneLetter()+","+utmPoint.getZoneNumber());
		
		UTMPoint utmPoint2 = new UTMPoint(4316911.7, 330363.8, 18, 'S');
		LatLonPoint llpoint = UTMUtils.UTMtoLL(ReferenceEllipsoids.SOUTH_AMERICAN_1969, utmPoint2);
		System.out.println(llpoint.getLatitude()+","+llpoint.getLongitude());
		
		System.out.println("end Testing UTM Conversions");
		System.out.println("========================");
	}
	
}
