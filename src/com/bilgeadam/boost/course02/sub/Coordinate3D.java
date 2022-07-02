package com.bilgeadam.boost.course02.sub;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Coordinate3D<T extends Number> implements ComparableCoordinates{
	private T x;
	private T y;
	private T z;
	
	@Override
	public boolean isNearToCentre(ComparableCoordinates otherPoint) {
		return false;
	}

}
