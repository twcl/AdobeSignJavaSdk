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


package com.adobe.sign.model.megaSigns;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * URLFileInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:49:16.276+05:30")
public class URLFileInfo {
  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  public URLFileInfo mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * The mime type of the referenced file, used to determine if the file can be accepted and the necessary conversion steps can be performed
   * @return mimeType
  **/
  @ApiModelProperty(value = "The mime type of the referenced file, used to determine if the file can be accepted and the necessary conversion steps can be performed")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public URLFileInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The original system file name of the document being sent
   * @return name
  **/
  @ApiModelProperty(value = "The original system file name of the document being sent")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public URLFileInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A publicly accessible URL for retrieving the raw file content
   * @return url
  **/
  @ApiModelProperty(value = "A publicly accessible URL for retrieving the raw file content")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URLFileInfo urLFileInfo = (URLFileInfo) o;
    return Objects.equals(this.mimeType, urLFileInfo.mimeType) &&
        Objects.equals(this.name, urLFileInfo.name) &&
        Objects.equals(this.url, urLFileInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeType, name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class URLFileInfo {\n");
    
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

