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
package com.bugvm.apple.corelocation;

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
import com.bugvm.apple.addressbook.*;
import com.bugvm.apple.corebluetooth.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreLocation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLBeaconRegion/*</name>*/ 
    extends /*<extends>*/CLRegion/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLBeaconRegionPtr extends Ptr<CLBeaconRegion, CLBeaconRegionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLBeaconRegion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CLBeaconRegion() {}
    protected CLBeaconRegion(SkipInit skipInit) { super(skipInit); }
    public CLBeaconRegion(NSUUID proximityUUID, String identifier) { super((SkipInit) null); initObject(init(proximityUUID, identifier)); }
    public CLBeaconRegion(NSUUID proximityUUID, short major, String identifier) { super((SkipInit) null); initObject(init(proximityUUID, major, identifier)); }
    public CLBeaconRegion(NSUUID proximityUUID, short major, short minor, String identifier) { super((SkipInit) null); initObject(init(proximityUUID, major, minor, identifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "proximityUUID")
    public native NSUUID getProximityUUID();
    @Property(selector = "major")
    public native NSNumber getMajor();
    @Property(selector = "minor")
    public native NSNumber getMinor();
    @Property(selector = "notifyEntryStateOnDisplay")
    public native boolean notifiesEntryStateOnDisplay();
    @Property(selector = "setNotifyEntryStateOnDisplay:")
    public native void setNotifiesEntryStateOnDisplay(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithProximityUUID:identifier:")
    protected native @Pointer long init(NSUUID proximityUUID, String identifier);
    @Method(selector = "initWithProximityUUID:major:identifier:")
    protected native @Pointer long init(NSUUID proximityUUID, short major, String identifier);
    @Method(selector = "initWithProximityUUID:major:minor:identifier:")
    protected native @Pointer long init(NSUUID proximityUUID, short major, short minor, String identifier);
    @WeaklyLinked
    @Method(selector = "peripheralDataWithMeasuredPower:")
    public native CBAdvertisementData getPeripheralData(NSNumber measuredPower);
    /*</methods>*/
}
