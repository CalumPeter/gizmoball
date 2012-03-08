package model.gizmos;

import model.GizmoType;

public class TriangleBumper extends Bumper
{
	private int orientation;
	
	public TriangleBumper(int x, int y, int orientation)
	{
		super(x, y, 20, 20);
		this.orientation = orientation;
	}
	
	public GizmoType getType()
	{
		return GizmoType.TriangleBumper;
	}
	
	public int getOrientation()
	{
		return orientation;
	}
	
	@Override
	public void rotate()
	{
		orientation = (orientation + 1) % 4;
	}
}
