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
package com.bugvm.apple.coredata;

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
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSFetchRequestResultType/*</name>*/ extends Bits</*<name>*/NSFetchRequestResultType/*</name>*/> {
    /*<values>*/
    public static final NSFetchRequestResultType ManagedObject = new NSFetchRequestResultType(0L);
    public static final NSFetchRequestResultType ManagedObjectID = new NSFetchRequestResultType(1L);
    /**
     * @since Available in iOS 3.0 and later.
     */
    public static final NSFetchRequestResultType Dictionary = new NSFetchRequestResultType(2L);
    /**
     * @since Available in iOS 3.0 and later.
     */
    public static final NSFetchRequestResultType Count = new NSFetchRequestResultType(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSFetchRequestResultType/*</name>*/[] values = _values(/*<name>*/NSFetchRequestResultType/*</name>*/.class);

    public /*<name>*/NSFetchRequestResultType/*</name>*/(long value) { super(value); }
    private /*<name>*/NSFetchRequestResultType/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSFetchRequestResultType/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSFetchRequestResultType/*</name>*/(value, mask);
    }
    protected /*<name>*/NSFetchRequestResultType/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSFetchRequestResultType/*</name>*/[] values() {
        return values.clone();
    }
}
