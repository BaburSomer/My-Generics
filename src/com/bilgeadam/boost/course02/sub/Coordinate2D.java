package com.bilgeadam.boost.course02.sub;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Coordinate2D<T extends Number> implements ComparableCoordinates {
	private T x;
	private T y;
	
	@Override
	public boolean isNearToCentre(ComparableCoordinates otherPoint) {
		// TODO Auto-generated method stub
		return false;
	}
}
