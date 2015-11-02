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
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.security.*;
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
@Marshaler(NSErrorUserInfo.Marshaler.class)
/*<annotations>*/@Library("Foundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSErrorUserInfo/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Marshaler {
        @MarshalsPointer
        public static NSErrorUserInfo toObject(Class<NSErrorUserInfo> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new NSErrorUserInfo(o);
        }
        @MarshalsPointer
        public static long toNative(NSErrorUserInfo o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    
    /*<ptr>*/
    /*</ptr>*/
    private CFDictionary data;
    
    protected NSErrorUserInfo(CFDictionary data) {
        this.data = data;
    }
    public NSErrorUserInfo() {
        this.data = CFMutableDictionary.create();
    }
    /*<bind>*/static { Bro.bind(NSErrorUserInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public CFDictionary getDictionary() {
        return data;
    }
    
    public NSErrorUserInfo set(String attribute, NSObject value) {
        data.put(new NSString(attribute), value);
        return this;
    }
    public NSErrorUserInfo set(NSErrorUserInfoKey attribute, NSObject value) {
        data.put(attribute.value(), value);
        return this;
    }
    public NSObject get(String attribute) {
        return data.get(new NSString(attribute), NSObject.class);
    }
    public <T extends NativeObject> T get(String attribute, Class<T> type) {
        return data.get(new NSString(attribute), type);
    }
    public NSObject get(NSErrorUserInfoKey attribute) {
        return data.get(attribute.value(), NSObject.class);
    }
    public <T extends NativeObject> T get(NSErrorUserInfoKey attribute, Class<T> type) {
        return data.get(attribute.value(), type);
    }
    public boolean has(String attribute) {
        return data.containsKey(new NSString(attribute));
    }
    public boolean has(NSErrorUserInfoKey attribute) {
        return data.containsKey(attribute.value());
    }
    
    public NSError getUnderlyingError() {
        if (has(NSCocoaErrorUserInfoKey.UnderlyingError)) {
            NSError val = (NSError)get(NSCocoaErrorUserInfoKey.UnderlyingError);
            return val;
        }
        return null;
    }
    public NSErrorUserInfo setUnderlyingError(NSError error) {
        set(NSCocoaErrorUserInfoKey.UnderlyingError, error);
        return this;
    }
    public String getLocalizedDescription() {
        if (has(NSCocoaErrorUserInfoKey.LocalizedDescription)) {
            NSString val = (NSString)get(NSCocoaErrorUserInfoKey.LocalizedDescription);
            return val.toString();
        }
        return null;
    }
    public NSErrorUserInfo setLocalizedDescription(String description) {
        set(NSCocoaErrorUserInfoKey.LocalizedDescription, new NSString(description));
        return this;
    }
    public String getLocalizedFailureReason() {
        if (has(NSCocoaErrorUserInfoKey.LocalizedFailureReason)) {
            NSString val = (NSString)get(NSCocoaErrorUserInfoKey.LocalizedFailureReason);
            return val.toString();
        }
        return null;
    }
    public NSErrorUserInfo setLocalizedFailureReason(String reason) {
        set(NSCocoaErrorUserInfoKey.LocalizedFailureReason, new NSString(reason));
        return this;
    }
    public String getLocalizedRecoverySuggestion() {
        if (has(NSCocoaErrorUserInfoKey.LocalizedRecoverySuggestion)) {
            NSString val = (NSString)get(NSCocoaErrorUserInfoKey.LocalizedRecoverySuggestion);
            return val.toString();
        }
        return null;
    }
    public NSErrorUserInfo setLocalizedRecoverySuggestion(String suggestion) {
        set(NSCocoaErrorUserInfoKey.LocalizedRecoverySuggestion, new NSString(suggestion));
        return this;
    }
    @SuppressWarnings("unchecked")
    public List<String> getLocalizedRecoveryOptions() {
        if (has(NSCocoaErrorUserInfoKey.LocalizedRecoveryOptions)) {
            NSArray<NSString> val = (NSArray<NSString>)get(NSCocoaErrorUserInfoKey.LocalizedRecoveryOptions);
            return val.asStringList();
        }
        return null;
    }
    public NSErrorUserInfo setLocalizedRecoveryOptions(List<String> options) {
        set(NSCocoaErrorUserInfoKey.LocalizedRecoveryOptions, NSArray.fromStrings(options));
        return this;
    }
    public NSErrorRecoveryAttempting getRecoveryAttempter() {
        if (has(NSCocoaErrorUserInfoKey.RecoveryAttempter)) {
            NSErrorRecoveryAttempting val = (NSErrorRecoveryAttempting)get(NSCocoaErrorUserInfoKey.RecoveryAttempter);
            return val;
        }
        return null;
    }
    public NSErrorUserInfo setRecoveryAttempter(NSErrorRecoveryAttempting recovery) {
        set(NSCocoaErrorUserInfoKey.RecoveryAttempter, (NSObject)recovery);
        return this;
    }
    public String getHelpAnchor() {
        if (has(NSCocoaErrorUserInfoKey.HelpAnchor)) {
            NSString val = (NSString)get(NSCocoaErrorUserInfoKey.HelpAnchor);
            return val.toString();
        }
        return null;
    }
    public NSErrorUserInfo setHelpAnchor(String help) {
        set(NSCocoaErrorUserInfoKey.LocalizedRecoverySuggestion, new NSString(help));
        return this;
    }
    public NSStringEncoding getStringEncoding() {
        if (has(NSCocoaErrorUserInfoKey.StringEncoding)) {
            NSNumber val = (NSNumber)get(NSCocoaErrorUserInfoKey.StringEncoding);
            return NSStringEncoding.valueOf(val.longValue());
        }
        return null;
    }
    public NSErrorUserInfo setStringEncoding(NSStringEncoding encoding) {
        set(NSCocoaErrorUserInfoKey.StringEncoding, NSNumber.valueOf(encoding.value()));
        return this;
    }
    public String getFilePath() {
        if (has(NSCocoaErrorUserInfoKey.FilePath)) {
            NSString val = (NSString)get(NSCocoaErrorUserInfoKey.FilePath);
            return val.toString();
        }
        return null;
    }
    public NSErrorUserInfo setFilePath(String path) {
        set(NSCocoaErrorUserInfoKey.FilePath, new NSString(path));
        return this;
    }
    public NSURL getURL() {
        if (has(NSCocoaErrorUserInfoKey.URL)) {
            NSURL val = (NSURL)get(NSCocoaErrorUserInfoKey.URL);
            return val;
        }
        return null;
    }
    public NSErrorUserInfo setURL(NSURL url) {
        set(NSCocoaErrorUserInfoKey.URL, url);
        return this;
    }
    /*<methods>*/
    /*</methods>*/
    @Override
    public String toString() {
        if (data != null) return data.toString();
        return super.toString();
    }
}
