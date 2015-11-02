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
package com.bugvm.apple.foundation;

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
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.security.*;
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public final class /*<name>*/NSTextCheckingType/*</name>*/ extends Bits</*<name>*/NSTextCheckingType/*</name>*/> {
    /*<values>*/
    public static final NSTextCheckingType None = new NSTextCheckingType(0L);
    public static final NSTextCheckingType Orthography = new NSTextCheckingType(1L);
    public static final NSTextCheckingType Spelling = new NSTextCheckingType(2L);
    public static final NSTextCheckingType Grammar = new NSTextCheckingType(4L);
    public static final NSTextCheckingType Date = new NSTextCheckingType(8L);
    public static final NSTextCheckingType Address = new NSTextCheckingType(16L);
    public static final NSTextCheckingType Link = new NSTextCheckingType(32L);
    public static final NSTextCheckingType Quote = new NSTextCheckingType(64L);
    public static final NSTextCheckingType Dash = new NSTextCheckingType(128L);
    public static final NSTextCheckingType Replacement = new NSTextCheckingType(256L);
    public static final NSTextCheckingType Correction = new NSTextCheckingType(512L);
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final NSTextCheckingType RegularExpression = new NSTextCheckingType(1024L);
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final NSTextCheckingType PhoneNumber = new NSTextCheckingType(2048L);
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final NSTextCheckingType TransitInformation = new NSTextCheckingType(4096L);
    /*</values>*/

    private static final /*<name>*/NSTextCheckingType/*</name>*/[] values = _values(/*<name>*/NSTextCheckingType/*</name>*/.class);

    public /*<name>*/NSTextCheckingType/*</name>*/(long value) { super(value); }
    private /*<name>*/NSTextCheckingType/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSTextCheckingType/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSTextCheckingType/*</name>*/(value, mask);
    }
    protected /*<name>*/NSTextCheckingType/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSTextCheckingType/*</name>*/[] values() {
        return values.clone();
    }
}
