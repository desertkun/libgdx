/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btGimBvhTreeNodeArray extends BulletBase {
	private long swigCPtr;
	
	protected btGimBvhTreeNodeArray(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGimBvhTreeNodeArray, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGimBvhTreeNodeArray(long cPtr, boolean cMemoryOwn) {
		this("btGimBvhTreeNodeArray", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGimBvhTreeNodeArray obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btGimBvhTreeNodeArray(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btGimBvhTreeNodeArray operatorAssignment(btGimBvhTreeNodeArray other) {
    return new btGimBvhTreeNodeArray(CollisionJNI.btGimBvhTreeNodeArray_operatorAssignment(swigCPtr, this, btGimBvhTreeNodeArray.getCPtr(other), other), false);
  }

  public btGimBvhTreeNodeArray() {
    this(CollisionJNI.new_btGimBvhTreeNodeArray__SWIG_0(), true);
  }

  public btGimBvhTreeNodeArray(btGimBvhTreeNodeArray otherArray) {
    this(CollisionJNI.new_btGimBvhTreeNodeArray__SWIG_1(btGimBvhTreeNodeArray.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return CollisionJNI.btGimBvhTreeNodeArray_size(swigCPtr, this);
  }

  public GIM_BVH_TREE_NODE atConst(int n) {
    return new GIM_BVH_TREE_NODE(CollisionJNI.btGimBvhTreeNodeArray_atConst(swigCPtr, this, n), false);
  }

  public GIM_BVH_TREE_NODE at(int n) {
    return new GIM_BVH_TREE_NODE(CollisionJNI.btGimBvhTreeNodeArray_at(swigCPtr, this, n), false);
  }

  public GIM_BVH_TREE_NODE operatorSubscriptConst(int n) {
    return new GIM_BVH_TREE_NODE(CollisionJNI.btGimBvhTreeNodeArray_operatorSubscriptConst(swigCPtr, this, n), false);
  }

  public GIM_BVH_TREE_NODE operatorSubscript(int n) {
    return new GIM_BVH_TREE_NODE(CollisionJNI.btGimBvhTreeNodeArray_operatorSubscript(swigCPtr, this, n), false);
  }

  public void clear() {
    CollisionJNI.btGimBvhTreeNodeArray_clear(swigCPtr, this);
  }

  public void pop_back() {
    CollisionJNI.btGimBvhTreeNodeArray_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    CollisionJNI.btGimBvhTreeNodeArray_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, GIM_BVH_TREE_NODE fillData) {
    CollisionJNI.btGimBvhTreeNodeArray_resize__SWIG_0(swigCPtr, this, newsize, GIM_BVH_TREE_NODE.getCPtr(fillData), fillData);
  }

  public void resize(int newsize) {
    CollisionJNI.btGimBvhTreeNodeArray_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public GIM_BVH_TREE_NODE expandNonInitializing() {
    return new GIM_BVH_TREE_NODE(CollisionJNI.btGimBvhTreeNodeArray_expandNonInitializing(swigCPtr, this), false);
  }

  public GIM_BVH_TREE_NODE expand(GIM_BVH_TREE_NODE fillValue) {
    return new GIM_BVH_TREE_NODE(CollisionJNI.btGimBvhTreeNodeArray_expand__SWIG_0(swigCPtr, this, GIM_BVH_TREE_NODE.getCPtr(fillValue), fillValue), false);
  }

  public GIM_BVH_TREE_NODE expand() {
    return new GIM_BVH_TREE_NODE(CollisionJNI.btGimBvhTreeNodeArray_expand__SWIG_1(swigCPtr, this), false);
  }

  public void push_back(GIM_BVH_TREE_NODE _Val) {
    CollisionJNI.btGimBvhTreeNodeArray_push_back(swigCPtr, this, GIM_BVH_TREE_NODE.getCPtr(_Val), _Val);
  }

  public int capacity() {
    return CollisionJNI.btGimBvhTreeNodeArray_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    CollisionJNI.btGimBvhTreeNodeArray_reserve(swigCPtr, this, _Count);
  }

  static public class less extends BulletBase {
  	private long swigCPtr;
  	
  	protected less(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new less, normally you should not need this constructor it's intended for low-level usage. */ 
  	public less(long cPtr, boolean cMemoryOwn) {
  		this("less", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(less obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				CollisionJNI.delete_btGimBvhTreeNodeArray_less(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public less() {
      this(CollisionJNI.new_btGimBvhTreeNodeArray_less(), true);
    }
  
  }

  public void swap(int index0, int index1) {
    CollisionJNI.btGimBvhTreeNodeArray_swap(swigCPtr, this, index0, index1);
  }

  public void removeAtIndex(int index) {
    CollisionJNI.btGimBvhTreeNodeArray_removeAtIndex(swigCPtr, this, index);
  }

  public void initializeFromBuffer(long buffer, int size, int capacity) {
    CollisionJNI.btGimBvhTreeNodeArray_initializeFromBuffer(swigCPtr, this, buffer, size, capacity);
  }

  public void copyFromArray(btGimBvhTreeNodeArray otherArray) {
    CollisionJNI.btGimBvhTreeNodeArray_copyFromArray(swigCPtr, this, btGimBvhTreeNodeArray.getCPtr(otherArray), otherArray);
  }

}
