/*
*  Copyright 2016 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*/

package com.adobe.sign.model.agreements;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.agreements.InteractiveOptions;
import com.adobe.sign.model.agreements.DocumentCreationInfo;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:55.658+05:30")
public class AgreementCreationInfo   {
  
  private DocumentCreationInfo documentCreationInfo = null;
  private InteractiveOptions options = null;

  
  /**
   * Information about the document you want to send
   **/
  @ApiModelProperty(required = true, value = "Information about the document you want to send")
  @JsonProperty("documentCreationInfo")
  public DocumentCreationInfo getDocumentCreationInfo() {
    return documentCreationInfo;
  }
  public void setDocumentCreationInfo(DocumentCreationInfo documentCreationInfo) {
    this.documentCreationInfo = documentCreationInfo;
  }

  
  /**
   * Options for authoring and sending the agreement
   **/
  @ApiModelProperty(value = "Options for authoring and sending the agreement")
  @JsonProperty("options")
  public InteractiveOptions getOptions() {
    return options;
  }
  public void setOptions(InteractiveOptions options) {
    this.options = options;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementCreationInfo {\n");
    
    sb.append("    documentCreationInfo: ").append(StringUtil.toIndentedString(documentCreationInfo)).append("\n");
    sb.append("    options: ").append(StringUtil.toIndentedString(options)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
