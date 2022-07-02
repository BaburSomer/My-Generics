package com.bilgeadam.boost.course02.sub;

import java.util.ArrayList;
import java.util.List;

public class PlayWithCoordinates {

	public static void main(String[] args) {
		Coordinate2D<Integer> coord2D1 = new Coordinate2D<>(1, 2);
		Coordinate2D<Double>  coord2D2 = new Coordinate2D<>(5.2, 25.78);

		Coordinate3D<Integer> coord3D1 = new Coordinate3D<>(1, 2, 7);
		Coordinate3D<Integer> coord3D11 = new Coordinate3D<>(1, 2, 7);
		Coordinate3D<Float>   coord3D2 = new Coordinate3D<>(5.6f, 25.7f, 36.8f);
		
//		Coordinate2D<String> xx;

		System.out.println(coord2D1);
		System.out.println(coord2D2);
		System.out.println(coord3D1);
		System.out.println(coord3D2);
		
		List<ComparableCoordinates> coords = new ArrayList<>();
		coords.add(coord2D1);
		coords.add(coord2D2);
		
		Coordinate2D some2DCoord;
		some2DCoord = coord2D1;
		some2DCoord = coord2D2;
	}

}
