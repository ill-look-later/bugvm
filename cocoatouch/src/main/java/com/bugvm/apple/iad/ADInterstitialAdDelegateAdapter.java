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
package com.bugvm.apple.iad;

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
import com.bugvm.apple.mediaplayer.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.avkit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ADInterstitialAdDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ADInterstitialAdDelegate/*</implements>*/ {

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
    @NotImplemented("interstitialAdDidUnload:")
    public void didUnload(ADInterstitialAd interstitialAd) {}
    @NotImplemented("interstitialAd:didFailWithError:")
    public void didFail(ADInterstitialAd interstitialAd, NSError error) {}
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("interstitialAdWillLoad:")
    public void willLoad(ADInterstitialAd interstitialAd) {}
    @NotImplemented("interstitialAdDidLoad:")
    public void didLoad(ADInterstitialAd interstitialAd) {}
    @NotImplemented("interstitialAdActionShouldBegin:willLeaveApplication:")
    public boolean actionShouldBegin(ADInterstitialAd interstitialAd, boolean willLeave) { return false; }
    @NotImplemented("interstitialAdActionDidFinish:")
    public void actionDidFinish(ADInterstitialAd interstitialAd) {}
    /*</methods>*/
}
