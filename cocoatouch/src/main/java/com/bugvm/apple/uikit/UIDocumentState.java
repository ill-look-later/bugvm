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
public final class /*<name>*/UIDocumentState/*</name>*/ extends Bits</*<name>*/UIDocumentState/*</name>*/> {
    /*<values>*/
    public static final UIDocumentState Normal = new UIDocumentState(0L);
    public static final UIDocumentState Closed = new UIDocumentState(1L);
    public static final UIDocumentState InConflict = new UIDocumentState(2L);
    public static final UIDocumentState SavingError = new UIDocumentState(4L);
    public static final UIDocumentState EditingDisabled = new UIDocumentState(8L);
    public static final UIDocumentState ProgressAvailable = new UIDocumentState(16L);
    /*</values>*/

    private static final /*<name>*/UIDocumentState/*</name>*/[] values = _values(/*<name>*/UIDocumentState/*</name>*/.class);

    public /*<name>*/UIDocumentState/*</name>*/(long value) { super(value); }
    private /*<name>*/UIDocumentState/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UIDocumentState/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UIDocumentState/*</name>*/(value, mask);
    }
    protected /*<name>*/UIDocumentState/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UIDocumentState/*</name>*/[] values() {
        return values.clone();
    }
}
