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
package com.bugvm.apple.coremedia;

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
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.corevideo.*;
import com.bugvm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreMedia") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CMSampleBufferDroppedFrameReason/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMSampleBufferDroppedFrameReason/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CMSampleBufferDroppedFrameReason toObject(Class<CMSampleBufferDroppedFrameReason> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CMSampleBufferDroppedFrameReason.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CMSampleBufferDroppedFrameReason o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CMSampleBufferDroppedFrameReason> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CMSampleBufferDroppedFrameReason> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CMSampleBufferDroppedFrameReason.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CMSampleBufferDroppedFrameReason> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CMSampleBufferDroppedFrameReason o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final CMSampleBufferDroppedFrameReason FrameWasLate = new CMSampleBufferDroppedFrameReason("FrameWasLate");
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final CMSampleBufferDroppedFrameReason OutOfBuffers = new CMSampleBufferDroppedFrameReason("OutOfBuffers");
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final CMSampleBufferDroppedFrameReason Discontinuity = new CMSampleBufferDroppedFrameReason("Discontinuity");
    /*</constants>*/
    
    private static /*<name>*/CMSampleBufferDroppedFrameReason/*</name>*/[] values = new /*<name>*/CMSampleBufferDroppedFrameReason/*</name>*/[] {/*<value_list>*/FrameWasLate, OutOfBuffers, Discontinuity/*</value_list>*/};
    
    /*<name>*/CMSampleBufferDroppedFrameReason/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CMSampleBufferDroppedFrameReason/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CMSampleBufferDroppedFrameReason/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CMSampleBufferDroppedFrameReason/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreMedia") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 6.0 and later.
         */
        @GlobalValue(symbol="kCMSampleBufferDroppedFrameReason_FrameWasLate", optional=true)
        public static native CFString FrameWasLate();
        /**
         * @since Available in iOS 6.0 and later.
         */
        @GlobalValue(symbol="kCMSampleBufferDroppedFrameReason_OutOfBuffers", optional=true)
        public static native CFString OutOfBuffers();
        /**
         * @since Available in iOS 6.0 and later.
         */
        @GlobalValue(symbol="kCMSampleBufferDroppedFrameReason_Discontinuity", optional=true)
        public static native CFString Discontinuity();
        /*</values>*/
    }
}
