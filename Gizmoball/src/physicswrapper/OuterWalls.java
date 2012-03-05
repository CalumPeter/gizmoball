package physicswrapper;

import model.GizmoMap;
import physicsengine.LineSegment;

public class OuterWalls extends PhysicsGizmo
{
	public OuterWalls(GizmoMap map)
	{
		objects.add(new LineSegment(0, 0, map.getWidth(), 0));
		objects.add(new LineSegment(map.getWidth(), 0, map.getWidth(), map.getHeight()));
		objects.add(new LineSegment(0, map.getHeight(), map.getWidth(), map.getHeight()));
		objects.add(new LineSegment(0, 0, 0, map.getHeight()));
	}
}
