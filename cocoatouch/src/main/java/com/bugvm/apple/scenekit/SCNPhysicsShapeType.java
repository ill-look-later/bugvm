/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.scenekit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.glkit.*;
import com.bugvm.apple.spritekit.*;
import com.bugvm.apple.opengles.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/SCNPhysicsShapeType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNPhysicsShapeType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/SCNPhysicsShapeType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static SCNPhysicsShapeType toObject(Class<SCNPhysicsShapeType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return SCNPhysicsShapeType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(SCNPhysicsShapeType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<SCNPhysicsShapeType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<SCNPhysicsShapeType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(SCNPhysicsShapeType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<SCNPhysicsShapeType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (SCNPhysicsShapeType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final SCNPhysicsShapeType BoundingBox = new SCNPhysicsShapeType("BoundingBox");
    public static final SCNPhysicsShapeType ConvexHull = new SCNPhysicsShapeType("ConvexHull");
    public static final SCNPhysicsShapeType ConcavePolyhedron = new SCNPhysicsShapeType("ConcavePolyhedron");
    /*</constants>*/
    
    private static /*<name>*/SCNPhysicsShapeType/*</name>*/[] values = new /*<name>*/SCNPhysicsShapeType/*</name>*/[] {/*<value_list>*/BoundingBox, ConvexHull, ConcavePolyhedron/*</value_list>*/};
    
    /*<name>*/SCNPhysicsShapeType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/SCNPhysicsShapeType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/SCNPhysicsShapeType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/SCNPhysicsShapeType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("SceneKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="SCNPhysicsShapeTypeBoundingBox", optional=true)
        public static native NSString BoundingBox();
        @GlobalValue(symbol="SCNPhysicsShapeTypeConvexHull", optional=true)
        public static native NSString ConvexHull();
        @GlobalValue(symbol="SCNPhysicsShapeTypeConcavePolyhedron", optional=true)
        public static native NSString ConcavePolyhedron();
        /*</values>*/
    }
}
