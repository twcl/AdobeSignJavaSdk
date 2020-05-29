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


package com.adobe.sign.model.agreements;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * ComposeViewConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class ComposeViewConfiguration {
  @SerializedName("fileUploadOptions")
  private FileUploadOptions fileUploadOptions = null;

  @SerializedName("isPreviewSelected")
  private Boolean isPreviewSelected = null;

  public ComposeViewConfiguration fileUploadOptions(FileUploadOptions fileUploadOptions) {
    this.fileUploadOptions = fileUploadOptions;
    return this;
  }

   /**
   * Controls various file upload options available on the compose page
   * @return fileUploadOptions
  **/
  @ApiModelProperty(value = "Controls various file upload options available on the compose page")
  public FileUploadOptions getFileUploadOptions() {
    return fileUploadOptions;
  }

  public void setFileUploadOptions(FileUploadOptions fileUploadOptions) {
    this.fileUploadOptions = fileUploadOptions;
  }

  public ComposeViewConfiguration isPreviewSelected(Boolean isPreviewSelected) {
    this.isPreviewSelected = isPreviewSelected;
    return this;
  }

   /**
   * Should the compose page be provided with authoring mode selected?
   * @return isPreviewSelected
  **/
  @ApiModelProperty(value = "Should the compose page be provided with authoring mode selected?")
  public Boolean isIsPreviewSelected() {
    return isPreviewSelected;
  }

  public void setIsPreviewSelected(Boolean isPreviewSelected) {
    this.isPreviewSelected = isPreviewSelected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComposeViewConfiguration composeViewConfiguration = (ComposeViewConfiguration) o;
    return Objects.equals(this.fileUploadOptions, composeViewConfiguration.fileUploadOptions) &&
        Objects.equals(this.isPreviewSelected, composeViewConfiguration.isPreviewSelected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileUploadOptions, isPreviewSelected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComposeViewConfiguration {\n");
    
    sb.append("    fileUploadOptions: ").append(toIndentedString(fileUploadOptions)).append("\n");
    sb.append("    isPreviewSelected: ").append(toIndentedString(isPreviewSelected)).append("\n");
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
