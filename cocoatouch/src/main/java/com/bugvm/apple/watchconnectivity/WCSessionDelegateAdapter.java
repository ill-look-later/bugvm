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
package com.bugvm.apple.watchconnectivity;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WCSessionDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements WCSessionDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("sessionWatchStateDidChange:")
    public void watchStateDidChange(WCSession session) {}
    @NotImplemented("sessionReachabilityDidChange:")
    public void reachabilityDidChange(WCSession session) {}
    @NotImplemented("session:didReceiveMessage:")
    public void didReceiveMessage(WCSession session, NSDictionary<NSString, ?> message) {}
    @NotImplemented("session:didReceiveMessage:replyHandler:")
    public void didReceiveMessage(WCSession session, NSDictionary<NSString, ?> message, @Block VoidBlock1<NSDictionary<NSString, ?>> replyHandler) {}
    @NotImplemented("session:didReceiveMessageData:")
    public void didReceiveMessageData(WCSession session, NSData messageData) {}
    @NotImplemented("session:didReceiveMessageData:replyHandler:")
    public void didReceiveMessageData(WCSession session, NSData messageData, @Block VoidBlock1<NSData> replyHandler) {}
    @NotImplemented("session:didReceiveApplicationContext:")
    public void didReceiveApplicationContext(WCSession session, NSDictionary<NSString, ?> applicationContext) {}
    @NotImplemented("session:didFinishUserInfoTransfer:error:")
    public void didFinishUserInfoTransfer(WCSession session, WCSessionUserInfoTransfer userInfoTransfer, NSError error) {}
    @NotImplemented("session:didReceiveUserInfo:")
    public void didReceiveUserInfo(WCSession session, NSDictionary<NSString, ?> userInfo) {}
    @NotImplemented("session:didFinishFileTransfer:error:")
    public void didFinishFileTransfer(WCSession session, WCSessionFileTransfer fileTransfer, NSError error) {}
    @NotImplemented("session:didReceiveFile:")
    public void didReceiveFile(WCSession session, WCSessionFile file) {}
    /*</methods>*/
}
