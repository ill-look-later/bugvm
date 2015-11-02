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
package com.bugvm.apple.uikit;

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
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollisionBehavior/*</name>*/ 
    extends /*<extends>*/UIDynamicBehavior/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICollisionBehaviorPtr extends Ptr<UICollisionBehavior, UICollisionBehaviorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICollisionBehavior.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICollisionBehavior() {}
    protected UICollisionBehavior(SkipInit skipInit) { super(skipInit); }
    public UICollisionBehavior(List<UIDynamicItem> items) { super((SkipInit) null); initObject(init(items)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "items")
    public native List<UIDynamicItem> getItems();
    @Property(selector = "collisionMode")
    public native UICollisionBehaviorMode getCollisionMode();
    @Property(selector = "setCollisionMode:")
    public native void setCollisionMode(UICollisionBehaviorMode v);
    @Property(selector = "translatesReferenceBoundsIntoBoundary")
    public native boolean translatesReferenceBoundsIntoBoundary();
    @Property(selector = "setTranslatesReferenceBoundsIntoBoundary:")
    public native void setTranslatesReferenceBoundsIntoBoundary(boolean v);
    @Property(selector = "boundaryIdentifiers")
    public native NSArray getBoundaryIdentifiers();
    @Property(selector = "collisionDelegate")
    public native UICollisionBehaviorDelegate getCollisionDelegate();
    @Property(selector = "setCollisionDelegate:", strongRef = true)
    public native void setCollisionDelegate(UICollisionBehaviorDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithItems:")
    protected native @Pointer long init(List<UIDynamicItem> items);
    @Method(selector = "addItem:")
    public native void addItem(UIDynamicItem item);
    @Method(selector = "removeItem:")
    public native void removeItem(UIDynamicItem item);
    @Method(selector = "setTranslatesReferenceBoundsIntoBoundaryWithInsets:")
    public native void setTranslatesReferenceBoundsIntoBoundaryWithInsets(@ByVal UIEdgeInsets insets);
    @Method(selector = "addBoundaryWithIdentifier:forPath:")
    public native void addBoundary(NSObject identifier, UIBezierPath bezierPath);
    @Method(selector = "addBoundaryWithIdentifier:fromPoint:toPoint:")
    public native void addBoundary(NSObject identifier, @ByVal CGPoint p1, @ByVal CGPoint p2);
    @Method(selector = "boundaryWithIdentifier:")
    public native UIBezierPath getBoundary(NSObject identifier);
    @Method(selector = "removeBoundaryWithIdentifier:")
    public native void removeBoundary(NSObject identifier);
    @Method(selector = "removeAllBoundaries")
    public native void removeAllBoundaries();
    /*</methods>*/
}
