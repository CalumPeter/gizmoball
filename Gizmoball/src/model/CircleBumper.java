package model;

import java.util.Observable;

public class CircleBumper extends Bumper implements IGizmo
{
	public CircleBumper(int x, int y)
	{
		super(x, y, 1, 1);
	}
	
	public GizmoType getType()
	{
		return GizmoType.CircleBumper;
	}
}
