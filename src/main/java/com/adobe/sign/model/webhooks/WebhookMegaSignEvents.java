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
 * WebhookMegaSignEvents
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:49:53.118+05:30")
public class WebhookMegaSignEvents {
  @SerializedName("includeDetailedInfo")
  private Boolean includeDetailedInfo = null;

  public WebhookMegaSignEvents includeDetailedInfo(Boolean includeDetailedInfo) {
    this.includeDetailedInfo = includeDetailedInfo;
    return this;
  }

   /**
   * Determines whether megaign detailed info will be returned in the response payload
   * @return includeDetailedInfo
  **/
  @ApiModelProperty(value = "Determines whether megaign detailed info will be returned in the response payload")
  public Boolean isIncludeDetailedInfo() {
    return includeDetailedInfo;
  }

  public void setIncludeDetailedInfo(Boolean includeDetailedInfo) {
    this.includeDetailedInfo = includeDetailedInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookMegaSignEvents webhookMegaSignEvents = (WebhookMegaSignEvents) o;
    return Objects.equals(this.includeDetailedInfo, webhookMegaSignEvents.includeDetailedInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeDetailedInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookMegaSignEvents {\n");
    
    sb.append("    includeDetailedInfo: ").append(toIndentedString(includeDetailedInfo)).append("\n");
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
