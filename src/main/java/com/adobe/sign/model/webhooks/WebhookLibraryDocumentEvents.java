/**
*  Copyright 2019 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*
**/


/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.adobe.sign.model.webhooks;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * WebhookLibraryDocumentEvents
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:49:53.118+05:30")
public class WebhookLibraryDocumentEvents {
  @SerializedName("includeDetailedInfo")
  private Boolean includeDetailedInfo = null;

  @SerializedName("includeDocumentsInfo")
  private Boolean includeDocumentsInfo = null;

  public WebhookLibraryDocumentEvents includeDetailedInfo(Boolean includeDetailedInfo) {
    this.includeDetailedInfo = includeDetailedInfo;
    return this;
  }

   /**
   * Determines whether agreement detailed info will be returned in the response payload
   * @return includeDetailedInfo
  **/
  @ApiModelProperty(value = "Determines whether agreement detailed info will be returned in the response payload")
  public Boolean isIncludeDetailedInfo() {
    return includeDetailedInfo;
  }

  public void setIncludeDetailedInfo(Boolean includeDetailedInfo) {
    this.includeDetailedInfo = includeDetailedInfo;
  }

  public WebhookLibraryDocumentEvents includeDocumentsInfo(Boolean includeDocumentsInfo) {
    this.includeDocumentsInfo = includeDocumentsInfo;
    return this;
  }

   /**
   * Determines whether document info will be returned in the response payload
   * @return includeDocumentsInfo
  **/
  @ApiModelProperty(value = "Determines whether document info will be returned in the response payload")
  public Boolean isIncludeDocumentsInfo() {
    return includeDocumentsInfo;
  }

  public void setIncludeDocumentsInfo(Boolean includeDocumentsInfo) {
    this.includeDocumentsInfo = includeDocumentsInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookLibraryDocumentEvents webhookLibraryDocumentEvents = (WebhookLibraryDocumentEvents) o;
    return Objects.equals(this.includeDetailedInfo, webhookLibraryDocumentEvents.includeDetailedInfo) &&
        Objects.equals(this.includeDocumentsInfo, webhookLibraryDocumentEvents.includeDocumentsInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeDetailedInfo, includeDocumentsInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookLibraryDocumentEvents {\n");
    
    sb.append("    includeDetailedInfo: ").append(toIndentedString(includeDetailedInfo)).append("\n");
    sb.append("    includeDocumentsInfo: ").append(toIndentedString(includeDocumentsInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
