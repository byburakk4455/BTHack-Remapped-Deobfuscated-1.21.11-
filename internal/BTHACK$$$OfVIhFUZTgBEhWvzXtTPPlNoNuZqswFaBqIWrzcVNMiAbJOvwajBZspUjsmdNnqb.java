/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.bthack.loader.api.resource.Resource
 * com.ferra13671.cometrenderer.glsl.shader.GLShader
 * com.ferra13671.cometrenderer.glsl.shader.ShaderType
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV;
import com.ferra13671.bthack.loader.api.resource.Resource;
import com.ferra13671.cometrenderer.glsl.shader.GLShader;
import com.ferra13671.cometrenderer.glsl.shader.ShaderType;

public class BTHACK$$$OfVIhFUZTgBEhWvzXtTPPlNoNuZqswFaBqIWrzcVNMiAbJOvwajBZspUjsmdNnqb {
 public final GLShader TmqDlXQlbPMkGBMkJTBblSdIRpGCVBZm;
 public final GLShader OyDryQJOIqFIqNDJtRdqhttygKgzDKui;
 public final GLShader vI_ZYrayDPlTVbDQMylCsNDLzUHCpwdQ;
 public final GLShader vbFETavHYvweevywXPTWBnBbxudOBznI;

 public BTHACK$$$OfVIhFUZTgBEhWvzXtTPPlNoNuZqswFaBqIWrzcVNMiAbJOvwajBZspUjsmdNnqb() {
 this.TmqDlXQlbPMkGBMkJTBblSdIRpGCVBZm = BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.pYascbeHlOQuWtQWDEksyAyYyhwZfnsD.createShaderBuilder().info("rounded-outlined.vertex", (Object)new Resource("bthack-client", "shaders/impl/rounded-outlined.vert"), ShaderType.Vertex).build();
 this.OyDryQJOIqFIqNDJtRdqhttygKgzDKui = BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.pYascbeHlOQuWtQWDEksyAyYyhwZfnsD.createShaderBuilder().info("rounded-outlined.fragment", (Object)new Resource("bthack-client", "shaders/impl/rounded-outlined.frag"), ShaderType.Fragment).build();
 this.vI_ZYrayDPlTVbDQMylCsNDLzUHCpwdQ = BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.pYascbeHlOQuWtQWDEksyAyYyhwZfnsD.createShaderBuilder().info("rounded-shadow.fragment", (Object)new Resource("bthack-client", "shaders/impl/rounded-shadow.frag"), ShaderType.Fragment).build();
 this.vbFETavHYvweevywXPTWBnBbxudOBznI = BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.pYascbeHlOQuWtQWDEksyAyYyhwZfnsD.createShaderBuilder().info("blit-with-alpha.fragment", (Object)new Resource("bthack-client", "shaders/impl/blit-with-alpha.frag"), ShaderType.Fragment).sampler("u_Texture").build();
 }
}

