/*
Copyright (c) 2009-2010 Mikko Mononen memon@inside.org
Recast4J Copyright (c) 2015 Piotr Piastucki piotr@jtilia.org

This software is provided 'as-is', without any express or implied
warranty.  In no event will the authors be held liable for any damages
arising from the use of this software.
Permission is granted to anyone to use this software for any purpose,
including commercial applications, and to alter it and redistribute it
freely, subject to the following restrictions:
1. The origin of this software must not be misrepresented; you must not
 claim that you wrote the original software. If you use this software
 in a product, an acknowledgment in the product documentation would be
 appreciated but is not required.
2. Altered source versions must be plainly marked as such, and must not be
 misrepresented as being the original software.
3. This notice may not be removed or altered from any source distribution.
*/
package org.recast4j.detour.tilecache;

import java.util.ArrayList;
import java.util.List;

public class TileCacheObstacle {

	final int index;
	float[] pos = new float[3];
	float radius, height;
	List<Long> touched = new ArrayList<>();
	List<Long> pending = new ArrayList<>();
	int salt;
	ObstacleState state = ObstacleState.DT_OBSTACLE_EMPTY;
	TileCacheObstacle next;

	public TileCacheObstacle(int index) {
		this.index = index;
	}

	public void reset() {
		for (int i = 0; i < 3; i++) {
			pos[i] = 0;
		}
		radius = 0;
		height = 0;
		touched.clear();
		pending.clear();
		salt = 0;
		state = ObstacleState.DT_OBSTACLE_EMPTY;
		next = null;
	}
}
