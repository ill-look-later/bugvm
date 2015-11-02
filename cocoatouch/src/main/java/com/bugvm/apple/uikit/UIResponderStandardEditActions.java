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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIResponderStandardEditActions/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Method(selector = "cut:")
    void cut(NSObject sender);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Method(selector = "copy:")
    void copy(NSObject sender);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Method(selector = "paste:")
    void paste(NSObject sender);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Method(selector = "select:")
    void select(NSObject sender);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Method(selector = "selectAll:")
    void selectAll(NSObject sender);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Method(selector = "delete:")
    void delete(NSObject sender);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "makeTextWritingDirectionLeftToRight:")
    void makeTextWritingDirectionLeftToRight(NSObject sender);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "makeTextWritingDirectionRightToLeft:")
    void makeTextWritingDirectionRightToLeft(NSObject sender);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "toggleBoldface:")
    void toggleBoldface(NSObject sender);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "toggleItalics:")
    void toggleItalics(NSObject sender);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "toggleUnderline:")
    void toggleUnderline(NSObject sender);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "increaseSize:")
    void increaseSize(NSObject sender);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "decreaseSize:")
    void decreaseSize(NSObject sender);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
