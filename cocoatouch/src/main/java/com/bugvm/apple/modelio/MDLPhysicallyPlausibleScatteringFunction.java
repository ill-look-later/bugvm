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
package com.bugvm.apple.modelio;

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
import com.bugvm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLPhysicallyPlausibleScatteringFunction/*</name>*/ 
    extends /*<extends>*/MDLScatteringFunction/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLPhysicallyPlausibleScatteringFunctionPtr extends Ptr<MDLPhysicallyPlausibleScatteringFunction, MDLPhysicallyPlausibleScatteringFunctionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLPhysicallyPlausibleScatteringFunction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLPhysicallyPlausibleScatteringFunction() {}
    protected MDLPhysicallyPlausibleScatteringFunction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "version")
    public native @MachineSizedSInt long getVersion();
    @Property(selector = "subsurface")
    public native MDLMaterialProperty getSubsurface();
    @Property(selector = "metallic")
    public native MDLMaterialProperty getMetallic();
    @Property(selector = "specularAmount")
    public native MDLMaterialProperty getSpecularAmount();
    @Property(selector = "specularTint")
    public native MDLMaterialProperty getSpecularTint();
    @Property(selector = "roughness")
    public native MDLMaterialProperty getRoughness();
    @Property(selector = "anisotropic")
    public native MDLMaterialProperty getAnisotropic();
    @Property(selector = "anisotropicRotation")
    public native MDLMaterialProperty getAnisotropicRotation();
    @Property(selector = "sheen")
    public native MDLMaterialProperty getSheen();
    @Property(selector = "sheenTint")
    public native MDLMaterialProperty getSheenTint();
    @Property(selector = "clearcoat")
    public native MDLMaterialProperty getClearcoat();
    @Property(selector = "clearcoatGloss")
    public native MDLMaterialProperty getClearcoatGloss();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
