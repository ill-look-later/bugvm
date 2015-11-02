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
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/UIViewAutoresizing/*</name>*/ extends Bits</*<name>*/UIViewAutoresizing/*</name>*/> {
    /*<values>*/
    public static final UIViewAutoresizing None = new UIViewAutoresizing(0L);
    public static final UIViewAutoresizing FlexibleLeftMargin = new UIViewAutoresizing(1L);
    public static final UIViewAutoresizing FlexibleWidth = new UIViewAutoresizing(2L);
    public static final UIViewAutoresizing FlexibleRightMargin = new UIViewAutoresizing(4L);
    public static final UIViewAutoresizing FlexibleTopMargin = new UIViewAutoresizing(8L);
    public static final UIViewAutoresizing FlexibleHeight = new UIViewAutoresizing(16L);
    public static final UIViewAutoresizing FlexibleBottomMargin = new UIViewAutoresizing(32L);
    /*</values>*/

    private static final /*<name>*/UIViewAutoresizing/*</name>*/[] values = _values(/*<name>*/UIViewAutoresizing/*</name>*/.class);

    public /*<name>*/UIViewAutoresizing/*</name>*/(long value) { super(value); }
    private /*<name>*/UIViewAutoresizing/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UIViewAutoresizing/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UIViewAutoresizing/*</name>*/(value, mask);
    }
    protected /*<name>*/UIViewAutoresizing/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UIViewAutoresizing/*</name>*/[] values() {
        return values.clone();
    }
}
