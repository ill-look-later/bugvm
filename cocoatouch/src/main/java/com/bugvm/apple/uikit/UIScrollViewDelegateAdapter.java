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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIScrollViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIScrollViewDelegate/*</implements>*/ {

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
    @NotImplemented("scrollViewDidScroll:")
    public void didScroll(UIScrollView scrollView) {}
    /**
     * @since Available in iOS 3.2 and later.
     */
    @NotImplemented("scrollViewDidZoom:")
    public void didZoom(UIScrollView scrollView) {}
    @NotImplemented("scrollViewWillBeginDragging:")
    public void willBeginDragging(UIScrollView scrollView) {}
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public void willEndDragging(UIScrollView scrollView, @ByVal CGPoint velocity, CGPoint targetContentOffset) {}
    @NotImplemented("scrollViewDidEndDragging:willDecelerate:")
    public void didEndDragging(UIScrollView scrollView, boolean decelerate) {}
    @NotImplemented("scrollViewWillBeginDecelerating:")
    public void willBeginDecelerating(UIScrollView scrollView) {}
    @NotImplemented("scrollViewDidEndDecelerating:")
    public void didEndDecelerating(UIScrollView scrollView) {}
    @NotImplemented("scrollViewDidEndScrollingAnimation:")
    public void didEndScrollingAnimation(UIScrollView scrollView) {}
    @NotImplemented("viewForZoomingInScrollView:")
    public UIView getViewForZooming(UIScrollView scrollView) { return null; }
    /**
     * @since Available in iOS 3.2 and later.
     */
    @NotImplemented("scrollViewWillBeginZooming:withView:")
    public void willBeginZooming(UIScrollView scrollView, UIView view) {}
    @NotImplemented("scrollViewDidEndZooming:withView:atScale:")
    public void didEndZooming(UIScrollView scrollView, UIView view, @MachineSizedFloat double scale) {}
    @NotImplemented("scrollViewShouldScrollToTop:")
    public boolean shouldScrollToTop(UIScrollView scrollView) { return false; }
    @NotImplemented("scrollViewDidScrollToTop:")
    public void didScrollToTop(UIScrollView scrollView) {}
    /*</methods>*/
}
