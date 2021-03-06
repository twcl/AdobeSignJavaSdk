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
 * DocumentPageInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class DocumentPageInfo {
  @SerializedName("height")
  private Double height = null;

  @SerializedName("index")
  private Integer index = null;

  @SerializedName("rotation")
  private Double rotation = null;

  @SerializedName("width")
  private Double width = null;

  public DocumentPageInfo height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the page
   * @return height
  **/
  @ApiModelProperty(value = "Height of the page")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public DocumentPageInfo index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Index of the page in combined document starting from 1
   * @return index
  **/
  @ApiModelProperty(value = "Index of the page in combined document starting from 1")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public DocumentPageInfo rotation(Double rotation) {
    this.rotation = rotation;
    return this;
  }

   /**
   * Rotation angle of the page in clockwise direction in degree
   * @return rotation
  **/
  @ApiModelProperty(value = "Rotation angle of the page in clockwise direction in degree")
  public Double getRotation() {
    return rotation;
  }

  public void setRotation(Double rotation) {
    this.rotation = rotation;
  }

  public DocumentPageInfo width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the page
   * @return width
  **/
  @ApiModelProperty(value = "Width of the page")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentPageInfo documentPageInfo = (DocumentPageInfo) o;
    return Objects.equals(this.height, documentPageInfo.height) &&
        Objects.equals(this.index, documentPageInfo.index) &&
        Objects.equals(this.rotation, documentPageInfo.rotation) &&
        Objects.equals(this.width, documentPageInfo.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, index, rotation, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPageInfo {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

